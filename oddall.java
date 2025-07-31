import java.util.Scanner;
class oddall {
    public static void main(String args[])
    {
        Scanner all=new Scanner(System.in);
        int A= all.nextInt();
        int sum=0;
        for(int i=1;i<=A;i++)
        if(i%2!=0)
            {
                System.out.print(i + " ");
                sum+=i;
            }
            System.out.println();
            System.out.println("sum of odd number is:"+ sum);
        all.close();
    }    
}
