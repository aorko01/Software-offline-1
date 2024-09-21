import Microcontroller.AtMega_32;
import Display.Lcd;
import Identification.RFID;
import Storage.Ssd;
import Controller.Separate;

public class BasicPackageBuilder implements PackageBuilder {
    AtMega_32 atMega_32;
    Lcd lcd;
    RFID rfid;
    Ssd ssd;
    Separate separate;

    // Implementing methods from the PackageBuilder interface

    @Override
    public void createMicrocontroller() {
        atMega_32 = new AtMega_32();
    }

    @Override
    public void createDisplay() {
        lcd = new Lcd();
    }

    @Override
    public void createIdentification() {
        rfid = new RFID();
    }

    @Override
    public void createStorage() {
        ssd = new Ssd();
    }

    @Override
    public void createController() {
        separate = new Separate();
    }
}
