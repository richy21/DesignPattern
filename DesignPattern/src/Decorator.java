public abstract class Decorator implements Notification {
    // Constructor
    protected Notification decoratorNotification;

    // Getter
    public Decorator(Notification decoratorNotif) {

        this.decoratorNotification = decoratorNotif;
    }

    // Setter
    public void sendMessage() {
        this.decoratorNotification.sendMessage();
    }

}