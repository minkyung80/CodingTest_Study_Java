class Solution {
    public int solution(int[] arr1, int[] arr2) {
       
        int answer = 0;
        int arr1result = 0;
        int arr2result = 0;
        
        
       if(arr1.length == arr2.length){
           
           for(int i=0; i < arr1.length; i++){
                arr1result += arr1[i];
                arr2result += arr2[i];
           }
           
           answer = (arr1result < arr2result) ? -1 : (arr1result > arr2result) ?            1:0;      
       }else{
            answer = (arr1.length < arr2.length) ? -1 : 1;
       }
        return answer;
    }
}