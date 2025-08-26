import java.io.*;
class ExceptionHandling{
    public void readFile() throws FileNotFoundException{
        FileReader file= new FileReader("data.txt");
    }
    public static void main(String args[]){
        ExceptionHandling obj=new ExceptionHandling();
        try{
            obj.readFile();
        }
        catch(FileNotFoundException e){
            System.out.println("Caught Exception:  "+e);
        }
    }
}
