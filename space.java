import java.util.Scanner;
class space{
    public static void main(String args[])
    {
        Scanner sp=new Scanner(System.in);
        int N=sp.nextInt();
        System.out.println("Positive number:"+N);
        for(int i=1;i<=10;i++)
        System.out.print(i+" ");
        sp.close();
    }
}