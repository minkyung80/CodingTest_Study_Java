class Solution {
    public int[] solution(int start, int end_num) {
        
        int SE = start - end_num; 
        int[] answer = new int[SE + 1];
        
        for(int i = 0; i <= SE ;  i++ ){
            answer[i] += start;
            start -= 1;
        }
        
        return answer;
    }
}