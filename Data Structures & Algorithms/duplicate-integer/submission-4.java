class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for(int i: nums){
            if(numbers.get(i) == null){
                numbers.put(i, i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}