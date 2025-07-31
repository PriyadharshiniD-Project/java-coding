import java.util.Scanner;
class price {
    public static void main(String args[])
    {
        Scanner prc=new Scanner(System.in);
        int cost=prc.nextInt();
        int selling=prc.nextInt();
        System.out.println("Cost Price: "+cost);
        System.out.println("Selling Price: "+selling);
        double percent=((double)(selling - cost) / cost) * 100;
        double percent1=((double)(cost-selling) / cost)* 100;
        if(cost<selling)
        {
            System.out.printf("Profit:  %.2f%%\n",percent);
        }
        else
        {
            System.out.printf("Loss:  %.2f%%\n",percent1);
        }
        prc.close();
    }
}
