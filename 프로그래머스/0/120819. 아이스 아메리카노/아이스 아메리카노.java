class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cup = money / 5500;
        int changes = 0;
        if (money >= 5500) {
            changes = money - (5500 * cup); 
        } else {
            changes = money;
        }
        answer[0] = cup;
        answer[1] = changes;
        return answer;
    }
}