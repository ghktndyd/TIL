package codetree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 개발자의_능력_2 {
    public static int minDifference = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int developerCount = 6;
        int[] developers = new int[developerCount];

        for (int i = 0; i < developerCount; i++) {
            developers[i] = scanner.nextInt();
        }

        findMinDifference(developers);
        System.out.println(minDifference);
    }

    public static void findMinDifference(int[] skills) {
        boolean[] visited = new boolean[skills.length];
        // 모든 조합을 탐색하며 팀을 나눔
        divideTeams(skills, visited, 0, 0);
    }

    private static void divideTeams(int[] developers, boolean[] visited, int start, int count) {
        // 정확히 2명을 선택했을 때
        if (count == 2) {
            // 2명을 선택한 팀을 team1으로 두고 나머지를 나눔
            calculateTeams(developers, visited);
            return;
        }

        // 조합 탐색
        for (int i = start; i < developers.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                divideTeams(developers, visited, i + 1, count + 1);
                visited[i] = false;
            }
        }
    }

    private static void calculateTeams(int[] skills, boolean[] visited) {
        List<Integer> team1 = new ArrayList<>();
        List<Integer> remaining = new ArrayList<>();

        // 선택된 2명과 나머지를 분리
        for (int i = 0; i < skills.length; i++) {
            if (visited[i]) {
                team1.add(skills[i]);
            } else {
                remaining.add(skills[i]);
            }
        }

        // 나머지 4명을 다시 2명씩 나눔
        boolean[] subVisited = new boolean[remaining.size()];
        for (int i = 0; i < remaining.size(); i++) {
            divideSubTeams(remaining, subVisited, 0, 0, team1);
        }
    }

    private static void divideSubTeams(List<Integer> remaining, boolean[] visited, int start, int count,
                                       List<Integer> team1) {
        if (count == 2) {
            List<Integer> team2 = new ArrayList<>();
            List<Integer> team3 = new ArrayList<>();

            // 2명 나누기
            for (int i = 0; i < remaining.size(); i++) {
                if (visited[i]) {
                    team2.add(remaining.get(i));
                } else {
                    team3.add(remaining.get(i));
                }
            }

            // 팀 합 계산
            int sum1 = team1.get(0) + team1.get(1);
            int sum2 = team2.get(0) + team2.get(1);
            int sum3 = team3.get(0) + team3.get(1);

            // 최대-최소 차이 갱신
            int maxSum = Math.max(sum1, Math.max(sum2, sum3));
            int minSum = Math.min(sum1, Math.min(sum2, sum3));
            minDifference = Math.min(minDifference, maxSum - minSum);

            return;
        }

        for (int i = start; i < remaining.size(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                divideSubTeams(remaining, visited, i + 1, count + 1, team1);
                visited[i] = false;
            }
        }
    }
}