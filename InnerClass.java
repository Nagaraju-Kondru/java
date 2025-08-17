class InnerClass{
    public static void main(String args[]){
        A obj=new A();
        obj.display();
        A.B obj1=obj.new B(); // create inner class object using outer object
        obj1.show();
    }
}

class A{
    public void display(){
        System.out.println("outer class display method");
    }
    class B{
        public void show(){
            System.out.println("inner class show mehod");
            }
    }
}
