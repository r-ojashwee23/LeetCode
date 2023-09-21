class Solution {
    public int romanToInt(String s) {
        int currVal=0;
        int prevVal=0;
        int res=0;
        
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)=='I'){
                currVal=1;
            }
            if(s.charAt(i)=='V'){
                currVal=5;
            }
            if(s.charAt(i)=='X'){
                currVal=10;
            }
            if(s.charAt(i)=='L'){
                currVal=50;
            }
            if(s.charAt(i)=='C'){
                currVal=100;
            }
            if(s.charAt(i)=='D'){
                currVal=500;
            }
            if(s.charAt(i)=='M'){
                currVal=1000;
            }
            if(currVal<prevVal){
                res-=currVal;
            }
            else{
                res+=currVal;
            }
            prevVal=currVal;
        }
        return res;
        
    }
}
