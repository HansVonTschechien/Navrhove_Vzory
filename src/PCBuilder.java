public class PCBuilder {
    private String color;
    private int RAM;
    private String CPU;
    private String GPU;
    private int CPUCore;

    public PCBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public PCBuilder setRAM(int RAM) {
        this.RAM = RAM;
        return this;
    }

    public PCBuilder setCPU(String CPU) {
        this.CPU = CPU;
        return this;
    }

    public PCBuilder setGPU(String GPU) {
        this.GPU = GPU;
        return this;
    }

    public PCBuilder setCPUCore(int CPUCore) {
        this.CPUCore = CPUCore;
        return this;
    }
    public PC getPC(){
        return new PC(color,RAM,CPU,GPU,CPUCore);
    }
}
