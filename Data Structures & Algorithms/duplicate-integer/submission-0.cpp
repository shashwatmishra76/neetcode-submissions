class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> numsTracker;
        
        for(int i = 0; i < nums.size(); i++) {
            if(numsTracker.find(nums[i]) != numsTracker.end()) {
                return true;
            }

            numsTracker.insert(nums[i]);
        }

        return false;
     }
};
