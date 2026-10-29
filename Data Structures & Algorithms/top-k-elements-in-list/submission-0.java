class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int num : nums) {
            if(!frequencyMap.containsKey(num)) {
                frequencyMap.put(num, 1);
            } else {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> 
            Integer.compare(frequencyMap.get(b), frequencyMap.get(a))
        );

        frequencyMap.keySet().forEach(key -> pq.offer(key));

        for(int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        
        return result;
    }
}
