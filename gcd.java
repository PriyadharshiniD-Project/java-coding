import java.util.Scanner;
class gcd {
    public static int gcdsum (int a,int b)
    {
    while(b!=0)
    {
    int temp=b;
    b=a%b;
    a=temp;
    }return a;
    }
    public static void main(String args[])
    {
        Scanner gd=new Scanner(System.in);
        int a=gd.nextInt();
        int b=gd.nextInt();
        int gcdvalue=gcdsum(a,b);
        int lcm=(a*b)/gcdvalue;
        System.out.println("The lcm of  "+ a + " and "+ b + " is: " +lcm);
        gd.close();
    }    
}
