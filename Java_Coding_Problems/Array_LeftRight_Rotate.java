class Array_LeftRight_Rotate{
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int temp[]=new int[a.length];
        int k=3;
        if(k<0){     //right rotate if k less value is negative
            k=k+a.length;
        }
        for(int i=0;i<a.length;i++){
            temp[i]=a[(i+k)%a.length];
        }
        System.out.println("rotated array");
        
        for(int i=0;i<a.length;i++){
           
            System.out.print(temp[i]+" ");
        }
        
    }
}
