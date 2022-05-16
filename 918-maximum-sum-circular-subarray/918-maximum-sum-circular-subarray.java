class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    //     int res=nums[0];
    //     int n=nums.length;
    //     for(int i=0;i<nums.length;i++){
    //         int curSum=nums[i];
    //         int curMax=nums[i];
    //         for(int j=1;j<nums.length;j++){
    //             int index=(i+j)%n;
    //             curSum+=nums[index];
    //             curMax=Math.max(curSum,curMax);
    //         }
    //         res=Math.max(curMax,res);
    //     }
    //     return res;
        int max_normal=normalMaxSum(nums);
        if(max_normal<0){
            return max_normal;
        }
        int nums_sum=0;
        for(int i=0;i<nums.length;i++){
            nums_sum+=nums[i];
            nums[i]=-nums[i];
        }
        int max_circular=nums_sum+normalMaxSum(nums);
        return Math.max(max_normal,max_circular);
    
    }
    int normalMaxSum(int[] nums){
        int res=nums[0];
        int curSum=nums[0];
        
        for(int i=1;i<nums.length;i++){
             curSum=Math.max(curSum+nums[i],nums[i]);
            res=Math.max(curSum,res);
            
        }
        return res;
    }
}