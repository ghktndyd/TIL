package programmers;

public class P82612 {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;

        int playCount = 1;
        while (count-- > 0) {
            totalPrice += (long) price * playCount;
            playCount++;
        }

        if (totalPrice > money) {
            return (long) Math.abs(money - totalPrice);
        }

        return 0;
    }
}
