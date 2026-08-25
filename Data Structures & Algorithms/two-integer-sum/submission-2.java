class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            indices.put(nums[i],i);
        }


        for(int i = 0; i <nums.length; i++){
            int targetNum = target - nums[i];
            if(indices.containsKey(targetNum) && indices.get(targetNum) != i){
                return new int[]{i, indices.get(targetNum)};
            }
        }

        return new int[0];
    }
}
