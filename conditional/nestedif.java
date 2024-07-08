package conditional;
import java.util.*;
public class nestedif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2){
            if(num1>0){
                System.out.println(num1+ " is gratter than"+num2+" and is positive");
            }
            else{
                System.out.println(num1+ " is gratter than"+num2+" and is negative");
            }
         }
         else{
            System.out.println(num1+ " is lesser"+num2);
         }
    }
}
