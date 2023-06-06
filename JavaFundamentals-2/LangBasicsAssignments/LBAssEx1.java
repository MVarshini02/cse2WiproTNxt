
class LBAssEx1 {
	public static void main(String[] args)
	{
	      if (args.length >= 2) {
            		String company = args[0];
            		String location = args[1];
            		String output = company + " Technologies " + location;
            		System.out.println(output);
        	      } 
	   else {
            		System.out.println("Please provide both company and location as command line arguments.");
        		}     
	
	}
}
