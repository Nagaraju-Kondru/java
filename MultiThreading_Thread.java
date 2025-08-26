
class 3.2 MultiThreading_Thread {
    public static void main(String[] args) {
        Employee t1=new Employee();
        Manager t2=new Manager();
        t2.start();
        t1.start();
         System.out.println(t1.activeCount());
    }
}
class Employee extends Thread{
    @Override
    public void run(){
        System.out.println("Hello "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }
}
class Manager extends Thread{
     @Override
    public void run(){
       System.out.println("Hiii "+Thread.currentThread().getName()+" "+Thread.currentThread().getId());
    }
}
