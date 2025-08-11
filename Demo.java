class Demo{
    int id;
    String name;
    int age;
    Demo(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println(id+" ,"+name+" ,"+age);
    }
    public static void main(String args[]){
        Demo obj=new Demo(12,"knr",23);
        obj.display();
    }
}
