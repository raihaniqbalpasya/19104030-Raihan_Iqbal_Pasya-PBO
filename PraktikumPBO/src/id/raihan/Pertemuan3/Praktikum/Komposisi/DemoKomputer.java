package id.raihan.Pertemuan3.Praktikum.Komposisi;

public class DemoKomputer {
    public static void main(String[] args) {
        Komputer komputer = new Komputer("Gaming");

        Keyboard keyboard = new Keyboard("Sades", "Mechanical");
        Mouse mouse = new Mouse("Razer", "800");
        Monitor monitor = new Monitor("Armmageddon", "24", "144");
        Cpu cpu = new Cpu("Intel core i7", "Nvidia 3070", "16");

        komputer.addComponent(keyboard, mouse, monitor, cpu);

        System.out.println("Type Komputer\t: " + komputer.getType());
        System.out.println();

        System.out.println("Keyboard\t: ");
        komputer.getKeyboard().PrintSpec();

        System.out.println("Mouse\t: ");
        komputer.getMouse().PrintSpec();

        System.out.println("Monitor\t: ");
        komputer.getMonitor().PrintSpec();

        System.out.println("CPU\t: ");
        komputer.getCpu().PrintSpec();
    }
}
