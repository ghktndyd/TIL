package javaexam;

public class NexExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
        } catch (MemoryException | SpaceException me) {
            throw new RuntimeException(me);
        }
    }

    static void startInstall() throws SpaceException, MemoryException{
        if (!enoughSpace()) {
            throw new SpaceException("설치할 공간이 부족합니다.");
        }

        if (!enoughMemory()) {
            throw new MemoryException("메모리가 부족합니다.");
        }
    }

    static boolean enoughMemory() {
        return true;
    }

    static boolean enoughSpace() {
        return false;
    }

    private static class SpaceException extends Exception {
        public SpaceException(String message) {
            super(message);
        }
    }

    private static class MemoryException extends Exception {
        public MemoryException(String message) {
            super(message);
        }
    }
}
