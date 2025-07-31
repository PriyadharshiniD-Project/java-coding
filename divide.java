import java.util.Scanner;
class divide {
    public static void main(String args[])
    {
        Scanner div=new Scanner(System.in);
        int A=div.nextInt();
        int B=div.nextInt();
        int add=A+B;
        int C=div.nextInt();
        int divided=add/C;
        int remain=add%C;
        System.out.println("Add two Number: "+add);
        System.out.println("Division: "+divided);
        System.out.println("Remainder: "+remain);
        div.close();
    }    
}
