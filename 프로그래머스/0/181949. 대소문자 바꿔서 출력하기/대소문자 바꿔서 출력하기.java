import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for(int i =0; i < a.length(); i++){
           char aChar = a.charAt(i);
            if(aChar >= 'A' && aChar <= 'Z'){
                result += String.valueOf(aChar).toLowerCase();
            }else {
                result += String.valueOf(aChar).toUpperCase();
            }
        }
        System.out.println(result);
    }
}