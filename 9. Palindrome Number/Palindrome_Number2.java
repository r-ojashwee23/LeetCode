// Approach: Reversing the string(4 ms)

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x!=0 && x%10==0){
            return false;
        }
        int rev=0;
        while(x>rev){
            rev=rev*10+x%10;
            x/=10;
        }
        if(rev==x || x==rev/10){
            return true;
        }
        return false;
    }
}
