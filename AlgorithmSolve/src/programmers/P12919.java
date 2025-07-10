package programmers;

public class P12919 {
    public String solution(String[] seoul) {
        int index = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
            }
        }

        return String.format("김서방은 %d에 있다", index);
    }
}
