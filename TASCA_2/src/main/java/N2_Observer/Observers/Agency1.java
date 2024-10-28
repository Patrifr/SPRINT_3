package N2_Observer.Observers;

import N2_Observer.Subject.Status;

public class Agency1 implements  Observer{
    private Status status;

    @Override
    public void update(Status status) {
        if(status == Status.INCREASED){
            System.out.println("The Stock exchanges has increased.");
        } else if(status == Status.DROPPED){
            System.out.println("The Stock exchanges has dropped.");
        }
    }
}
