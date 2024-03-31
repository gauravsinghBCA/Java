import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        String string,sub;
        int i,c,length;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string");
        string= sc.nextLine();
        length= string.length();
        System.out.println("substrigs of");
        for(c=0; c<length; c++){
            for(i=1;i<=length-c;i++){
                sub=string.substring(c,c+i);
                System.out.println(sub);
            }
        }
    }
}
