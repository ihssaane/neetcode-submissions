class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> test= new HashSet<>();
        for (int i:nums)
        {
            if (!test.add(i)){
                return true;
            }

        }

        return false;

        
 
    }
}
