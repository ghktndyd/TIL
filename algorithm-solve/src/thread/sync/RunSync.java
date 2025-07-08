package thread.sync;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        runSync.runCommonCalculate();
    }

    private void runCommonCalculate() {
        CommonCalculate commonCalculate = new CommonCalculate(); // CommonCalculate 객체 생성
        ModifyAmountThread thread1 = new ModifyAmountThread(commonCalculate, true); // plus 메서드만 수행하도록 하기 위해서 설정
        ModifyAmountThread thread2 = new ModifyAmountThread(commonCalculate, true); // plus 메서드만 수행하도록 하기 위해서 설정

        thread1.start(); // 쓰레드 시작
        thread2.start(); // 쓰레드 시작

        try {
            thread1.join(); // join 메서드 호출, join 메서드는 쓰레드가 종료될 때까지 기다리는 메서드
            thread2.join();
            System.out.println("Final value is " + commonCalculate.getAmount()); // join이 끝나면 getAmount()로 결과 호출
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
