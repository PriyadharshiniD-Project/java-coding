import java.util.Scanner;
class even {
    public static void main(String args[])
    {
        Scanner number=new Scanner(System.in);
        int num=number.nextInt();
        System.out.println("Enter the number:"+num);
        if (num%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
        number.close();
    }    
}
