public class star {
    public static void main(String[] args) {
        int j,i;
        for(i=1; i<=10; i++){
            
            for(j=1; j<=10; j++){
                if(j==i){
                System.out.print("**");}
                System.out.print("-");
            }
            System.out.println("\n");
        }
    }
}
