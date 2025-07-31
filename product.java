import java.util.Scanner;
class product {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        long Product=(long)A*B;
        System.out.println(Product);
        sc.close();
    }
}
