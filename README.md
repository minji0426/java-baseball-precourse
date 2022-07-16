## 숫자 야구 게임

### 구현할 기능

#### 입력

- [x] 1 ~ 9 까지 서로 다른 수 3개 입력
  - [ ] IllegalArgumentException
    - 3자리가 아닐 때
    - 0이 있을 때
    - 같은 숫자가 있을 때
    - 문자가 있을 때
- [x] 재시작/종료를 구분하는 1/2 입력
  - [ ] IllegalArgumentException
    - 1,2가 아닌 다른 수 일 때
    - 문자일 때

#### 프로그램

- [x] 1 ~ 9까지 서로 다른 임의의 수 3개 생성
- [x] 힌트 제공
  - 같은 수가 같은 자리: 스트라이크
  - 같은 수가 다른 자리: 볼
  - 같은 수 없음: 낫싱
- [x] 정답일시 게임 종료 여부 물어보기
  - 1이 입력되면 재시작
  - 2가 입력되면 종료

### 프로그래밍 요구사항

- [ ] 자바 코드 컨벤션을 지키면서 프로그래밍한다.
- [ ] indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
- [ ] 3항 연산자를 쓰지 않는다.
- [ ] 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- [ ] 기능 단위로 커밋한다.

## 📝 License

This project is [MIT](https://github.com/woowacourse/java-baseball-precourse/blob/master/LICENSE) licensed.
