import java.util.Scanner;
class multi {
    public static void main(String args[])
    {
        Scanner mul=new Scanner(System.in);
        int N= mul.nextInt();
        for(int i=4;i <= N; i += 4)
        {
            System.out.println(i);
        }
        mul.close();
    }
}
