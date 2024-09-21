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
    }

    @Override
    public void createDisplay() {
        led = new Led();
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
