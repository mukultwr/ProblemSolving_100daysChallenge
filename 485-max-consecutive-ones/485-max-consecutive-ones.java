class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
      
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==1) count++;
                else break;
            }
           ans=Math.max(ans,count);
        }
        return ans;
    }
}