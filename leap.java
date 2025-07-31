import java.util.Scanner;
class leap {
    public static void main(String args[])
    {
        Scanner lp=new Scanner(System.in);
        int A=lp.nextInt();
        if(A%4==0)
        {
            System.out.println("It is a leap year");
        }
        else
        {
            System.out.println("It is not a leap year");
        }
        lp.close();
    }
}
