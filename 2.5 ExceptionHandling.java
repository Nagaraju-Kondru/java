class ExceptionHandling{
    public static void main(String args[]){
        int age=15;
        try{
            if(age<18){
                throw new IllegalArgumentException("Age is Not Valid?");
            }
        }
            catch(Exception e){
                System.out.println("Caught Exception :"+e.getMessage());
            }
        
    }
}
