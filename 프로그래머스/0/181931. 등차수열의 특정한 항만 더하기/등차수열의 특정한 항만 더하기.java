class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int j=a;
        
        for(int i = 0; i < included.length; j=j+d){
            if(included[i]==true){
                answer += j;
            }
            i++;
        }
        
        return answer;
    }
}