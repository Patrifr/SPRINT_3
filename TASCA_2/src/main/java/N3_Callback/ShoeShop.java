package N3_Callback;

import N3_Callback.Payments.*;

public class ShoeShop {

    public static void startShopApp(){
        PaymentGateway paymentGateway = new PaymentGateway();
        Payment paypal = new Paypal();
        Payment card = new Card();
        Payment bank = new BankAccount();

        paymentGateway.processPayment(paypal);
        paymentGateway.processPayment(card);
        paymentGateway.processPayment(bank);
    }

}
