class Solution {
    public boolean hasDuplicate(int[] nums) {
        int len = nums.length;
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums){
            numbers.add(num);
        }
        return numbers.size() != nums.length;
    }
}