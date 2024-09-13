class Solution {
    public int solution(int price) {
        int answer = 0;
        int smallDiscount = 5;
        int mediumDiscount = 10;
        int bigDiscount = 20;
        
        if (price >= 500_000) {
            answer = price * (100 - bigDiscount) / 100;
            return answer;
        }
        
        if (price >= 300_000) {
            answer = price * (100 - mediumDiscount) / 100;
            return answer;
        }
        
        if (price >= 100_000 ) {
            answer = price * (100 - smallDiscount) / 100;
            return answer;
        }
        
        answer = price;
        return answer;
    }
}