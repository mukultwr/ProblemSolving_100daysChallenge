class Solution {
    public int maxSubArray(int[] arr) {
//         int sum=nums[0];
       
//         for(int i=0;i<nums.length;i++){
//            int curSum=0;
//             for(int j=i;j<nums.length;j++){
//                 curSum=curSum+nums[j];
//                 sum=Math.max(sum,curSum);
//             }
//             //sum=Math.max(curSum,sum);
//         }
//         return sum;
        if(arr.length==1){
            return arr[0];
        }
        int curSum=arr[0];
        int sum=arr[0];
        for(int i=1;i<arr.length;i++){
            curSum=Math.max(curSum+arr[i],arr[i]);
            sum=Math.max(curSum,sum);
        }
        return sum;
    }
}