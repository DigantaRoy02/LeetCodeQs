class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp = 0;
        int arr[] = new int[2];
        for(int i=0;i<nums.length;i++){
            temp = target - nums[i];
            if(map.containsKey(nums[i])){
                arr[0] = i;
                arr[1] = map.get(nums[i]);
                return arr;
            }
            map.put(temp,i);
        }
        return arr;
    }
}
//using hashmap