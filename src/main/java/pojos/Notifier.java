package pojos;

/**
 * Created by user on 07.05.2016.
 */
public class Notifier {
    public void notifyBefore() {
        System.out.println("Notification before executing getStreet()");
    }
    public void notifyAfter() {
        System.out.println("Notification after executing getStreet()");
    }
}

