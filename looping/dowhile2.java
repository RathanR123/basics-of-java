package looping;
import java.util.*;
public class dowhile2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int i=sc.nextInt();
        do
            {
                System.out.println(i);
                i++;
            }
        while(i<=5);
    }

}
