package N2_Observer;

import N2_Observer.Observers.Agency1;
import N2_Observer.Observers.Agency2;
import N2_Observer.Observers.Observer;
import N2_Observer.Subject.Broker;
import N2_Observer.Subject.Status;
import N2_Observer.Subject.Subject;

public class StockMarket {

    public static void start(){
        Subject broker = new Broker();

        Observer agency1 = new Agency1();
        Observer agency2 = new Agency2();

        broker.addObserver(agency1);
        broker.addObserver(agency2);

        broker.notifyObserver(Status.INCREASED);

        broker.removeObserver(agency1);

        broker.changeExchangeStatus(Status.DROPPED);
    }
}
