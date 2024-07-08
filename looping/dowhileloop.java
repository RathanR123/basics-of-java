package looping;
import java.util.*;
public class dowhileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of iterations to carried out:");
        int num=sc.nextInt();
        do{
            num--;
        }
        while(num>0);
        System.out.println("number of iterations done is  "+num);
    }
}
