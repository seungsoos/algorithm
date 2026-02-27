package kr.co.allra.programmers.level1.stack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 프로그래머스 12906 - 같은 숫자는 싫어 (Level 1, Stack)
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/12906
 *
 * 문제 설명
 * 배열 arr가 주어집니다.
 * 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 *
 * 예를 들면,
 * arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1]을 return 하고,
 * arr = [4, 4, 4, 3, 3] 이면 [4, 3]을 return 합니다.
 *
 * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해주세요.
 *
 * 제한사항
 * - 배열 arr의 크기: 1,000,000 이하의 자연수
 * - 배열 arr의 원소의 크기: 0보다 크거나 같고 9보다 작거나 같은 정수
 *
 * 입출력 예
 * arr                     answer
 * [1, 1, 3, 3, 0, 1, 1]   [1, 3, 0, 1]
 * [4, 4, 4, 3, 3]         [4, 3]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 문제의 예시와 같습니다.
 *
 * 입출력 예 #2
 * 연속된 4와 연속된 3은 각각 하나만 남기므로 [4, 3]이 됩니다.
 */
public class P12906NoSameNumber {

    public int[] solution(int[] arr) {
        // 연속된 숫자를 어떻게 찾지?
        // 인덱스로 0 <-> 1 비교 , 1<-> 2 비교 쭉쭉
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int value = -1;

        for (int j : arr) {
            if (j != value) {
                answerList.add(j);
                value = j;
            }
        }
        System.out.println("answerList = " + answerList);
        return answerList.stream().mapToInt(value1 -> value1).toArray();

    }

    public static void main(String[] args) {
        P12906NoSameNumber solver = new P12906NoSameNumber();

        int[] result1 = solver.solution(new int[]{1, 1, 3, 3, 0, 1, 1});
        System.out.println(Arrays.toString(result1)); // [1, 3, 0, 1]

        int[] result2 = solver.solution(new int[]{4, 4, 4, 3, 3});
        System.out.println(Arrays.toString(result2)); // [4, 3]
    }
}
