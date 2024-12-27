package programmers;

public class P12918 {
    public boolean solution(String s) {
        int length = s.length();
        return (length == 4 || length == 6) && isDigit(s);
    }

    private static boolean isDigit(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
