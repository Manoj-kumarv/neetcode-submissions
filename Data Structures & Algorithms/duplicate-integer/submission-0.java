class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> saved = new HashSet<>();
        for(int i : nums){
            if(saved.contains(i)){
                return true;
            }
            saved.add(i);
        }
        return false;
    }
}