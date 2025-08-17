class Abstract_AnonymousInner{
    public static void main(String args[]){
        A obj=new A(){
            public void show(){
                System.out.println("A class");
            }
        };
        obj.show();
    }
}
abstract class A{
    public abstract void show();
}
