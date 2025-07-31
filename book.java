import java.util.Scanner;
class book {
    public static void main(String args[])
    {
        Scanner bk=new Scanner(System.in);
        String title=bk.nextLine();
        String author=bk.nextLine();
        double price=bk.nextDouble();
        bk.close();
    System.out.println("Book Title: "+title);
    System.out.println("Author: "+ author);
    System.out.println("Price: "+price);
}
}
