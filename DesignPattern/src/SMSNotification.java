public class SMSNotification extends Decorator {

	public SMSNotification(Notification smsDecorator) {
		super(smsDecorator);
	}

	@Override
	public void sendMessage() {
		super.sendMessage();
		System.out.println("SMS");
	}
}
