class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        int i =0;
        
        for(i = 0; i < arr.length; i++){
            if(arr.length % 2 == 0){
                if(i % 2 != 0){
                    answer[i] = arr[i] += n;  
                }else{
                    answer[i] = arr[i];
                }
            }
            else if(arr.length % 2 != 0){
                if(i % 2 == 0){
                    answer[i] = arr[i] += n;  
                }else{
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}