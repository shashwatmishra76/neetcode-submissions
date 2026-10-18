class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        // Declaring the result vector
        vector<vector<string>> result;

        // Declaring the hash map to store sorted value of strings against the list
        unordered_map<string, vector<string>> hashMap;

        for(auto str : strs) {
            string unsortedString = str;
            sort(str.begin(), str.end());
            if(hashMap.find(str) != hashMap.end()) {
                hashMap[str].push_back(unsortedString);
            } else {
                vector<string> stringVector;
                stringVector.push_back(unsortedString);
                hashMap.insert({str, stringVector});
            }
        }
        
        for(auto i : hashMap) {
            result.push_back(i.second);
        }

        return result;

    }
};
