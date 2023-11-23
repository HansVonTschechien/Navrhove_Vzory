public class Singleton {

    static Singleton instance = new Singleton();

    public Singleton() {

    }

    public static Singleton getInstance() { return instance; }
}
