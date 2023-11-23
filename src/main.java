
public class main {

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();

        MobileFactory factory = new MobileFactory();
        OS phone = factory.getPhone("IPhone");
        phone.type();

        PCBuilder builder = new PCBuilder();
        PC pc = builder
                .setColor("Ruzova")
                .setRAM(16)
                .setCPU("Ryzen")
                .setGPU("1060")
                .setCPUCore(8)
                .getPC();

        System.out.println(pc);
    }

}
