class Solution {
    public int[] solution(String myString) {
        
        String[] StrX = myString.split("x", -1);
        int[] answer = new int[StrX.length];
        
        for(int i = 0; i < StrX.length; i++){
            answer[i] = StrX[i].length();
        }
        
        return answer;
    }
}