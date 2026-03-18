// WAP to demonstarte the use of multithreading

class MyTask1 implements Runnable {
    
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

class MyTask2 implements Runnable {
    
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            } 
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        
        Thread t1 = new Thread(new MyTask1());
        Thread t2 = new Thread(new MyTask2());
        t1.start();
        t2.start();
    }
}
