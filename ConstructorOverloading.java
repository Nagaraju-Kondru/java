class ConstructorOverloading{
    int id;           //instance variable id,name,age
    String name;
    int age;                                 
    ConstructorOverloading(int a,String b){ //two arg constructor
        id=a;
        name=b;
    }
    ConstructorOverloading(int a,String b,int c){  //three arg constructor
        id=a;
        name=b;
        age=c;
    }
    void display(){
        System.out.println(id+" ,"+name+" ,"+age);
    }
    public static void main(String args[]){
        ConstructorOverloading obj=new ConstructorOverloading(11,"nagaraju");
        ConstructorOverloading obj1=new ConstructorOverloading(22,"kondru",22);
        obj.display();
        obj1.display();
    }
}
