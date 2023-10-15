// This code can't handle long inputs

class Solution {
    public int[] plusOne(int[] digits) {
        int lastDigit=digits[digits.length-1];
        if(lastDigit<=8){
            lastDigit++;
            digits[digits.length-1]=lastDigit;
            return digits;
        }
        ArrayList<Integer> al=new ArrayList<>();
        int num=0;
        for(int i=0; i<digits.length; i++){
            num=num*10+digits[i];
        }
        num+=1;
        while(num!=0){
            al.add(num%10);
            num/=10;
        }
        Collections.reverse(al);
        int resultArray[]=new int[al.size()];
        for(int i=0; i<al.size(); i++){
            resultArray[i]=al.get(i);
        }
        System.out.println(num);
        return resultArray;
    }
}
