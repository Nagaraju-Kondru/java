class Array_Remove_Dublicates{
    public static void main(String args[]){
        int a[]={1,1,2,2,3,1,4,2,5,6,3,11};
        boolean bool[]=new boolean[a.length];
        for(int i=0;i<a.length;i++){
            if(bool[i]){
                continue;
            }
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    bool[i]=true;
                }
            }
            if(!bool[i]){
                System.out.println(a[i]);
            }
        }
        
    }
}
