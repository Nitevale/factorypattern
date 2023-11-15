// ElectronicDeviceFactory.java
class ElectronicDeviceFactory {
    ElectronicDevice createDevice(String deviceType) {
        switch (deviceType) {
            case "Laptop":
                return new Laptop();
            case "Smartphone":
                return new Smartphone();
            case "SmartTV":
                return new SmartTV();
            default:
                throw new IllegalArgumentException("Invalid device type");
        }
    }
}
