package conditional;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(" even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    
}
