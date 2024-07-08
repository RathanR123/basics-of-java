package looping;
import java.util.Scanner;
public class while2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount ");
        int amount=sc.nextInt();
        while(amount>=2000){
            amount-=2000;
            System.out.println("2000 is withdrow and balance is " +amount+ " Rs");
        }
    System.out.println("insufficient balance is  " + amount+ " Rs");
    }
}
