class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for(int num : nums){
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            int number = entry.getKey();
            int frequency = entry.getValue();

            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(number);
        }

        int[] results = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] == null) {
                continue;
            }

            for (int num : buckets[i]) {
                results[index] = num;
                index++;

                if (index == k) {
                    return results;
                }
            }
        }

        return results;
    }
}
