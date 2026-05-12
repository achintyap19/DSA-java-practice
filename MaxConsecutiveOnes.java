public class MaxConsecutiveOnes{
    public static void MaxConsecOnes(int[] nums){
        int currentcnt=0;
        int maxcnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                currentcnt++;
                if(currentcnt>maxcnt){
                    maxcnt=currentcnt;
                }
            }
            else{
                currentcnt=0;
            }
            
        }
        System.out.println(maxcnt);
    }
    public static void main(String[] args) {
        int[] nums={1,0,1,1,0,0};
        MaxConsecOnes(nums);

    }
}