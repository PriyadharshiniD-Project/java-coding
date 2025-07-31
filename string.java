import java.util.Scanner;
class string {
    public static void main(String args[])
    {
        Scanner stg=new Scanner(System.in);
        String name=stg.nextLine();
        int value=stg.nextInt();
        System.out.print(name+value);
        stg.close();
    }    
}
