package javaexam.collection;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample listSample = new ListSample();
        listSample.checkArrayList1();

        listSample.checkArrayList4();
    }

    private void checkArrayList1() {
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add(new Object());
        list1.add("ArrayListSample");
    }

    public void checkArrayList4() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");

        ArrayList<String> list2 = list1;
        list1.add("PPLE");

        for (String temp : list2) {
            System.out.println("temp = " + temp);
        }
    }
}
