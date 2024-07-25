package thread;

public class EndlessThread extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(System.currentTimeMillis());
                Thread.sleep(1000); // 1초간 멈춘다.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
