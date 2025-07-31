import java.util.Scanner;
class fahrenheit
{
    public static void main(String args[])
    {
    Scanner fah=new Scanner(System.in);
    System.out.print("Please enter the temperature in Celsius: ");
    double celsius=fah.nextDouble();
    double fahrenheit=(celsius*1.8)+32;
    System.out.println(fahrenheit+"°f");
    fah.close();
    }
}
