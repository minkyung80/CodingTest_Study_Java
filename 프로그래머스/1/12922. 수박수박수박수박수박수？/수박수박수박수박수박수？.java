class Solution {
    public String solution(int n) {
        String answer = "";
        String subak = "";

        for(int i =0; i < n; i++){
            if((i+1)% 2 != 0){
                answer += "수";
            }else{
                answer += "박";
            }
        }
        
        return answer;
    }
}