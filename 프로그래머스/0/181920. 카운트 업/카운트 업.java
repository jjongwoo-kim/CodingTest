class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answers = new int[end_num - start_num + 1];
        int num = start_num;
        for (int i = 0; i < end_num - start_num + 1; i++) {
            answers[i] = num;
            num++;
        }
        return answers;
    }
}