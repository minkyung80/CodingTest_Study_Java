class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            char mys = my_string.charAt(i);
            
            if(mys == alp.charAt(0)){
                answer += Character.toUpperCase(mys);
            }else{
                answer += mys;
            }
        }
        
        return answer;
    }
}