import java.util.Scanner;
class count {
    public static void main(String args[])
    {
        Scanner cnt=new Scanner(System.in);
        String A=cnt.nextLine();
        int Length=A.length();
        System.out.println("Length of the String is: "+Length);
        cnt.close();
    }    
}
