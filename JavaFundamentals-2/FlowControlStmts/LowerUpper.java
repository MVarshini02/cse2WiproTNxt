public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var = 'a';
		if (var >= 'a' && var <= 'z')
			System.out.println((char)(var-32));				//lowercase to uppercase
	     else
	    	 System.out.println((char)(var+32)); 			//uppercase to lowercase
	}

}