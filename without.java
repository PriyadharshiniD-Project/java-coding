import java.util.Scanner;
class without{
    public static void main(String args[])
    {
        Scanner with=new Scanner(System.in);
        int n1=with.nextInt();
        int n2=with.nextInt();
        int n3=with.nextInt();
        System.out.println("Number 1 is: "+n1);
        System.out.println("Number 2 is: "+n2);
        System.out.println("Number 3 is: "+n3);
        System.out.println((n1<50)&&(n2>n3)||(n1 == n3));
        with.close();
    }
}
