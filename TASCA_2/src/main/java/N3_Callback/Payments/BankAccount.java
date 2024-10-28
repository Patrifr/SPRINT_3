package N3_Callback.Payments;

public class BankAccount implements Payment{

    @Override
    public void makePayment() {
        System.out.println("Processing payment with bank account...");
    }
}
