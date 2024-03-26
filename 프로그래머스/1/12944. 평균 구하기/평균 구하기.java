class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double add = 0;
        
        for(int i = 0; i < arr.length; i++){
            add += arr[i];
        }
        answer = add/arr.length;
        
        return answer;
    }
}