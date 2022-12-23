public class WhatsappNotification extends Decorator {

	public WhatsappNotification(Notification whatsappDecorator) {
		super(whatsappDecorator);
	}

	@Override
	public void sendMessage() {
		super.sendMessage();
		System.out.println("Whatsapp");
	}
}
