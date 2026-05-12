public class TwoSum{
    public static void TWOsum(int[] nums,int target){
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                System.out.println("yes found");
            }
            else if(sum<target)
        }
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        TWOsum(nums,1);

    }
}