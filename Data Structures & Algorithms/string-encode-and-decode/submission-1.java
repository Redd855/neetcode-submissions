class Solution {

    public String encode(List<String> strs) {
        String result = "";

        for (String str : strs) {
            int wordLength = str.length();
            result += wordLength + "#" + str;
        }

        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find '#'
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Everything before '#' is the length
            int length = Integer.parseInt(str.substring(i, j));

            // Word begins after '#'
            int wordStart = j + 1;
            int wordEnd = wordStart + length;

            String word = str.substring(wordStart, wordEnd);

            result.add(word);

            // Move to the next encoded string
            i = wordEnd;
        }

        return result;
    }
}