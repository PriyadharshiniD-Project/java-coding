import java.util.Scanner;
class evenspace{
    public static void main(String args[])
    {
        Scanner sp=new Scanner(System.in);
        int N=sp.nextInt();
        System.out.println("Positive number:"+N);
        for(int i=N;i>=0;i--)
        if(i%2==0){
        System.out.print( i +" ");
        }
        sp.close();
    }
}