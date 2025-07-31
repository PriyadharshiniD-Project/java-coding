import java.util.Scanner;
class palindrome
{
    public static void main(String args[])
    {
        Scanner palin=new Scanner(System.in);
        String A=palin.nextLine();
        String reversed=new StringBuilder(A).reverse().toString();
        System.out.println("Reversed String:"+reversed);
        if(A.equals(reversed))
        {
            System.out.println("It is a Palindrome !");
        }
        else
        {
            System.out.println("It is not a Palindrome");
        }
        palin.close();
    }
}