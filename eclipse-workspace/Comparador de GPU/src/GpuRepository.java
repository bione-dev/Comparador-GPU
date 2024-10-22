import java.util.ArrayList;
import java.util.List;

public class GpuRepository {

    // Método para retornar a lista de GPUs disponíveis
    public static List<GPU> getGpusDisponiveis() {
        List<GPU> gpus = new ArrayList<>();

        // Adiciona GPUs à lista e define FPS para dois jogos
        GPU rx580 = new GPU("AMD Radeon RX 580", 8, 185, 1257, 1340, 
                            "GDDR5", 500, false, false);
        rx580.definirFps("Cyberpunk 2077", 50);
        rx580.definirFps("CS2", 80);

        GPU gtx1650 = new GPU("NVIDIA GeForce GTX 1650", 4, 75, 1485, 1665, 
                              "GDDR5", 300, false, false);
        gtx1650.definirFps("Cyberpunk 2077", 45);
        gtx1650.definirFps("CS2", 65);

       

        // Adicione as GPUs restantes
        // Exemplo: GPU radeonGraphics = new GPU("AMD Radeon Graphics", ...);

        gpus.add(rx580);
        gpus.add(gtx1650);
        
        // Adicione as GPUs restantes à lista

        return gpus;
    }
}
