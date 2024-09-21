package PackageBuilder;
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
        raspberryPi.control();
    }

    @Override
    public void createDisplay() {
        touchScreen = new TouchScreen();
        touchScreen.returnDisplay();
    }

    @Override
    public void createIdentification() {
        nfc = new NFC();
        nfc.identify();
    }

    @Override
    public void createStorage() {
        builtIn = new BuiltIn();
        builtIn.createStorage();
    }

    @Override
    public void createController() {
        touch = new Touch();
        touch.control();
    }
}
