class CommonElementsCount{
    public static void main(String args[]){
        int a[]={1,2,3,3,2,4,5,6,1,4};
        int b[]=new int[a.length];
        int visit=-1;
        for(int i=0;i<a.length;i++){
            if(b[i]==visit){
                continue;
            }
            int count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    b[j]=visit;
                    
                }
                b[i]=count;
            }
            
        }
        for(int i=0;i<a.length;i++){
            if(b[i]!=visit){
                System.out.println(a[i]+"-->"+b[i]);
            }
        }
    }
}
