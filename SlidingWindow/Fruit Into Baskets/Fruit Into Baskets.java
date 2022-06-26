public class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> baskets = new HashMap<>();
        
        int s = 0;
        int count = 0;
        int max = 0;
        for(int e = 0; e < fruits.length; e++) {
            baskets.put(fruits[e], baskets.getOrDefault(fruits[e], 0)+1);
            count++;
            while(baskets.size() > 2) {
                if(baskets.get(fruits[s]) == 1) {
                    baskets.remove(fruits[s++]);
                } else {
                    baskets.put(fruits[s], baskets.get(fruits[s++]) -1);
                }
                count--;
            }
            max = Math.max(count, max);
        }
        return max;
    } 
}
