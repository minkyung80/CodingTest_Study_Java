class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int add = 0;
        int multiply = 1;
        
        for(int i = 0; i< num_list.length; i++){
            add += num_list[i];
            multiply *= num_list[i];
        }
        
        if((add*add) > multiply){
            return 1;
        }
        
        return 0;
    }
}