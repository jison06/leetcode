public class contains_duplicates {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer>h = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(h.containsKey(nums[i]))
                return true;
            h.put(nums[i], h.getOrDefault(nums[i], 0)+1);
        }
        return false;
    } 
}
