import java.util.Scanner;

public class nCopies {

	static String copyString(String str) {
		String repStr = str.substring(0, 2);				//substring(beginIndex, endIndex)
		String outStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			outStr += repStr;
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = scan.nextLine();
		
		System.out.println(copyString(str));
	}

}