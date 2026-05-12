public class MissingNumber{
    public static void MissingNumber(int[] arr){
        int n=arr.length+1;   //if 0-n then size=n else 1-n size=+1
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int totSum=(n*(n+1))/2;
        System.out.println(totSum-sum);
    }
    
        
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        MissingNumber(arr);
    }

}