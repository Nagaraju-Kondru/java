class Functional_Interface_Parameter{
    public static void main(String args[]){
        A obj=(a,b)->
        System.out.println(obj.add(100,10));
        
    }
}

class A{
    int add(int a,int b){
        return a+b;
    }
}
