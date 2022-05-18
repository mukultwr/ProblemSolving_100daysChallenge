class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            switch(nums[mid]){
                case 0:{
                    swap(nums,mid,low);
                    mid++;
                    low++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    swap(nums,mid,high);
                    high--;
                    break;
                }
            }
        }
//       for(int mid=0;mid<=high;mid++){
//             if(nums[mid]==0){
//                 swap(nums[mid],nums[low],nums);
//                 low++;
                 
                
//             }
//             else if(nums[mid]==1){
//                 mid++;
//             }
//             else if(nums[mid]==2){
//                 swap(nums[mid],nums[high],nums);
//                 high--;
                
               
            
//         }
//       }
    
    
    
    
    }
    public void swap(int[] nums, int i, int j) {
	int temp = nums[i];
	nums[i] = nums[j];
	nums[j] = temp;
}
}