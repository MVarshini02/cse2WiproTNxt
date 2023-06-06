import java.util.Scanner;

public class FloydFormat {

	public static void main(String[] args) {
		int count;
		if(args.length == 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter an integer number:");
			count = scan.nextInt();
		}
		else {
			count = Integer.parseInt(args[0]);
		}
		System.out.println("Using For Loop :");
		for(int i = 1; i <= count; i++) {
			for(int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	
	}
}