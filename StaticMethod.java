class StaticMethod{
    int i=9;
    static String s="knr";
    static void display(){
        System.out.println(s);
        //System.out.println(i);     // error its not a static variable i
    }
    public static void main(String args[]){
        StaticMethod.display();
    }
}
