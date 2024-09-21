package Payments;

public class Cash implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Cash payment is being used");
    }
}