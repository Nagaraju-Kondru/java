class SuperKeyword1{
    public static void main(String args[]){
        Child obj=new Child();
    }
}
class Parent{
    Parent(){
        System.out.println("parent constructor");
    }
}
class Child extends Parent{
    Child(){
         super();   //call to super must be first statement in constructor
        System.out.println("child constructor");
       
    }
}
