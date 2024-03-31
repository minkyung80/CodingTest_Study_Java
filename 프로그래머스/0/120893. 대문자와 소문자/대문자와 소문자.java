class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
           char myS = my_string.charAt(i);
        
            if('A' <= myS && myS <= 'Z'){
                answer += Character.toLowerCase(myS);
            }else{
                answer += Character.toUpperCase(myS);
            }
        }
        
        return answer;
    }
}