class LogicalError{
    public static void main(String args[]){
        int age=18;
        if(age<=18){  //logical error age>=18 means eligible here age<=18 it shows eligible
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
}
