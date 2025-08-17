class AbstractKeyword{
    public static void main(String args[]){
        Car obj=new NewUpdatedCar();
        obj.CarA();
        obj.A();
        obj.B();
        NewUpdatedCar obj1=new NewUpdatedCar();
        obj1.Play();
    }
}
abstract class Car{    //abstract class can accept non abstarct methods and abstarct methods
    public abstract void A();  //abstarct methods can implement in abstarct class only not accept in normal class
    public abstract void B();
    public void CarA(){
        System.out.println("benz");  //normal method
    }
}
abstract class UpdateCar extends Car{
    public void A(){      
        System.out.println("hello");
    }
}
class NewUpdatedCar extends UpdateCar{
    public void B(){
        System.out.println("abstract b method");
    }
    public void Play(){
        System.out.println("hiii");
    }
}
