class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String result = Integer.toString(a) + Integer.toString(b);
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