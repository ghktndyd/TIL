package thread;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads daemonThreads = new RunDaemonThreads();
        daemonThreads.checkThreadProperty();
    }

    private void checkThreadProperty() {
        ThreadSample threadSample1 = new ThreadSample();
        ThreadSample threadSample2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();

        System.out.println("threadSample1.getId() = " + threadSample1.getId());
        System.out.println("threadSample2.getId() = " + threadSample2.getId());

        System.out.println("threadSample1.getName() = " + threadSample1.getName());
        System.out.println("threadSample2.getName() = " + threadSample2.getName());

        System.out.println("threadSample1.getPriority() = " + threadSample1.getPriority());

        daemonThread.setDaemon(true);
        System.out.println("threadSample1.isDaemon() = " + threadSample1.isDaemon());
        System.out.println("daemonThread.isDaemon() = " + daemonThread.isDaemon());
    }
}
