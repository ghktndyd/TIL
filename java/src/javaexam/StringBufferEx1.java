package javaexam;

public class StringBufferEx1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.toString() == sb2.toString() ? " + sb.toString().equals(sb2.toString()));
        System.out.println("sb.toString() == sb2.toString() ? " + sb.toString().contentEquals(sb2)); // 위와 동일
    }
}
