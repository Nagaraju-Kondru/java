class Array_Dublicates{
    public static void main(String args[]){
        int a[]={1,1,2,2,3,4,5,6,4,3,2,1,1,3,2,11,11,5};
        boolean bool[]=new boolean[a.length];
        
        for(int i=0;i<a.length;i++){
            if(bool[i]){
                continue;
            }
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    bool[j]=true;
                }
                
            }
            if(count>1){
                System.out.print(a[i]+" ");
            }            
         
        }
  }
}
