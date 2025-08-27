
class Race_Condition{
    public static void main(String[] args) throws Exception {
        Hello obj=new Hello();
       Runnable r1=()->{
           for(int i=0;i<5000;i++){
               obj.increment();
           }
       };
       Runnable r2=()->{
           for(int i=0;i<1000;i++){
              obj.increment();
           }
       };
       Runnable r3=()->{
           for(int i=0;i<1000;i++){
              obj.increment();
           }
       };
       Thread t1=new Thread(r1);
       Thread t2=new Thread(r2);
       Thread t3=new Thread(r3);
       t1.start();
       t2.start();
       t3.start();
       t1.join();
       t2.join();
       t3.join();
       System.out.println(obj.count);
    }
}
class Hello{
    int count=0;
    public void increment(){
        count++;
    }
}
