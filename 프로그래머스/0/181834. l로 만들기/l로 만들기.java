class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i =0; i < myString.length(); i++){
           char chat = myString.charAt(i);
            
            if('l' > chat){
                answer += 'l';
            }else{
                answer += chat;
            }
            
        }
        
        return answer;
    }
}