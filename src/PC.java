public class PC {
    private String color;
    private int RAM;
    private String CPU;
    private String GPU;
    private int CPUCore;

    public PC(String color, int RAM, String CPU, String GPU, int CPUCore) {
        this.color = color;
        this.RAM = RAM;
        this.CPU = CPU;
        this.GPU = GPU;
        this.CPUCore = CPUCore;
    }

    @Override
    public String toString() {
        return "PC{" +
                "color='" + color + '\'' +
                ", RAM=" + RAM +
                ", CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", CPUCore=" + CPUCore +
                '}';
    }
}
