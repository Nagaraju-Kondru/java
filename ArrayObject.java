class ArrayObject{
  public static void main(String args[]){
    Student s1=new Student();
    s1.a=1;
    s1.b="nagaraju";
    Student s2=new Student();
    s2.a=1;
    s2.b="pavan";
    Student s3=new Student();
    s3.a=1;
    s3.b="Gopi";
    Student arr[]=new Student[3];
    arr[0]=s1;
    arr[1]=s2;
    arr[2]=s3;
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }  
    
  }
}
class Student{
  int a;
  String b;
}
