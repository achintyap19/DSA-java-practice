public class RotatebyK{
    public static void RotatebyKOPTIMAL(int[] arr, int k){
        reverse(arr,arr+k);
        reverse(arr+k,arr+n);
        reverse(arr,arr+n);
    }
    public static void RotatebyK(int[] arr, int k){
        int n=arr.length;
        k=k%n;
    
        int[] temp=new int[k];
        for(int i=0;i<k;i++){  //inserting the elements in temp arr
            temp[i]= arr[i];
        }
        for(int i=k;i<n;i++){  //left shift by k places
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<n;i++){
            arr[i]=temp[i-(n-k)];
        }
        /*
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[j];
        }
        */
       for(int i=0;i<n;i++){
        System.out.println(arr[i]);
       }

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        RotatebyK(arr,2);
    }
}