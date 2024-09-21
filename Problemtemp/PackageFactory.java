// Interface for creating ticketing system components
public interface PackageFactory {
    void addMicrocontroller();
    void addDisplay();
}

// Concrete Factory for Basic Package
class BasicPackageFactory implements PackageFactory {
    @Override
    public void addMicrocontroller() {
        System.out.println("ATMega32 has been added to the system.");
    }

    @Override
    public void addDisplay() {
        System.out.println("LCD display has been added to the system.");
    }
}

// Concrete Factory for Standard Package
class StandardPackageFactory implements PackageFactory {
    @Override
    public void addMicrocontroller() {
        System.out.println("Arduino Mega has been added to the system.");
    }

    @Override
    public void addDisplay() {
        System.out.println("LED display has been added to the system.");
    }
}

// Concrete Factory for Advanced Package
class AdvancedPackageFactory implements PackageFactory {
    @Override
    public void addMicrocontroller() {
        System.out.println("Raspberry Pi has been added to the system.");
    }

    @Override
    public void addDisplay() {
        System.out.println("OLED display has been added to the system.");
    }
}

// Concrete Factory for Premium Package
class PremiumPackageFactory implements PackageFactory {
    @Override
    public void addMicrocontroller() {
        System.out.println("Raspberry Pi has been added to the system.");
    }

    @Override
    public void addDisplay() {
        System.out.println("Touch screen display has been added to the system.");
    }
}
