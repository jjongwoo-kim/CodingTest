class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result = String.valueOf(a) + String.valueOf(b);
        int resultInt = Integer.parseInt(result);
        
        if(resultInt > 2 * a * b) {
            answer = resultInt;
        }
        else if(resultInt == 2 * a * b) {
            answer = resultInt;
        } else {
            answer = 2 * a * b;
        }
        return answer;
    }
}