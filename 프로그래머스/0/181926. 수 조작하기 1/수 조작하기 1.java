class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        
        for(int i = 0; i < control.length(); i++){
             char con = control.charAt(i);   
            
            if(con == 'w'){
                n += 1;
            }else if(con == 's'){
                n -= 1; 
            }else if(con == 'd'){
                n += 10;
            }else if(con == 'a'){
                n -= 10;
            }
        }
        
        return answer += n;
    }
}