class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> FirstNum = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            int num = nums[i];
            int difference = target - num;

            if( FirstNum.containsKey(difference)){
                return new int[] {FirstNum.get(difference), i};
            }
            FirstNum.put(num, i);
        }

        return new int[] {};
        
    }
}
