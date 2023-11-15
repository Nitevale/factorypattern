//
public class Main {
    public static void main(String[] args) {
        ElectronicDeviceFactory deviceFactory = new ElectronicDeviceFactory();

        ElectronicDevice laptop = deviceFactory.createDevice("Laptop");
        laptop.turnOn();
        laptop.turnOff();

        ElectronicDevice smartphone = deviceFactory.createDevice("Smartphone");
        smartphone.turnOn();
        smartphone.turnOff();

        ElectronicDevice smartTV = deviceFactory.createDevice("SmartTV");
        smartTV.turnOn();
        smartTV.turnOff();
    }
}
