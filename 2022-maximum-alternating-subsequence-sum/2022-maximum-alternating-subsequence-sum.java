class Solution {
    
    public long maxAlternatingSum(int[] nums) {
        long even = 0;  
        long odd = 0;   

        for (int i=0;i<nums.length;i++) {
        
            even = Math.max(even, odd + nums[i]);
         
            odd = Math.max(odd, even - nums[i]);
        }

        return even; 
    }
}