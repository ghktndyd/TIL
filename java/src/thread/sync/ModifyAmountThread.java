package thread.sync;

public class ModifyAmountThread extends Thread {

    private CommonCalculate calculate;
    private boolean addFlag;

    public ModifyAmountThread(CommonCalculate calculate, boolean addFlag) {
        this.calculate = calculate;
        this.addFlag = addFlag;
    }

    @Override
    public void run() {
        for (int loop = 0; loop < 10000; loop++) {
            if (addFlag) {
                calculate.plus(1);
            } else {
                calculate.minus(1);
            }
        }
    }
}
