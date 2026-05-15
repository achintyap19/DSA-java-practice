class bs2{
    public static int nthRoot(int n, int m){
        int low=1;
        int high=m;
        int ans=-1;
        while(low<high){
            int mid = low+(high-low)/2;
            int value=1;
            for(int i=0;i<n;i++){
                value=value*mid;
            }
            if (value>m){
                break;
            }
            if(value==m){
                return mid;
            }else if(value>m){
                high = mid-1;
            }else{
                low = mid+1;
            }
           
        }return -1;
    } 
}