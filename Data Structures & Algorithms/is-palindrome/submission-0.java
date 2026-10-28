class Solution {
    public boolean isPalindrome(String s) {
        String sensitizedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0, r = sensitizedString.length() - 1;

        while(l <= r) {
            if(sensitizedString.charAt(l++) != sensitizedString.charAt(r--)) {
                return false;
            }
        }

        return true;
    }
}
