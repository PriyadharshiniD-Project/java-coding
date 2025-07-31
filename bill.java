import java.util.Scanner;
class bill {
    public static void main(String args[])
    {
        Scanner bill=new Scanner(System.in);
        int Totalbudget=bill.nextInt();
        int Singlebill=bill.nextInt();
        int no_of_bills=(Totalbudget/Singlebill);
        System.out.println("Enter Total Budget:"+Totalbudget);
        System.out.println("Enter Single Bill:"+Singlebill);
        System.out.println("No of Bills:"+no_of_bills);
        bill.close();
    }    
}
