class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        
        char my_char;
        String result = "";
        
        for(int i = 0; i < my_string.length(); i++){
  
            if(s<=i && i < s+overwrite_string.length()){
                my_char = overwrite_string.charAt(i-s);
                result += my_char;
            }else{
                my_char = my_string.charAt(i);
                result += my_char;
            }       
        }
        
        return result;
    }
}