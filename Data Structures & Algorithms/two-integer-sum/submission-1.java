class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexToNumMap = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if(indexToNumMap.containsKey(target - nums[i])) {
                result[0] = indexToNumMap.get(target - nums[i]);
                result[1] = i;
                break;
            } 

            indexToNumMap.put(nums[i], i);
        }

        Arrays.sort(result);

        return result;
    }
}
