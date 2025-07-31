import java.util.Scanner;
class apple {
    public static void main(String args[])
    {
        Scanner app=new Scanner(System.in);
        int rahul=app.nextInt();
        int karan=app.nextInt();
        int gave=rahul-5;
        System.out.println(gave);
        int got=karan+5;
        System.out.println(got);
        int pluck=2*gave;
        System.out.println(pluck);
        System.out.println(" Total number of apples Rahul and Karan are left with: "+pluck+","+got);
        app.close();
    }
}
