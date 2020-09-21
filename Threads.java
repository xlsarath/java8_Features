
public class Threads {

    public static void main(String[] args) {
        
        Runnable r = new Runnable(){
        
            @Override
            public void run() {
                System.out.println("Thread is running");
                
            }
        };

       Thread t = new Thread(r);
        t.start();

         //Thread Example with lambda  
         Runnable r1 = ()->{System.out.println("Thread2 lambda expressions is running");
        };
        Thread t1 = new Thread(r1);
        t1.start();
    }   

}