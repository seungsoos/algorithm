package kr.co.allra.programmers.level1.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 프로그래머스 42748 - K번째수 (Level 1, Sort)
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * <p>
 * 문제 설명
 * 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때,
 * k번째에 있는 수를 구하려 합니다.
 * <p>
 * 예를 들어, array가 [1, 5, 2, 6, 3, 7, 4],
 * [2, 5, 3]이라면 array의 2번째부터 5번째까지 자른 배열은 [5, 2, 6, 3]입니다.
 * 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
 * 2에서 나온 배열의 3번째 숫자는 5입니다.
 * <p>
 * 배열 array와 [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때,
 * commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * 제한사항
 * - array의 길이는 1 이상 100 이하입니다.
 * - array의 각 원소는 1 이상 100 이하입니다.
 * - commands의 길이는 1 이상 50 이하입니다.
 * - commands의 각 원소는 길이가 3입니다.
 * <p>
 * 입출력 예
 * array                 commands                          return
 * [1, 5, 2, 6, 3, 7, 4] [[2, 5, 3], [4, 4, 1], [1, 7, 3]] [5, 6, 3]
 * <p>
 * 입출력 예 설명
 * [1, 5, 2, 6, 3, 7, 4]에서
 * - [2, 5, 3]의 결과: [5, 2, 6, 3] -> [2, 3, 5, 6] -> 5
 * - [4, 4, 1]의 결과: [6] -> [6] -> 6
 * - [1, 7, 3]의 결과: [1, 5, 2, 6, 3, 7, 4] -> [1, 2, 3, 4, 5, 6, 7] -> 3
 * 따라서 [5, 6, 3]을 return 합니다.
 */
public class P42748KthNumber {

    public int[] solution(int[] array, int[][] commands) {

        // 1. commands 단우로 잘라서 결과를 만들고 합친다.
        int[] answer = new int[commands.length];

        for (int i = 0; i <= commands.length-1; i++) {
            int[] command = commands[i];

            int start = command[0];
            int end = command[1];
            int index = command[2];

            int[] sliced = Arrays.stream(Arrays.copyOfRange(array, start - 1, end)).sorted().toArray();
            answer[i] = sliced[index - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        P42748KthNumber solver = new P42748KthNumber();

        int[] result = solver.solution(
                new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}
        );

        System.out.println(Arrays.toString(result)); // [5, 6, 3]
    }
}
