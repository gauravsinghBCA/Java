import java.util.Scanner;
public class po_od {
    public static void main(String[] args) {
        int a;
        Scanner p = new Scanner(System.in);
        System.out.println("enter a number");
        a= p.nextInt();
        if (a>0)
        {
            System.out.println("positive");
        }
        else {
            System.out.println("negative");
        }

        p.close();
    }
}