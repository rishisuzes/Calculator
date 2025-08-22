package Airplane;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Airfare s;
		int choice = sc.nextInt();
		int hours = sc.nextInt();
		
		double costPerHour = sc.nextDouble();
		
		 switch (choice) {
         case 1:
             s = new AirIndia(hours, costPerHour);
             break;
         case 2:
             s = new KingFisher(hours, costPerHour);
             break;
         case 3:
             s = new Indigo(hours, costPerHour);
             break;
         default:
             System.out.println("Invalid Choice");
             sc.close();
             return;
             
             
 
     }
		 
     s.display();
		 

     sc.close();
		

	

	}
	
}