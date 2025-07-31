import java.util.Scanner;
class simple {
    public static void main(String args[])
    {
        Scanner sim=new Scanner(System.in);
        double Principle=sim.nextDouble();
        double Rate =sim.nextDouble();
        double Time =sim.nextDouble();
        if(Principle<0 || Rate<0 || Time<0)
        {
            System.out.println("Error");
            sim.close();
        }
        double simpleInterest=(Principle + Rate + Time)/100;
        double TotalAmount= Principle+simpleInterest;
        System.out.println("\n-----Simple Interest Calculator-----");
        System.out.println("Principle:    "+Principle);
        System.out.println("Rate:      %"+Rate);
        System.out.println("Time: "+Time);
        System.out.println("\n----------------------------------------------");
        System.out.println("simple interest:  " +simpleInterest);
        System.out.println("Total amount:  " + TotalAmount);
    }    
}
