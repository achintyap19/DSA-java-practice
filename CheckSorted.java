public class CheckSorted {
    
    public static boolean CheckSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
               
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 9, 5};
        System.out.println(CheckSorted(arr)); 
    }
}
