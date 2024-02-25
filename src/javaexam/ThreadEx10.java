package javaexam;

class ThreadEx10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadEx10());
        t.setDaemon(true); // t 쓰레드를 데몬 쓰레드로 설정한다. 매개변수에 true를 넣어주어야 한다.
        t.start();
        // 또한 setDaemon(true); 은 start()가 호출되기 전에 실행되어야 한다. 그렇지 않으면
        // IllegalThreadStateException이 발생합니다.

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);

            if (i == 5)
                autoSave = true;
        }

        System.out.println("프로그램이 종료되었습니다.");
    }

    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
            }

            if (autoSave) {
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("자동 저장되었습니다.");
    }
}