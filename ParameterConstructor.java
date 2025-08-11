class ParameterConstructor{
    int i;
    String s;
    void display(){
        System.out.println("parametrized constructor");
    }
    ParameterConstructor(int j, String k){
        i=j;
        s=k;
        System.out.println(i+" "+s);
    }
    public static void main(String args[]){
       
        ParameterConstructor obj1=new ParameterConstructor(12,"knr");
        obj1.display();
    }
}
