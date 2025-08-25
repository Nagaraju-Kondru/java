class ExceptionHandling{
    public static void main(String args[]) throws CustomException{
        int age=15;
        try{
           if(age<18){
               
           
            throw new CustomException("Custom Exception..");
        }
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
}
class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}


