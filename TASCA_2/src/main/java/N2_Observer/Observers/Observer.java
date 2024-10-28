package N2_Observer.Observers;

import N2_Observer.Subject.Status;

public interface Observer {
    void update(Status status);
}
