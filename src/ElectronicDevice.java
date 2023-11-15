//
interface ElectronicDevice {
    void turnOn();
    void turnOff();
}

// Laptop class
class Laptop implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Laptop is starting up");
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop is shutting down");
    }
}

// Smartphone class
class Smartphone implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Smartphone is booting up");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is powering off");
    }
}

// SmartTV class
class SmartTV implements ElectronicDevice {
    @Override
    public void turnOn() {
        System.out.println("Smart TV is powering on");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV is turning off");
    }
}
