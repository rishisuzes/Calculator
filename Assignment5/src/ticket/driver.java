package ticket;
import java.util.Scanner;
public class driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] detail = input.split(",");
		TicketBooking booking = new TicketBooking(detail[0],detail[1],Integer.parseInt(detail[2]));
		
		
		int choice = sc.nextInt();
		
		sc.nextLine();
		
		booking.display();
		
		switch(choice) {
		
		case 1:
			double amount = sc.nextDouble();
			booking.makepayment(amount);
			break;
			
		case 2 :
			double walletamount = sc.nextDouble();
			sc.nextLine();
			
			String walletNumber = sc.nextLine();
			booking.makepayment(walletNumber , walletamount);
			break;
			
		case 3 :
			String creditcard = sc.nextLine();
			String ccv = sc.nextLine();
			String holdername = sc.nextLine();
			double cardamount = sc.nextDouble();
			
			booking.makepayment(creditcard,ccv,holdername,cardamount);
			break;
		default:
			System.out.println("Invalid choice");
			
			
			
		}
	}

}
