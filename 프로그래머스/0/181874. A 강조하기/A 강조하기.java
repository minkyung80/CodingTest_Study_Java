class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i< myString.length(); i++){
            
            char mys = myString.charAt(i);
            
            if(mys == 'a' || mys == 'A'){
                answer += Character.toUpperCase(mys);
            }else{
                answer += Character.toLowerCase(mys);
            }
        }
        
        return answer;
    }
}