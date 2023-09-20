// Approach: String matching(6 ms)

class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        if(s.charAt(0)=='-'){
            return false;
        }
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
