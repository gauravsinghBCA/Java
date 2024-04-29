import java.util.Scanner;

public class sqr {
  public static void main(String[] args) {
    int i, square;
    Scanner p = new Scanner(System.in);
    System.out.println("enter data");
    i = p.nextInt();
    square = i * i;
    System.out.println(square);
    p.close();
  }

}
