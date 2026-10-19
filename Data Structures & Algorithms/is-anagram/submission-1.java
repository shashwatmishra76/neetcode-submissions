class Solution {
    public boolean isAnagram(String s, String t) {
        int[] hashForStringOne = new int[26];
        int[] hashForStringTwo = new int[26];

        if(s.length() != t.length()) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            hashForStringOne[s.charAt(i) - 'a'] += 1;
            hashForStringTwo[t.charAt(i) - 'a'] += 1;
        }

        for(int i = 0; i < 26; i++) {
            if(hashForStringOne[i] != hashForStringTwo[i]) {
                return false;
            }
        }

        return true;
    }
}
