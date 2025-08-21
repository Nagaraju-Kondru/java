class Functional_Interface{
    public static void main(String args[]){
      A obj=()->
              System.out.println("functional interface");
      obj.display();
       
    }
}
@FunctionalInterface
interface A{
    public void display();
}
