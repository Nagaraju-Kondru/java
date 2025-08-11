class DefaultConstructor{
    int id;     //instance variable id and name
    String name;
    DefaultConstructor(){//default constructor
        System.out.println(id+" "+name);
        System.out.println("Default constructor");
    }
    public static void main(String args[]){
        DefaultConstructor obj=new DefaultConstructor();
    }
}
