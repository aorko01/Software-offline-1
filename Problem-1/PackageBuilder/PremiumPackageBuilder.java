import Microcontroller.RasberryPi;
import Identification.NFC;
import Display.TouchScreen;
import Storage.BuiltIn;
import Controller.Touch;

public class PremiumPackageBuilder implements PackageBuilder {
    RasberryPi raspberryPi;
    TouchScreen touchScreen;
    NFC nfc;
    BuiltIn builtIn;
    Touch touch;

    // Implementing methods from the PackageBuilder interface

    @Override
    public void createMicrocontroller() {
        raspberryPi = new RasberryPi();
    }

    @Override
    public void createDisplay() {
        touchScreen = new TouchScreen();
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
        touch = new Touch();
    }
}
