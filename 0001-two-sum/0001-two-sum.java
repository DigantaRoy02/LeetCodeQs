class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int tempp = 0;
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            tempp = target - nums[i];
            if(map.containsKey(nums[i])){
                arr[0] = i;
                arr[1] = map.get(nums[i]);
                return arr;
            }
            map.put(tempp,i);
        }
        return arr;
    }
}
//using hashmap