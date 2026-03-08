class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder x = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            x.append(nums[i].charAt(i)=='1'?'0':'1');
        }
        return x.toString();
    }
}
