class MultiLevelInheritance{
    public static void main(String args[]){
        System.out.println("C parent");
        C obj=new C();
        obj.add(10,5);
        obj.sub(10,5);
        obj.mul(10,5);
        System.out.println("B parent");
        B obj1=new B();
        obj1.sub(100,50);
        obj1.add(100,50);
        System.out.println("A parent");
        A obj2=new A();
        obj2.add(1000,500);
        
    }
}
class A {
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class B extends A{
    public void sub(int a,int b){
        System.out.println(a-b);
    }
}
class C extends B{
    public void mul(int a,int b){
        System.out.println(a*b);
    }
}
