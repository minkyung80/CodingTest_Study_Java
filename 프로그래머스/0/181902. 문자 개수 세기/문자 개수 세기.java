class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i < my_string.length(); i++){
           char chS = my_string.charAt(i);
            
            if('A' <= chS &&  chS <= 'Z'){
                int NchS = chS - 'A';
                answer[NchS] += 1;
            }
            else if('a' <= chS && chS <= 'z'){
                int NchS = chS - ('A'+6);
                answer[NchS] += 1;
            }
                        
        }
        
        return answer;
    }
}