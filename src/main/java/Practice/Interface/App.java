package Practice.Interface;

public class App {
    public static void main(String[] args) {
        Developer dev = new Developer(19, "Albert");
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        dev.work(laptop);
        dev.work(desktop);


    }
}
