class Solution {
    public int solution(String binomial) {
        int answer=0;
        
       String num[] = binomial.split(" ");
        
        if(num[1].equals("+")) 
            answer = Integer.parseInt(num[0]) + Integer.parseInt(num[2]);
        else if(num[1].equals("-"))
            answer = Integer.parseInt(num[0]) - Integer.parseInt(num[2]);
        else if(num[1].equals("*"))
            answer = Integer.parseInt(num[0]) * Integer.parseInt(num[2]);
        
        
        return answer;
    }
}