class FinalKeyword{
    public static void main(String args[]){
        final int a=10;                         //Error a not reassign because it is final
        a=5;
        System.out.println(a);
    C obj=new C();
    obj.display();
    }
}
class A{
    public final void display(){      
        System.out.println("Display A");
    }
}
final class B extends A{                            //Error Overriding a final method
    public  void display(){
        System.out.println("Display B");
    }
}
class C extends B{                        //Error class B is final
    public void display(){
        System.out.println("final class C");
    }
}
