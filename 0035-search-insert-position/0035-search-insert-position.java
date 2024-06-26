class Solution {
    public int searchInsert(int[] nums, int target) {
 int left = 0, right = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            int mid = (left + right)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
        
}




// int start = 0;
//         int end = nums.length-1;

//         while(start<=end){
//             int mid = start+(end-start)/2;
//             if(target == nums[mid]){
//                 return mid;
//             }
//             else if(target>nums[mid]){
//                 start = mid+1;
//             }
//             else{
//                 end = mid-1;

//             }

//         }

//         return start;
       
// }