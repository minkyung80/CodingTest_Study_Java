class Solution {
    public String[] solution(String[] names) {
        
        int num = names.length % 5 == 0 ? names.length/5 : names.length/5+1;
        
        String[] answer = new String[num];
        int count=0;
        
      
        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0){
            answer[count] = "";
            answer[count] += names[i];
            count++;
            }else continue;
        }

        return answer;
    }
}