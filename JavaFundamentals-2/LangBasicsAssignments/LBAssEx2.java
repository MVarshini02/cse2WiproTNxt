class LBAssEx2{
    public static void main(String[ ] args){
	if (args.length >= 0){
		String name = args[0];
		String output = "Welcome " + name;
		System.out.println(output);
	}
	else{
		System.out.println("pls provide a single argument");
	}
    }
}