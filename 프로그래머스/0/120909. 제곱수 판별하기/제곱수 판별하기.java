class Solution {
    public int solution(int n) {
        int answer = 2;
        double result = Math.sqrt(n);
        if (result % 1 == 0) {
            answer = 1;
        }
        return answer;
    }
}