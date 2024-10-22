import java.util.HashMap;
import java.util.Map;

public class GPU {
    private String nome;
    private int vram; // em GB
    private int consumo; // em Watts
    private double clockBase; // em MHz
    private double clockBoost; // em MHz
    private String tipoMemoria; // Exemplo: "GDDR6"
    private int requisitosFonte; // em Watts
    private boolean suportaRayTracing;
    private boolean suportaFrameGenerator; // FG

    private Map<String, Integer> desempenhoEmJogos; // Map para armazenar FPS por jogo

    // Construtor
    public GPU(String nome, int vram, int consumo, double clockBase, double clockBoost, 
               String tipoMemoria, int requisitosFonte, boolean suportaRayTracing, 
               boolean suportaFrameGenerator) {
        this.nome = nome;
        this.vram = vram;
        this.consumo = consumo;
        this.clockBase = clockBase;
        this.clockBoost = clockBoost;
        this.tipoMemoria = tipoMemoria;
        this.requisitosFonte = requisitosFonte;
        this.suportaRayTracing = suportaRayTracing;
        this.suportaFrameGenerator = suportaFrameGenerator;
        this.desempenhoEmJogos = new HashMap<>();
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getVram() {
        return vram;
    }

    public int getConsumo() {
        return consumo;
    }

    public double getClockBase() {
        return clockBase;
    }

    public double getClockBoost() {
        return clockBoost;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public int getRequisitosFonte() {
        return requisitosFonte;
    }

    public boolean isSuportaRayTracing() {
        return suportaRayTracing;
    }

    public boolean isSuportaFrameGenerator() {
        return suportaFrameGenerator;
    }

    // Método para mostrar detalhes da GPU
    public String detalhes() {
        return String.format("GPU: %s\nVRAM: %d GB\nConsumo: %d Watts\nClock Base: %.1f MHz\nClock Boost: %.1f MHz\nTipo de Memória: %s\nRequisitos de Fonte: %d Watts\nSuporta Ray Tracing: %b\nSuporta Frame Generator: %b\n",
                             nome, vram, consumo, clockBase, clockBoost, tipoMemoria, requisitosFonte, suportaRayTracing, suportaFrameGenerator);
    }

    // Método para definir FPS para um jogo
    public void definirFps(String jogo, int fps) {
        desempenhoEmJogos.put(jogo, fps);
    }

    // Método para estimar o FPS em um jogo
    public int estimarFps(String jogo) {
        return desempenhoEmJogos.getOrDefault(jogo, 0); // Retorna 0 se o jogo não estiver definido
    }
}
