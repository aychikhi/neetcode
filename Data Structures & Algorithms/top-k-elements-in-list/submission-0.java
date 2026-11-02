class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        HashMap<Integer, Integer> map = new HashMap<>();
        int f = 1;
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                f = 1;
            map.put(nums[i], f++);
        }
        int[] result = new int[k];

        for(int i = 0; i < k; i++){
            int max = Collections.max(map.values());
            int key = 0;
            for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                if(entry.getValue() == max){
                    key = entry.getKey();
                    break;
                }
            }

            result[i] = key;
            map.remove(key);
        }
        
        return result;
    }
}
