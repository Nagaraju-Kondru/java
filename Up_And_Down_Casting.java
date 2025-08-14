class Up_And_Down_Casting{
    public static void main(String args[]){
        A obj =new B();      //Upcasting (Parent reference → Child object)
        obj.show();         //Calls overridden show() in B
        B obj1=(B) obj;    //Downcasting (Child reference → same Child object)
        obj1.display();   //Calls display() in B
        
       
    }
}
class A{
    public void show(){
        System.out.println("A class");
    }
}
class B extends A{
    public void show(){
        System.out.println("B class");
    }
    public void display(){
        System.out.println("C class");
    }
}
