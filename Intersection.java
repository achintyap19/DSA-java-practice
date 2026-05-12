public class Intersection{
    public static void Intersection(int[] arr1, int[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        int i=0;
        int j=0;
        int k=0;
        int[] arr3 = new int[m+n];
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                arr3[k]=arr1[i];  //could also be arr3[k]=arr1[j]; as both elemtns are same
                i++;
                j++;
                k++;
            }
        }
        for(int f=0;f<k;f++){
            System.out.println(arr3[f]);
        }

    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,3};
        int[] arr2={2,3,5,6};
        Intersection(arr1,arr2);

    }
}