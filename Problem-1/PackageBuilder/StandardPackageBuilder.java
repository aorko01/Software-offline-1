package PackageBuilder;
import Microcontroller.Arduiono;
import Display.Led;
import Identification.RFID; 
import Storage.Ssd;
import Controller.Separate;

public class StandardPackageBuilder implements PackageBuilder {
    Arduiono arduino;
    Led led;
    RFID rfid;
    Ssd ssd;
    Separate separate;

    // Implementing methods from the PackageBuilder interface

    @Override
    public void createMicrocontroller() {
        arduino = new Arduiono();
        arduino.control();
    }

    @Override
    public void createDisplay() {
        led = new Led();
        led.returnDisplay();
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
