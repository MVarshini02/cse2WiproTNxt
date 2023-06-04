import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number of Employees: ");
		int empCount = sc.nextInt();
		sc.nextLine();
		
		List<Employee> empList = new ArrayList<>();
		
		for (int i = 0; i < empCount; i++) {
			System.out.println("Enter Employee" + (i + 1)+"Details");
			System.out.print("Enter the Firstname: ");
			String firstName = sc.nextLine();
			System.out.print("Enter the Last name:");
			String lastName = sc.nextLine();
			System.out.print("Enter the Mobile number: ");
			long mobileNumber = sc.nextLong();
			sc.nextLine();
			System.out.print("Email: ");
			String emailId = sc.nextLine();
			System.out.print("Enter the Address: ");
			String address = sc.nextLine();
			
			empList.add(new Employee(firstName, lastName, mobileNumber, emailId, address));
		}
		
		Collections.sort(empList);
		
		System.out.println("Employee List: (sorted on First Name)\n");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
		for (int i = 0; i < 90; i++) System.out.print("-");
		System.out.println();
		
		Iterator<Employee> it = empList.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
					emp.getFirstName(), emp.getLastName(), emp.getMobileNumber(), 
					emp.getEmailId(), emp.getAddress());
		}
		for (int i = 0; i < 90; i++) System.out.print("-");
		
		sc.close();
	}

}