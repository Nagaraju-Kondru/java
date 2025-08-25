class ExceptionHandling{
    public static void main(String args[]){
        int age=15;
        if(age>18){
           System.out.println("Eligible to vote..");
        }
        else{
             throw new ArithmeticException("Not aligible ?.");
        }
    }
}
