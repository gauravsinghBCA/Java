class thread extends Thread{
    public void run(){
        int i;
        for(i=1;i<=5;i++){
            System.out.println("i="+i);
        }
        System.out.println("exit from first");
    }
}
class thread1 extends Thread{
    public void run(){
        int j;
        for(j=1;j<=5;j++){
            System.out.println("j="+j);
        }
        System.out.println("exit from second");
    }
}
class thread2 extends Thread{
    public void run(){
        int k;
        for(k=1;k<=5;k++){
            System.out.println("k="+k);
        }
        System.out.println("exit from third");
    }
}
class multithread{
    public static void main(String[] args){
        thread r = new thread();
        thread r1= new thread();
        thread2 r2 = new thread2();
        r.start();
        r1.start();
        r2.start();

    }
    
}

