package conditional;
import java.util.*;

public class ifstate2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age of a person");
        int age=sc.nextInt();
        
        if(age>=18){
            System.out.println(age+ "the person is eligible for voting");
        }
    }
}
