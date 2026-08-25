class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> sChars = new HashMap<>();
        HashMap<Character, Integer> tChars = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            sChars.put(s.charAt(i), sChars.getOrDefault(s.charAt(i), 0) + 1);
            tChars.put(t.charAt(i), tChars.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sChars.equals(tChars);

    }
}
