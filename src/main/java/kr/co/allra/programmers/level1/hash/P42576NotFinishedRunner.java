package kr.co.allra.programmers.level1.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/**
 * 프로그래머스 42576 - 완주하지 못한 선수 (Level 1, Hash)
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/42576
 *
 * 문제 설명
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * - 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * - completion의 길이는 participant의 길이보다 1 작습니다.
 * - 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * - 참가자 중에는 동명이인이 있을 수 있습니다.
 *
 * 입출력 예
 * participant                                          completion                               return
 * ["leo", "kiki", "eden"]                              ["eden", "kiki"]                         "leo"
 * ["marina", "josipa", "nikola", "vinko", "filipa"]    ["josipa", "filipa", "marina", "nikola"] "vinko"
 * ["mislav", "stanko", "mislav", "ana"]                ["stanko", "ana", "mislav"]              "mislav"
 *
 * 입출력 예 설명
 * 예제 #1: "leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 * 예제 #2: "vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
 * 예제 #3: "mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명만 있기 때문에 한 명은 완주하지 못했습니다.
 */
public class P42576NotFinishedRunner {

    public String solution(String[] participant, String[] completion) {

        // 참가자 : participant
        // 완주자 : completion
        // 1명 차이를 찾아라

        // 1. 참가자 전체를 해시맵에 넣는다.
        HashMap<String, Integer> countMap = new HashMap<>();
        for (String par : participant) {
            Integer count = countMap.get(par);
            if (null == count) {
                countMap.put(par, 1);
            } else {
                countMap.put(par, ++count);
            }
        }

        // 2. 완주자 전체를 해시맵에서 뺀다.
        for (String com : completion) {
            Integer i = countMap.get(com);
            if (i == 1) {
                countMap.remove(com);
            } else {
                countMap.put(com, --i);
            }
        }

        for (String s : countMap.keySet()) {
            return s;
        }
        return null;

    }

    public static void main(String[] args) {
        P42576NotFinishedRunner solver = new P42576NotFinishedRunner();

        // 예제 1
        System.out.println(solver.solution(
                new String[]{"leo", "kiki", "eden"},
                new String[]{"eden", "kiki"}
        )); // "leo"

        // 예제 2
        System.out.println(solver.solution(
                new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}
        )); // "vinko"

        // 예제 3
        System.out.println(solver.solution(
                new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"}
        )); // "mislav"
    }
}
