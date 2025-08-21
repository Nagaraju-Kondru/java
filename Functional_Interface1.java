class Functional_Interface1{
    public static void main(String args[]){
      A obj=new A(){
          public void display(){
              System.out.println("functional interface");
          }
      };
      obj.display();
       
    }
}
@FunctionalInterface
interface A{
    public void display();
}
