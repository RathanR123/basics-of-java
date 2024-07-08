package conditional;
import java.util.Scanner;

public class ifstatement {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        
        if(n>=10){
            System.out.println(n+"the number is grater than or equal to 10");
        }
    }
}
