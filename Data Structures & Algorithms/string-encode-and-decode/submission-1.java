class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder("");

        for(int i = 0; i < strs.size(); i++) {
            encodedString.append(String.valueOf(strs.get(i).length()));
            encodedString.append("#");
            encodedString.append(strs.get(i));
        }
        System.out.println(encodedString);
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> result = new ArrayList<>();
        StringBuilder sizeOfStr = new StringBuilder("");

        while(i < str.length()) {
            if(str.charAt(i) == '#') {
                int lengthOfCurrString = Integer.parseInt(sizeOfStr.toString());
                String currString = str.substring(i + 1, i + 1 + lengthOfCurrString);
                result.add(currString);
                i = i + 1 + lengthOfCurrString;
                sizeOfStr = new StringBuilder("");
            } else if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sizeOfStr.append(str.charAt(i));
                i++;
            }
        }

        return result;
    }
}
