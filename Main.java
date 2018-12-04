import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
Circul s=new Circul(n);
s.autSqr();
Triangle t=new Triangle(3,4,5);
t.outPrim();   }
}