import java.lang.*;
import java.util.Scanner;
class PosNegZero
{
    public static void main(String args[]){
        int num;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter any integer value");
        num = sc.nextInt();
        if(num<0)
	System.out.println("Negative value");
        else if(num>0)
	System.out.println("Positive value");
        else if(num==0)
	System.out.println("It is a zero");
       }

}