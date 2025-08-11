class StaticBlock{
    int a=9;
    static{
        System.out.println("static block");
       // System.out.println(a);   //error not allow non static variable/methods
    }
    public static void main(String args[]){
        System.out.println("main method ");
    }
}
