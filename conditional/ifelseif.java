package conditional;
import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();

        if(num>0){
            System.out.println(num+ " is positive number");
        }
        else if(num<0){
            System.out.println(num+ " is negative number");
        }
        else{
            System.out.println("the number is zero");
        }
    }
}
