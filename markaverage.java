import java.util.Scanner;
class markaverage{ 
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int sub1=in.nextInt();
        int sub2=in.nextInt();
        int sub3=in.nextInt();
        int sub4=in.nextInt();
        int sub5=in.nextInt();
        int add=sub1+sub2+sub3+sub4+sub5;
        double average=add/5;
        System.out.println("add:"+add);
        System.out.println("average:"+ average);
        if(average<35)
        {
            System.out.println("additional class is required");
        }
        in.close();
    }
}