import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choix;
        System.out.println("--------------------------------------------- \n");
        System.out.println("Quelles notifications voulez vous recevoir?\n");
        System.out.println("1= Mail \n");
        System.out.println("2= SMS \n");
        System.out.println("3= Whatsapp \n");
        System.out.println("--------------------------------------------- \n");
        Scanner sc = new Scanner(System.in);
        choix = sc.nextInt();

        Notification mail = new MailNotification(new Message());

        Notification sms = new SMSNotification(new Message());

        Notification whatsapp = new WhatsappNotification(new Message());

        if (choix == 1) {

            mail.sendMessage();

        } else if (choix == 2) {

            sms.sendMessage();
        }

        else if (choix == 3) {

            whatsapp.sendMessage();
        }

        else {

            System.out.println("Choix incorrect");
        }

    }
}
