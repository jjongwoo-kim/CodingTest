import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";
        
        for (int i = 0; i < a.length(); i++) {
            char charA = a.charAt(i);
            
            if (Character.isUpperCase(charA)) {
                result += Character.toLowerCase(charA);
            } else {
                result += Character.toUpperCase(charA);
            }
        }
        System.out.println(result);
    }
}