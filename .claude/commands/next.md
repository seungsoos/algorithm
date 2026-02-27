기존 완료된 문제 파일을 확인하고, 중복되지 않는 다음 문제를 자동 생성해줘.

1. `src/main/java/kr/co/allra/programmers/` 하위 폴더를 탐색해서 이미 존재하는 문제 파일 목록을 확인
2. 같은 카테고리 내에서 아직 풀지 않은 다음 문제를 선택
3. CLAUDE.md의 문제 생성 규칙에 따라 Java 파일을 자동 생성:
   - 클래스명: `P{문제번호}{클래스명}`
   - 상단 Javadoc: URL, 문제 설명, 제한사항, 입출력 예/설명 전체 포함
   - `solution()`: `throw new UnsupportedOperationException("TODO: 직접 구현")`
   - `main()`: 모든 입출력 예시를 테스트 코드로 작성
4. 풀기 전 프로그래머스 원본 링크로 확인 권장 안내
