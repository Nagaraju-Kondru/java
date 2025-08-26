
class MultiThread_Join {
    public static void main(String[] args) {
        Employee t1=new Employee();
        Manager t2=new Manager();
        t1.start();
        try{
            t1.join();
        }
        catch(Exception e){
            System.out.println("Caught Exception"+e);
        }
        t2.start();
    }
}
class Employee extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello "+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
        }
        
    }
}
class Manager extends Thread{
    public void run(){
        for(int i=0;i<15;i++){
            System.out.println("Hiii "+Thread.currentThread().getName()+" >>"+Thread.currentThread().getId());
        }
        
    }
}
