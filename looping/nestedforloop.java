package looping;
import java.util.*;;
public class nestedforloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 2 numbers");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        for(int i=1;i<num1;i++){
            for(int j=1;j<num2;j++)
            {
                System.out.print(j);
            }
            System.out.println();
            
        }
    }
}

