
class MultiThreading_AnonymousClass {
    public static void main(String[] args) {
        Runnable r1=new Runnable(){
            public void run(){
                System.out.println("Hello "+Thread.currentThread().getName());
            }
        };
        Thread t1=new Thread(r1);
        t1.start();
    }
}
