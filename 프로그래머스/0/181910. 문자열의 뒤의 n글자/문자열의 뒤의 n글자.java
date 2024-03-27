class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int num = my_string.length() - n; 
        
        for(int i = 0; i < my_string.length(); i++){
            if(i>=num){
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}