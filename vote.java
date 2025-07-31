import java.util.Scanner;
class vote{
    public static void main(String args[])
    {
        Scanner vt=new Scanner(System.in);
        int age=vt.nextInt();
        if(age>18)
        {
            System.out.print(age);
        }
        vt.close();
    }    
}
