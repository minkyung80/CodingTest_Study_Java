class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxnum =0;
        int idx = 0;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] > maxnum){
                maxnum = array[i];
                idx = i;
            }
        }
        
        answer[0] += maxnum;
        answer[1] += idx;
        
        
        return answer;
    }
}