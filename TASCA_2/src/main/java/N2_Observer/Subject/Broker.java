package N2_Observer.Subject;

import N2_Observer.Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class Broker implements Subject {
    private List<Observer> agencies = new ArrayList<>();
    private Status exchangeStatus;

    @Override
    public void  changeExchangeStatus(Status exchangeStatus) {
        this.exchangeStatus = exchangeStatus;
        notifyObserver(exchangeStatus);
    }

    @Override
    public void addObserver(Observer agency){
        this.agencies.add(agency);
        System.out.println("Successfully subscribed to the Stock Market notifications.");
    }

    @Override
    public void removeObserver(Observer agency){
        this.agencies.remove(agency);
        System.out.println("Successfully unsubscribed to the Stock Market notifications.");
    }

    @Override
    public void notifyObserver(Status status) {
        agencies.forEach(x-> x.update(status));
    }
}
