package Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
	
	private static ArrayList<Student> students = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			
			 	System.out.println("Student Management System");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Update Student");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Exit");
	            
	            
	            int choice  = sc.nextInt();
	            
	            switch(choice) {
	            
	            case 1:
	            	addstudent();
	            	break;
	            case 2 :
	            	viewstudents();
	            	break;
	            	
	            case 3:
	            	updatestudents();
	            	break;
	            	
	            case 4:
	            	deletestudents();
	            	break;
	            case 5:
	            	System.out.println("Exiting... ThankYou");
	            	return;
	            default:
	            	System.out.println("Invalid choice !");
	            	
	            }
			
		}
	}
	
	public static void addstudent() {
		System.out.println("Enter Student ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Student Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Marks");
		double marks = sc.nextDouble();
		
		students.add(new Student(id,name,marks));
		
	}
	
	public static void viewstudents() {
		if(students.isEmpty()) {
			System.out.println("No students found!");
			return;
		}
		
		System.out.println("Student List");
		for(Student s : students) {
			s.display();
		}
	}
	
	public static void updatestudents() {
		System.out.println("Enter Student Id to update: ");
		int id = sc.nextInt();
		
		boolean found = false;
		for(Student i : students) {
			if(i.getId() == id) {
				sc.nextLine();
				System.out.print("Enter new name");
				String name = sc.nextLine();
				
				System.out.print("Enter new Marks");
				double marks = sc.nextDouble();
				
				i.setName(name);
				i.setMarks(marks);
				System.out.println("Student record updated Successfully");
				found = true;
				break;
			}
			
			if(!found) {
				System.out.println("Student Not Found");
			}
		}
		
	}
	public static void deletestudents() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                found = true;
                System.out.println("Student deleted successfully!");
                break;
            }
        }

        if (!found)
            System.out.println("Student not found!");
    }
	
	

}
