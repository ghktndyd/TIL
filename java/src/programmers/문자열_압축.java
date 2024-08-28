package programmers;

import java.util.ArrayList;
import java.util.List;

public class 문자열_압축 {
    public static void main(String[] args) {
        문자열_압축 문자열_압축 = new 문자열_압축();

        int aabbaccc = 문자열_압축.solution("aabbaccc");

        System.out.println("aabbaccc = " + aabbaccc);
    }

    public int solution(String s) {
        if (s.length() == 1) {
            return 1;
        }

        int min = Integer.MAX_VALUE; // 가장 짧은 압축 문자열의 길이를 담는 변수

        int maxLength = s.length() / 2;

        // 자르기를 시작 1 ~ 문자열 길이의 절반까지 모두 잘라보기
        for (int length = 1; length <= maxLength; length++) {
            int compressed = compress(s, length);

            if (compressed < min) {
                min = compressed;
            }
        }

        return min;
    }

    /**
     * @param source
     * @param length
     * @return 압축한 문자열의 길이를 반환
     */
    private int compress(String source, int length) {
        StringBuilder sb = new StringBuilder();

        String last = "";
        int count = 0;
        for (String token : split(source, length)) {
            if (token.equals(last)) {
                count++;
            } else {
                if (count > 1) {
                    sb.append(count);
                }

                sb.append(last);
                last = token;
                count = 1;
            }
        }

        if (count > 1) {
            sb.append(count);
        }

        sb.append(last);

        return sb.length();
    }

    /**
     * @param source
     * @param length
     * @return 문자열을 length 길이만큼 잘라서 List에 담아서 반환
     */
    private List<String> split(String source, int length) {
        List<String> tokens = new ArrayList<>();

        for (int startIndex = 0; startIndex < source.length(); startIndex += length) {
            int endIndex = startIndex + length;
            if (endIndex > source.length()) {
                endIndex = source.length();
            }

            tokens.add(source.substring(startIndex, endIndex));
        }

        return tokens;
    }
}
