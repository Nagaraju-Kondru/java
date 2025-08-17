class AnonymousInnerClass{
    public static void main(String args[]){
        A obj=new A(){
            public void show(){
                System.out.println("Anonymous inner show");
            }
        
        };
        obj.show();
        // A obj1=new A();
        // obj1.show();
    }
}
class A{
    public void show(){
        System.out.println("A class show");
    }
}
