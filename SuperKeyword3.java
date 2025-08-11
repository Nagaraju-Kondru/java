class SuperKeyword3{
    public static void main(String args[]){
        Child obj=new Child();
        obj.display();
    }
}
class Parent{
    void display(){
        System.out.println("parent class");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("child class");
        super.display();
    }
}
