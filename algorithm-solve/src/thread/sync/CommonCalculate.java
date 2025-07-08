package thread.sync;

public class CommonCalculate {

    private int amount;

    public CommonCalculate() {
        this.amount = 0;
    }

    public synchronized void plus(int value) {
        amount += value;
    }

    public synchronized void minus(int value) {
        amount -= value;
    }

    public int getAmount() {
        return amount;
    }
}
