import Microcontroller.RasberryPi;
import Identification.NFC;
import Display.Oled;
import Storage.BuiltIn;
import Controller.Separate;

public class AdvancedPackageBuilder implements PackageBuilder {
    RasberryPi raspberryPi;
    Oled oled;
    NFC nfc;
    BuiltIn builtIn;
    Separate separate;

    // Implementing methods from PackageBuilder

    @Override
    public void createMicrocontroller() {
        raspberryPi = new RasberryPi();
    }

    @Override
    public void createDisplay() {
        oled = new Oled();
    }

    @Override
    public void createIdentification() {
        nfc = new NFC();
    }

    @Override
    public void createStorage() {
        builtIn = new BuiltIn();
    }

    @Override
    public void createController() {
        separate = new Separate();
    }
}