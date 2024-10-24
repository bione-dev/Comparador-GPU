import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<GPU> gpus = GpuRepository.getGpusDisponiveis(); // Obtém a lista de GPUs disponíveis
        boolean continuar = true;

        while (continuar) {
            // Exibe as GPUs disponíveis
            System.out.println("GPUs disponíveis:");
            for (int i = 0; i < gpus.size(); i++) {
                System.out.println((i + 1) + ". " + gpus.get(i).getNome());
            }

            // Solicita ao usuário para escolher duas GPUs
            System.out.print("Escolha a primeira GPU (número): ");
            int escolha1 = scanner.nextInt() - 1; // -1 para ajustar o índice (baseado em zero)
            System.out.print("Escolha a segunda GPU (número): ");
            int escolha2 = scanner.nextInt() - 1;

            // Obtém as GPUs escolhidas
            GPU gpu1 = gpus.get(escolha1);
            GPU gpu2 = gpus.get(escolha2);

            // Exibe detalhes e FPS das GPUs em quatro jogos
            System.out.println("\nDetalhes da GPU 1:");
            System.out.println(gpu1.detalhes());
            int fpsGpu1Jogo1 = gpu1.estimarFps("Cyberpunk 2077");
            int fpsGpu1Jogo2 = gpu1.estimarFps("CS2");
            int fpsGpu1Jogo3 = gpu1.estimarFps("Hogwarts Legacy"); // Novo jogo adicionado
            int fpsGpu1Jogo4 = gpu1.estimarFps("Red Dead Redemption 2"); // Novo jogo adicionado
            System.out.println("FPS estimado para Cyberpunk 2077: " + fpsGpu1Jogo1 + " FPS");
            System.out.println("FPS estimado para CS2: " + fpsGpu1Jogo2 + " FPS");
            System.out.println("FPS estimado para Hogwarts Legacy: " + fpsGpu1Jogo3 + " FPS");
            System.out.println("FPS estimado para Red Dead Redemption 2: " + fpsGpu1Jogo4 + " FPS"); // Novo FPS

            System.out.println("\nDetalhes da GPU 2:");
            System.out.println(gpu2.detalhes());
            int fpsGpu2Jogo1 = gpu2.estimarFps("Cyberpunk 2077");
            int fpsGpu2Jogo2 = gpu2.estimarFps("CS2");
            int fpsGpu2Jogo3 = gpu2.estimarFps("Hogwarts Legacy"); // Novo Jogo adicionado
            int fpsGpu2Jogo4 = gpu2.estimarFps("Red Dead Redemption 2"); // Novo jogo adicionado
            System.out.println("FPS estimado para Cyberpunk 2077: " + fpsGpu2Jogo1 + " FPS");
            System.out.println("FPS estimado para CS2: " + fpsGpu2Jogo2 + " FPS");
            System.out.println("FPS estimado para Hogwarts Legacy: " + fpsGpu2Jogo2 + " FPS");
            System.out.println("FPS estimado para Red Dead Redemption 2: " + fpsGpu2Jogo4 + " FPS"); // Novo FPS

            // Comparação de desempenho
            int[] fpsGpu1 = {fpsGpu1Jogo1, fpsGpu1Jogo2, fpsGpu1Jogo3, fpsGpu1Jogo4}; // FPS da GPU 1
            int[] fpsGpu2 = {fpsGpu2Jogo1, fpsGpu2Jogo2, fpsGpu2Jogo3, fpsGpu2Jogo4}; // FPS da GPU 2
            String[] nomesJogos = {"Cyberpunk 2077", "CS2", "Hogwarts Legacy", "Red Dead Redemption 2"}; // Array Nomes dos jogos

            compararDesempenhoEmJogos(fpsGpu1, fpsGpu2, gpu1.getNome(), gpu2.getNome(), nomesJogos); // Chama o método de comparação

            // Pergunta se o usuário deseja voltar
            System.out.print("\nDeseja voltar ao menu? (s/n): ");
            char opcao = scanner.next().charAt(0);
            continuar = (opcao == 's' || opcao == 'S'); // Continua se o usuário escolher 's' ou 'S'
        }

        scanner.close(); // Fecha o scanner
    }

    // Método para comparar desempenho em vários jogos
    private static void compararDesempenhoEmJogos(int[] fps1, int[] fps2, String nomeGpu1, String nomeGpu2, String[] nomesJogos) {
        for (int i = 0; i < fps1.length; i++) {
            compararDesempenho(fps1[i], fps2[i], nomeGpu1, nomeGpu2, nomesJogos[i]); // Compara o FPS de cada jogo
        }
    }

    // Método para comparar desempenho em um jogo
    private static void compararDesempenho(int fps1, int fps2, String nomeGpu1, String nomeGpu2, String nomeJogo) {
        if (fps1 > fps2) {
            double percentual = ((double) fps1 / fps2 - 1) * 100;
            System.out.printf("%s tem %.2f%% a mais de FPS que %s em %s.\n", nomeGpu1, percentual, nomeGpu2, nomeJogo);
        } else if (fps2 > fps1) {
            double percentual = ((double) fps2 / fps1 - 1) * 100;
            System.out.printf("%s tem %.2f%% a mais de FPS que %s em %s.\n", nomeGpu2, percentual, nomeGpu1, nomeJogo);
        } else {
            System.out.printf("%s e %s têm o mesmo FPS em %s.\n", nomeGpu1, nomeGpu2, nomeJogo);
        }
    }
}
