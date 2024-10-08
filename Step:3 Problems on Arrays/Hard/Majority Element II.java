Date: 08.10.24
  class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        if(n<=2 ){
            if (n == 1 || nums[0] == nums[1]) {
                return Arrays.asList(nums[0]); 
            }
            return Arrays.stream(nums).boxed().collect(Collectors.toList());
            }
        
            
        for(int i=0; i<nums.length; i++){
            int count =1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
               
            }
            if (count > n / 3 && !result.contains(nums[i])) {
                result.add(nums[i]);
            
        }
        
    }
    return result;
    
    }
}
