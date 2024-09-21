package Display;

public class Led implements Display {
    @Override
    public void returnDisplay() {
        System.out.println("Led display is displaying the device");
    }
}
