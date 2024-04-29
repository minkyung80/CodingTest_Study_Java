class Solution {
    public int solution(int n) {
        int answer = 0;
        int num = 1;
        
        while(true){
            if(n % num == 1){
                answer = num;
                break;
            }else{
                num++;
            }
        }
        
        return answer;
    }
}