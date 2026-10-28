class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int result = 0;

        Set<Integer> hashSet = new HashSet<>();

        for(int i = 0; i < n; i++) {
            hashSet.add(nums[i]);
        }

        for(int i = 0; i < n; i++) {
            if(!hashSet.contains(nums[i] - 1)) {
                int start = nums[i];
                int currStrech = 0;

                while(true) {
                    if(hashSet.contains(start++)) {
                        currStrech += 1;
                        result = Math.max(result, currStrech);
                    } else {
                        result = Math.max(result, currStrech);
                        break;
                    }
                }
            }
        }

        return result;
    }
}
