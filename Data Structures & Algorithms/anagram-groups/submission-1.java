class Solution {
    private String getSortedString(String s) {
        char[] charArr = s.toCharArray();

        Arrays.sort(charArr);

        return new String(charArr);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> stringHashes = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String sortedStringKey = getSortedString(strs[i]);

            if(!stringHashes.containsKey(sortedStringKey)) {
                stringHashes.put(sortedStringKey, new ArrayList<>());
            }

            stringHashes.get(sortedStringKey).add(strs[i]);           
        }

        stringHashes.forEach((key, value) -> {
            result.add(value);
        });

        return result;
    }
}
