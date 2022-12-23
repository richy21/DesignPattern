public class MailNotification extends Message {

    public MailNotification(Message Mail) {

        super();
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Mail");
    }

}