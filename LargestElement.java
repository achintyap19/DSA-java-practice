public class LargestElement{
    public static void LargestElement(int[] arr){
       
        int largest=arr[0];
    
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("the largest element is " + largest);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        LargestElement(arr);
    }
}