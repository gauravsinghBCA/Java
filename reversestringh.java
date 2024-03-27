import java.util.Scanner;

public class reversestringh {
    public static void main(String[] args) {
        String st, rev = " ";
        Scanner s = new Scanner(System.in);
        System.out.println("enter a string");
        st = s.nextLine();
        int length = st.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + st.charAt(i);
        }
        System.out.println(rev);
        // StringBuffer a= new StringBuffer("Gaurav singh Gautam");
        // System.out.println(a.reverse());
    }

}
