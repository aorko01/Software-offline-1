package PackageBuilder;
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
        atMega_32.control();
    }

    @Override
    public void createDisplay() {
        lcd = new Lcd();
        lcd.returnDisplay();
    }

    @Override
    public void createIdentification() {
        rfid = new RFID();
        rfid.identify();
    }

    @Override
    public void createStorage() {
        ssd = new Ssd();
        ssd.createStorage();
    }

    @Override
    public void createController() {
        separate = new Separate();
        separate.control();
    }
}
