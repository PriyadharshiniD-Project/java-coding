import java.util.Scanner;
class odd {
    public static void main(String args[])
    {
        Scanner od=new Scanner(System.in);
        int A=od.nextInt();
    if(A>0 && A%2!=0){
    System.out.println(A + " odd poss ");}
    else if(A<0 && A%2!=0){
    System.out.println(A +" odd negative ");}
    else if(A>0 && A%2==0){
    System.out.println(A +" even poss ");}
    else if(A<0 && A%2==0){
    System.out.println(A +" even negative ");}
    else{
    System.out.println(A +" not even not odd");}
    od.close();
    }
}
