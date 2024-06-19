class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        float div = (float)num1 / (float)num2;
        answer = (int)(div * 1000);
        return answer;
    }
}