class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int j = 0;
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>=50 && arr[i]%2==0){
                answer[j] += arr[i]/2;
            }else if(arr[i] <= 50 && arr[i]%2 ==1){
                answer[j] += arr[i]*2;
            }else{
                answer[j] += arr[i];
            }
            j++;
        }
        
        return answer;
    }
}