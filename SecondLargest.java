public class SecondLargest{

    public static void SecondLargest(int[] arr){

        int largest=arr[0];
        int slargest=-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        System.out.println(slargest);
    }
    public static void SecondSmallest(int[] arr){

        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]>smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        System.out.println(ssmallest);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,100};
        SecondLargest(arr);
        SecondSmallest(arr);
        
    }
}