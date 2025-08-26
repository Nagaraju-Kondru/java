class MultiThreading_Methods{
    public static void main(String args[]){
        System.out.println("current thread name: "+Thread.currentThread());

        System.out.println("get thread name: "+Thread.currentThread().getName());

        Thread.currentThread().setName("Hello_Thread");

        System.out.println(Thread.currentThread().getName()+" ->"+"thread name changed");

        System.out.println("get id: "+Thread.currentThread().getId());

         System.out.println("get priority: "+Thread.currentThread().getPriority());

          System.out.println("active count: "+Thread.currentThread().activeCount());
    }
}
