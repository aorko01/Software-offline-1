package Identification;

public class NFC implements Identification {
    @Override
    public void identify() {
        System.out.println("NFC identification is being used");
    }
}