class HierarchicalInheritance{
    public static void main(String args[]){
        System.out.println("A class");
        A obj=new A();
        obj.add(10,10);
        System.out.println("B class");
        B obj1=new B();
        obj1.add(100,100);
        obj1.sub(10,5);
        System.out.println("C class");
        C obj2=new C();
        obj2.add(20,20);
        obj2.mul(10,10);
        
    }
}
class A{
    public void add(int a,int b){
        System.out.println("add: "+(a+b));
    }
}
class B extends A{
    public void sub(int a,int b){
        System.out.println("sub: "+(a-b));
    }
}
class C extends A{
    public void mul(int a,int b){
        System.out.println("mul: "+(a*b));
    }
}
