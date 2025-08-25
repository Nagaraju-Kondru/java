class Main{
    public static void main(String args[]){
        int a=9;
        int b=0;
        int result=0;
        try{
            result=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("Exception: Cannot Divided by Zero..");
        }
        finally{
            System.out.println("Final block.");
        }
    }
}
