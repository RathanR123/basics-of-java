package conditional;
import java.util.Scanner;
public class switchcase{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choise:\n 1.additon(+) \n 2.subtraction(-) \n 3.multiplication (*)\n 4.div(/)");
        int ch=sc.nextInt();
        System.out.println("enter the 2 numbers\n");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        switch(ch){
            case 1:System.out.println("addition: "+(num1+num2));
                    break;
            case 2:System.out.println("subtraction: "+(num1-num2));
                    break;
            case 3:System.out.println("multiplition: "+(num1*num2));
                    break;
            case 4:System.out.println("div: "+(num1/num2));
                    break;
            default:System.out.println("select valid case");

        }
    }
}
