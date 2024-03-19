class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = ""+a+b;
        String ba = ""+b+a;
        
        int intab = Integer.valueOf(ab);
        int intba = Integer.valueOf(ba);
        
        answer = intab > intba? intab: intba;
        
        
        return answer;
    }
}