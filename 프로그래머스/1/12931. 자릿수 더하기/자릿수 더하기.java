import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String sn = Integer.toString(n);
        
        for(int i = 0; i < sn.length(); i++){
            char csn = sn.charAt(i);
            answer += (int)(csn - '0');
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}