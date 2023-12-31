class Solution {
    public int findDuplicate(int[] nums) {
       // first approach
      //  Arrays.sort(nums);

      //  for(int i=0; i<nums.length; i++) {
      //     if(nums[i] == nums[i+1]) {
      //        return nums[i];
      //     }
      //  } 
      //  return 0;


      // slow and fast pointer technique

         int slow = nums[0];
         int fast = nums[nums[0]];

         do {
           slow = nums[slow];
           fast = nums[nums[fast]];
         } while (slow != fast);

        fast = 0;

         while(slow != fast) {
           slow = nums[slow];
           fast = nums[fast];
         }
         return slow;
    }
}
