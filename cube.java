import java.util.Scanner;
class cube {
    public static void main(String args[])
    {
        Scanner cub=new Scanner(System.in);
        int a =cub.nextInt();
        int A=a+1;
        System.out.println("Volume of cube:"+(A*A*A));
        cub.close();
    }    
}
