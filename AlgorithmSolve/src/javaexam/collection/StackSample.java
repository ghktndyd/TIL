package javaexam.collection;

import java.util.Stack;

public class StackSample {
    public static void main(String[] args) {
        StackSample stackSample = new StackSample();
        stackSample.checkPeek();
    }

    private void checkPeek() {
        Stack<Integer> intStack = new Stack<>();

        for (int loop = 0; loop < 5; loop++) {
            intStack.push(loop);
            System.out.println("intStack.peek = " + intStack.peek());
        }

        int size = intStack.size();
        System.out.println("size = " + size);
    }
}
