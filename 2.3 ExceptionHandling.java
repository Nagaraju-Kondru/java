class ExceptionHandling{
    public static void main(String args[]){
        try{
            int a[]={1,2,3};
                try{
                int b=a[5];
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("Index out of Bound Exception..");
                }
             int b=9/0;
        }
            catch(ArithmeticException e){
                System.out.println("Cannot divided by Zero..");
            }
            
        
    }
}
