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

        GPU rtx4060 = new GPU("NVIDIA GeForce GTX 4060", 8, 115, 1830, 2460, 
                              "GDDR6", 300, true, true);
        rtx4060.definirFps("Cyberpunk 2077", 90);
        rtx4060.definirFps("CS2", 150);
        
        
        GPU gtx1650 = new GPU("NVIDIA GeForce GTX 1650", 4, 75, 1485, 1665, 
                "GDDR5", 300, false, false);
        gtx1650.definirFps("Cyberpunk 2077", 45);
        gtx1650.definirFps("CS2", 65);
        
        GPU rtx3060 = new GPU("NVIDIA GeForce RTX 3060", 12, 170, 1320, 1777, 
                "GDDR6", 450, true, false);
        rtx3060.definirFps("Cyberpunk 2077", 75);
        rtx3060.definirFps("CS2", 130);
        
        GPU gtx1050TI = new GPU("NVIDIA GeForce GTX 1050TI", 4, 75, 1291, 1392, 
                "GDDR5", 250, false, false);
        gtx1050TI.definirFps("Cyberpunk 2077", 24);
        gtx1050TI.definirFps("CS2", 40);


       

        // Adicione as GPUs restantes
        // Exemplo: GPU radeonGraphics = new GPU("AMD Radeon Graphics", ...);

        gpus.add(rx580);
        gpus.add(rtx4060);
        gpus.add(gtx1650);
        gpus.add(rtx3060);
        gpus.add(gtx1050TI);
        
        // Adicione as GPUs restantes à lista

        return gpus;
    }
}
