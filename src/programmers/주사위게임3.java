package programmers;

public class 주사위게임3 {
    class Solution {
        public int solution(int a, int b, int c, int d) {
            int[] counts = new int[7]; // 주사위 눈금 1~6까지의 갯수를 저장할 배열
            counts[a]++;
            counts[b]++;
            counts[c]++;
            counts[d]++;

            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 4) {
                    // 네 주사위가 모두 같은 경우
                    return 1111 * i;
                } else if (counts[i] == 3) {
                    // 세 주사위가 같고 하나가 다른 경우
                    for (int j = 1; j <= 6; j++) {
                        if (counts[j] == 1) {
                            return (int) Math.pow(10 * i + j, 2);
                        }
                    }
                } else if (counts[i] == 2) {
                    // 두 주사위가 같은 경우, 나머지 두 주사위에 대한 처리 필요
                    for (int j = i + 1; j <= 6; j++) {
                        if (counts[j] == 2) {
                            // 또 다른 두 주사위도 같은 경우
                            return (i + j) * Math.abs(i - j);
                        }
                    }
                    // 하나의 쌍만 있는 경우, 다른 두 개의 수로 점수 계산
                    int q = 0, r = 0;
                    for (int j = 1; j <= 6; j++) {
                        if (counts[j] == 1) {
                            if (q == 0) q = j;
                            else r = j;
                        }
                    }
                    return q * r;
                }
            }

            // 모두 다른 경우, 가장 작은 숫자 찾기
            for (int i = 1; i <= 6; i++) {
                if (counts[i] == 1) {
                    return i; // 모두 다를 때, 가장 작은 숫자 반환
                }
            }

            return 0; // 기본 반환값, 이론상 여기에 도달할 일은 없음
        }
    }
}

