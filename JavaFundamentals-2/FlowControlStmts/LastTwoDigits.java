import java.lang.*;
import java.util.Scanner;
public class LastTwoDigits{
    public static boolean lastDigit(int val1,int val2){
        int x = val1%10;
        int y = val2%10;
        if(x==y){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 non-negative values:");
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        boolean result = lastDigit(val1,val2);
        System.out.println(result);
    }

}