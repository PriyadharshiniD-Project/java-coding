import java.util.Scanner;
class lasagna {
    public static void main(String args[])
    {
        Scanner lasag=new Scanner(System.in);
        int layers=lasag.nextInt();
        int prepare_time=layers*2;
        int cook_time=lasag.nextInt();
        int Total_time=prepare_time+cook_time;
        System.out.println("No of layers : "+layers);
        System.out.println("Preparation Time: "+prepare_time);
        System.out.println("Cooking Time: "+cook_time);
        System.out.println("Total Elapsed Cooking Time: "+Total_time);
        lasag.close();
    }
}
