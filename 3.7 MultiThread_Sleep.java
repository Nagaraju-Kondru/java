
class MultiThread_Sleep {
    public static void main(String[] args) {
       Runnable r1=()->{
           for(int i=0;i<10;i++){
               System.out.println("Hiii");
           }
       };
       Runnable r2=()->{
           for(int i=0;i<10;i++){
              System.out.println("Hello");
           }
       };
       Thread t1=new Thread(r1);
       Thread t2=new Thread(r2);
       t1.start();
       try{
           t1.sleep(1000);
       }
       catch(InterruptedException e){
           System.out.println("Caught Exception: "+e);
       }
       t2.start();
    }
}
