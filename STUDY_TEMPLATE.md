# 코딩테스트 학습 템플릿

## 1) 풀이 시작 전
- 날짜:
- 문제명 / 번호:
- 레벨:
- 목표 제한시간: 40분
- 사용할 접근(예상):

## 2) 구현 전 체크
- 입력 크기 기준 시간복잡도 목표를 정했다. (예: O(n), O(n log n))
- 핵심 자료구조를 정했다. (예: HashMap, Queue)
- 엣지 케이스 2개 이상 적었다.

## 3) 구현 후 셀프 점검
- 정상 케이스 통과
- 엣지 케이스 통과
- 시간복잡도 설명 가능
- 왜 이 자료구조를 썼는지 설명 가능

## 4) 오답노트 (틀렸을 때만)
- 막힌 지점 1줄:
- 실제 원인 (개념/구현/실수):
- 다음에 막지 않기 위한 규칙 1줄:

## 5) 복기
- 오늘 배운 패턴 1줄:
- 비슷한 문제를 만나면 바로 쓸 수 있는 포인트 1줄:

---

## Java 클래스 템플릿

```java
package kr.co.allra.programmers.{level}/{category};

/**
 * 프로그래머스 {문제번호} - {문제명} ({레벨})
 * URL: https://school.programmers.co.kr/learn/courses/30/lessons/{문제번호}
 *
 * 문제 설명
 * {문제 설명 전체를 여기에 붙여넣기}
 *
 * 제한사항
 * {제한사항 전체를 여기에 붙여넣기}
 *
 * 입출력 예
 * {입출력 예 테이블}
 *
 * 입출력 예 설명
 * {입출력 예 설명 전체를 여기에 붙여넣기}
 */
public class P{문제번호}{클래스명} {

    public int solution(int[] input) {
        throw new UnsupportedOperationException("TODO: 직접 구현");
    }

    public static void main(String[] args) {
        P{문제번호}{클래스명} solver = new P{문제번호}{클래스명}();
        // 입출력 예시 테스트
        System.out.println(solver.solution(new int[]{/* 예시 입력 */}));
    }
}
```
