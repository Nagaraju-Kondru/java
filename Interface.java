class Interface{
    public static void main(String args[]){
        C obj=new C();
        obj.show();
        obj.display();
        obj.show1();
        obj.display1();
    }
}
interface A{
    public void show();
    public void display();
}
interface B extends A{
    void show1();
    void display1();
}
class C implements A,B{
    public void show(){
        System.out.println("show");
    }
    public void display(){
        System.out.println("display");
    }
    public void show1(){
        System.out.println("show1");
    }
    public void display1(){
        System.out.println("display1");
    }
}
