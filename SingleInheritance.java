class SingleInheritance{
    public static void main(String args[]){
        System.out.println("A parent");
        A obj=new A();
        obj.add(10,5);
        System.out.println("B parent extends A");
        B obj1=new B();
        obj1.add(20,20);
        obj1.sub(100,20);
    }
}
class A{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class B extends A{
    public void sub(int a,int b){
        System.out.println(a-b);
    }
}
