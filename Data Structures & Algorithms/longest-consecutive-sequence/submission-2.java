class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> copiedNums = new HashSet<>();
        for(int num : nums) copiedNums.add(num);
        
        int result = 0;

        for(int num : nums){
            if(!copiedNums.contains(num - 1)){
                int currentNum = num;
                int currentStreak = 1;

                while(copiedNums.contains(currentNum + 1)){
                    currentNum += 1;
                    currentStreak += 1;
                }

                result = Math.max(result, currentStreak);
            }
        }
        return result;
    }
}
