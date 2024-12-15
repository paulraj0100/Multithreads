import java.lang.Thread;

class Cake extends Thread{

    public void run(){
        System.out.println("Mixing incrediands"+Cake.currentThread().getId());
        System.out.println("Baking the cake"+Cake.currentThread().getId());
        System.out.println("Decorating the Cake"+Cake.currentThread().getId());
    }

}
class ThreadBaking{
    public static void main(String[] args) {

        int cakeCount=4;
        

        for(int i=0;i<cakeCount;i++){

            Cake cake=new Cake();
            //multithreading doing using thred class
// inga start kudutha tha parlel ahh(multithreading) nadakkum
//run kudutha nadakkathu
            cake.start();

        }

        
    }
}