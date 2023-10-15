class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i >= 0; i--) {
            //checks if number is less than 9 than add 1 and return it
            if(digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            //else change the digit to 0
            else{
                digits[i] = 0;
            }
        }
        //if all number greater than 9 then this code will execute
        int[] ans = new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}
