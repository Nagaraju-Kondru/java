class Encapsulation{
    public static void main(String args[]){
        Demo obj=new Demo();

        // obj.id=12; //we cannot access id,name directly because there are private
        // obj.name="knr";
        obj.setId(13);
        obj.setName("nagaraju");
       System.out.println(obj.getId());
       System.out.println(obj.getName());
    }
}

class Demo{
    private int id;
    private String name;
    public void  setId(int a){
        id=a;
    }
     public void setName(String s){
        name=s;
    }
     public int getId(){
        return id;
    }
    
   
    public String getName(){
        return name;
    }
}
