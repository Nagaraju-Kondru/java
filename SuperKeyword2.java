class SuperKeyword2{
    public static void main(String args[]){
        Child obj=new Child();
        obj.display();
    }
}
class Parent{
    int x=10;
}
class Child extends Parent{
    int x=1;
    void display(){
        System.out.println(x);
        System.out.println(super.x);
    }
}
