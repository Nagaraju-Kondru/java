class DynamicMethodDispatch{
    public static void main(String args[]){
      A obj=new A();
      obj.display();
      
      obj=new B();     //reference A object type is B
      obj.display();
      
      obj=new C();      //reference A object type is C
      obj.display();
    }
}

class A{
    public void display(){
        System.out.println("display A");
    }
}
class B extends A{
    public void display(){
        System.out.println("display B");
    }
}
class C extends A{
    public void display(){
        System.out.println("display C");
    }
}
