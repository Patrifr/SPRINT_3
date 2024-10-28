package N3_Callback.Payments;

public class PaymentGateway {
    public void processPayment(Payment payment){
        payment.makePayment();
        System.out.println("Payment successfully completed.");
    }
}
