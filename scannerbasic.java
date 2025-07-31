import java.util.Scanner;

public class scannerbasic {
    public static void main(String args[])
    {
        Scanner john = new Scanner(System.in);
        int a = john.nextInt();
        int b = john.nextInt();
        System.out.println(a+b);
        john.close();
    }  
}
