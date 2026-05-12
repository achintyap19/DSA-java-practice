public class RemoveDuplicates{
    public static int RemoveDuplicates(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
               i++;
               arr[i]=arr[j];

            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4};
        int newlength=RemoveDuplicates(arr);
        for(int k=0;k<newlength;k++){
            System.out.println(arr[k]);
        }

    }
}