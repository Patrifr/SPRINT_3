package N3_Callback.Payments;

public class Paypal implements Payment{

    @Override
    public void makePayment() {
        System.out.println("Processing payment with Paypal...");
    }
}
