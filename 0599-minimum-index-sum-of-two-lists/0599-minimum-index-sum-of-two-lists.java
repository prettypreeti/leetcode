class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
         Map<String, Integer> indexMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        
        // Store list1 elements with their indices
        for (int i = 0; i < list1.length; i++) {
            indexMap.put(list1[i], i);
        }
        
        // Iterate through list2 and find the minimum index sum
        for (int j = 0; j < list2.length; j++) {
            if (indexMap.containsKey(list2[j])) {
                int i = indexMap.get(list2[j]);
                int sum = i + j;
                
                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(list2[j]);
                } else if (sum == minSum) {
                    result.add(list2[j]);
                }
            }
        }
        
        return result.toArray(new String[0]);
        
    }
}