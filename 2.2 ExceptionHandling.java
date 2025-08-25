class ExceptionHandling{
    public static void main(String args[]){
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divided by Zero..");
        }
        catch(NullPointerException e){
            System.out.println("Null Value..");
        }
    }
}
