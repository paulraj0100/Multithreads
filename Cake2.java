//Multithreadind doing Runnable interface
import java.lang.Thread;

 class Cake2  implements Runnable{
    public void run(){
        System.out.println("Mixing incrediands"+Thread.currentThread().getId());
        System.out.println("Baking the cake"+Thread.currentThread().getId());
        System.out.println("Decorating the Cake"+Thread.currentThread().getId());
    }

}
class ThreadBaking{
    public static void main(String[] args) {

        int cakeCount=4;
        for(int i=0;i<cakeCount;i++){

            Cake2 cake2=new Cake2();

            Thread thread=new Thread(cake2);
            thread.start();

        }

        
    }
}
    

