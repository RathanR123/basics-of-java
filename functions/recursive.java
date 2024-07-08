import java.util.Scanner; 
public class recursive {
    public static void main(String[] args) {
        view();
    }
    public static void view(){
        int a=10;int b=20;
        System.out.println(a+b);
        view();
    }
}
