class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strAb = "" + a + b;
        
        int intAb = Integer.parseInt(strAb);
        int mut = 2*a*b;
        
        if(intAb < mut){
            return mut;
        }else{
            return intAb;
        }
    }
}