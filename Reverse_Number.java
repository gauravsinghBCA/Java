import java.util.Scanner;

public class rev {
    public static void main(String[] agrs) {
        int a, r, rev = 0;
        Scanner p = new Scanner(System.in);
        System.out.println("enter a no....");
        a = p.nextInt();
        while (a > 0) {
            r = a % 10;
            rev = rev * 10 + r;
            a = a / 10;
        }
        System.out.println(rev);
        p.close();
    }
}