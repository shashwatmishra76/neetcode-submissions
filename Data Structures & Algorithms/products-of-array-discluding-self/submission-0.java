class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] lProd = new int[n];
        int[] rProd = new int[n];
        int[] result = new int[n];

        // Initialization
        lProd[0] = 1;
        rProd[n - 1] = 1;

        // Prepopulate products
        for(int i = 1; i < n; i++) {
            lProd[i] = lProd[i - 1] * nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--) {
            rProd[i] = rProd[i + 1] * nums[i + 1];
        }

        for(int i = 0; i < n; i++) {
            result[i] = lProd[i] * rProd[i];
        }

        return result;
    }
}  
