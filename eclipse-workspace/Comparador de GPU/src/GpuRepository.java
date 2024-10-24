import java.util.ArrayList;
import java.util.List;

public class GpuRepository {

    // Método para retornar a lista de GPUs disponíveis
    public static List<GPU> getGpusDisponiveis() {
        List<GPU> gpus = new ArrayList<>();

        // Adiciona GPUs à lista e define FPS para dois jogos
        GPU rx580 = new GPU("AMD Radeon RX 580", 8, 185, 1257, 1340, 
                            "GDDR5", 500, false, false);
        rx580.definirFps("Cyberpunk 2077", 35);
        rx580.definirFps("CS2", 55);
        rx580.definirFps("Hogwarts Legacy", 50);
        rx580.definirFps("Red Dead Redemption 2", 40);

        GPU rtx4060 = new GPU("NVIDIA GeForce GTX 4060", 8, 115, 1830, 2460, 
                              "GDDR6", 300, true, true);
        rtx4060.definirFps("Cyberpunk 2077", 90);
        rtx4060.definirFps("CS2", 150);
        rtx4060.definirFps("Hogwarts Legacy", 149);
        rtx4060.definirFps("Red Dead Redemption 2", 85);


        
        
        GPU gtx1650 = new GPU("NVIDIA GeForce GTX 1650", 4, 75, 1485, 1665, 
                "GDDR5", 300, false, false);
        gtx1650.definirFps("Cyberpunk 2077", 30);
        gtx1650.definirFps("CS2", 50);
        gtx1650.definirFps("Hogwarts Legacy", 40);
        gtx1650.definirFps("Red Dead Redemption 2", 34);


        
        GPU rtx3060 = new GPU("NVIDIA GeForce RTX 3060", 12, 170, 1320, 1777, 
                "GDDR6", 450, true, false);
        rtx3060.definirFps("Cyberpunk 2077", 75);
        rtx3060.definirFps("CS2", 130);
        rtx3060.definirFps("Hogwarts Legacy", 110);
        rtx3060.definirFps("Red Dead Redemption 2", 75);


        
        GPU gtx1050TI = new GPU("NVIDIA GeForce GTX 1050TI", 4, 75, 1291, 1392, 
                "GDDR5", 250, false, false);
        gtx1050TI.definirFps("Cyberpunk 2077", 24);
        gtx1050TI.definirFps("CS2", 40);
        gtx1050TI.definirFps("Hogwarts Legacy", 30);
        gtx1050TI.definirFps("Red Dead Redemption 2", 22);


        
        
        GPU rtx4090  = new GPU("NVIDIA GeForce RTX 4090 ", 24, 450, 2235, 2520, 
                "GDDR6X", 850, true, true);
        rtx4090.definirFps("Cyberpunk 2077", 214);
        rtx4090.definirFps("CS2", 186); 
        rtx4090.definirFps("Hogwarts Legacy", 269);
        rtx4090.definirFps("Red Dead Redemption 2", 160);


        
        GPU UHDGraphics   = new GPU("Intel UHD Graphics ", 0, 10, 350, 750, 
                "Compartilhado", 0, false, false);
        UHDGraphics.definirFps("Cyberpunk 2077", 6);
        UHDGraphics.definirFps("CS2", 18);
        UHDGraphics.definirFps("Hogwarts Legacy", 11);
        UHDGraphics.definirFps("Red Dead Redemption 2", 9);


       

        
       

        // Adicione as GPUs restantes
        // Exemplo: GPU radeonGraphics = new GPU("AMD Radeon Graphics", ...);

        gpus.add(rx580);
        gpus.add(rtx4060);
        gpus.add(gtx1650);
        gpus.add(rtx3060);
        gpus.add(gtx1050TI);
        gpus.add(rtx4090);
        gpus.add(UHDGraphics);
        
        // Adicione as GPUs restantes à lista

        return gpus;
    }
}
