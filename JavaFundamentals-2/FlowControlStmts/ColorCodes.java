import java.util.Scanner;

public class ColorCodes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter color code :");
		char color = scan.next().charAt(0);
		
		switch(color){
			case 'R' :
			case 'r' :
				System.out.println("Red");
				break;
				
			case 'B' :
			case 'b' :
				System.out.println("Blue");
				break;
				
			case 'G' :
			case 'g' :
				System.out.println("Green");
				break;
				
			case 'O' :
			case 'o' :
				System.out.println("Orange");
				break;
				
			case 'Y' :
			case 'y' :
				System.out.println("Yellow");
				break;
				
			case 'W' :
			case 'w' :
				System.out.println("White");
				break;
				
			default :
				System.out.println("Invalid Code");
		}
	}

}