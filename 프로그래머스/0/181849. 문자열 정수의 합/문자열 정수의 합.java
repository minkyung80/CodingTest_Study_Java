class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for(int i =0; i < num_str.length(); i++){
            char numS = num_str.charAt(i);
            
            answer += (int)(numS - '0');
        }
        
        return answer;
    }
}