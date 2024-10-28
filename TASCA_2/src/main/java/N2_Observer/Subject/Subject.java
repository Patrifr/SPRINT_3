package N2_Observer.Subject;

import N2_Observer.Observers.Observer;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(Status status);
    void changeExchangeStatus(Status exchangeStatus);
}
