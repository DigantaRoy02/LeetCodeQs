class Solution {
    public boolean isPalindrome(int x) {
        if(x > 0){
            int x2 = x;
            int sum=0;
            while(x2>0){
                sum = (sum * 10) + (x2%10);
                x2 = x2/10;
            }
            if(sum == x)
            return true;
        }else if (x == 0){
            return true;
        }
        return false;
    }
}