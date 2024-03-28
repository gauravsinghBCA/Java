interface first{
    void factorial();
     void sum();
     
}
interface pure {
    void sum();
    void factorial();
}
class second implements first,pure {
    public void factorial()
      {
        int n=7, f=1;
        while(n>0){
            f=f*n;
            n--;
        }
        System.out.println(f);
      }
    
}  
class xyz{
    public static  void main(String[] args) {
        second s= new second();
        s.factorial();
    }
} 