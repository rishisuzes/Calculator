import java.util.*;
public class Caluclator {
	
	public static double add(double a , double b) {
		
		return a+b;
	}
	
	public static double subtract(double a , double b) {
		
		return a-b;
	}
	
	public static double multiply(double a , double b) {
		
		return a *b;
	}
	
	public static double div(double a , double b) {
		
		if(b == 0) {
			System.out.println("Error : Division by Zero is not allowed ");
			
			return 0;
			}
		
		return a/b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Welcome to Calculator");
		
		boolean a = true;
		
		while(a) {
			
			System.out.println("/choose an operation to perform");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			
			System.out.println("Choose a number to start the calculator from above mentioned action");
			
			int s = sc.nextInt();
			
			if(s == 5) {
				a = false;
				System.out.println("Come back again....");
			}
			
			System.out.println("Enter a First Number");
			System.out.println("Enter a Second Numnber");
			double  p= sc.nextDouble();
			double q= sc.nextDouble();
			
			
			double result =0;
			
			switch(s) {
			
			case 1 :
				result = add(p,q);
				System.out.println("Result"  + result);
				break;
				
			case 2 :
				result = subtract(p,q);
				System.out.println("Result" +  result);
				break;
				
				
				
			case 3 :
				result = multiply(p,q);
				System.out.println("Result" +  result);
				break;
				
			case 4 :
				
				result = div(p,q);
				System.out.println("Result" +  result);
				break;
				
			default :
				System.out.println("Invalid Choice ! Please select 1 - 5");
			}
				
		}
		
		
		
	}

}
