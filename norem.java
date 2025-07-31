import java.util.Scanner;
class norem  {
    public static void main(String args[])
    {
        Scanner rem=new Scanner(System.in);
        int N=rem.nextInt();
        System.out.println("Factors of " + N + " are:");
        for(int i=1;i<=N;i++)
        if(N%i==0)
        {
            System.out.print(" "+i);
        }
            rem.close();
    }    
}
