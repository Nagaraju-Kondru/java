
public class MultiThread_State {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();

        System.out.println("State after creation: " + t1.getState());

        t1.start();
        System.out.println("State after start: " + t1.getState());  

        Thread.sleep(100); 
        System.out.println("State while running: " + t1.getState());

        t1.join();
        System.out.println("State after completion: " + t1.getState()); 
    }
}

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread running...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

