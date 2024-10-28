package N3_Callback.Payments;

public class Card implements Payment{
    @Override
    public void makePayment() {
        System.out.println("Processing payment with card...");
    }
}
