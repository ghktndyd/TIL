package thread;

public class RunEndlessThreads {
    public static void main(String[] args) {
        RunEndlessThreads sample = new RunEndlessThreads();
        sample.endless();
    }

    public void endless() {
        EndlessThread endlessThread = new EndlessThread();
        endlessThread.start();
    }
}
