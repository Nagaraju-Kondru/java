class StaticVariable{
    static int x=1;
    void display(){
        System.out.println(x);
    }
    public static void main(String args[]){
        StaticVariable obj=new StaticVariable();
        obj.display();
       System.out.println(StaticVariable.x);//without creating object
    }
}
