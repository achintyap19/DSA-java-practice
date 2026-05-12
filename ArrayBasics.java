import java.util.Scanner;
public class ArrayBasics{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n=sc.nextInt();

        int[] arr= new int[n];

        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("the array is:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }

        System.out.println("enter the element to find inside the array:");
        int num=sc.nextInt();

        for(int i=0;i<n;i++){
            if(num==arr[i]){
                System.out.println("Element found at "+ i + "th index");
                break;
            }
            
        }
        
        
    }
}