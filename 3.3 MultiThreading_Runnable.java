
class MultiThreading_Runable {
    public static void main(String[] args) {
        Employee t1=new Employee();
        Thread e1=new Thread(t1);
        
        Manager t2=new Manager();
        Thread e2=new Thread(t2);
        e2.start();
        e1.start();
         System.out.println(Thread.activeCount());
        
    }
}
class Employee implements Runnable{
    @Override
    public void run(){
        System.out.println("Hello "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }
}
class Manager implements Runnable{
     @Override
    public void run(){
       System.out.println("Hiii "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }
}
