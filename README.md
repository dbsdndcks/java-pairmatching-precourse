# 미션 - 페어매칭관리 애플리케이션

## 🔍 진행방식

- 미션은 **기능 요구사항, 프로그래밍 요구사항, 과제 진행 요구사항** 세 가지로 구성되어 있다.
- 세 개의 요구사항을 만족하기 위해 노력한다. 특히 기능을 구현하기 전에 기능 목록을 만들고, 기능 단위로 커밋 하는 방식으로 진행한다.
- 기능 요구사항에 기재되지 않은 내용은 스스로 판단하여 구현한다.

## ✉️ 미션 제출 방법

- 미션 구현을 완료한 후 GitHub을 통해 제출해야 한다.
    - GitHub을 활용한 제출 방법은 [프리코스 과제 제출 문서](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 를 참고해 제출한다.
- GitHub에 미션을 제출한 후 [우아한테크코스 지원 플랫폼](https://apply.techcourse.co.kr) 에 접속하여 프리코스 과제를 제출한다.
    - 자세한 방법은 [링크](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse#제출-가이드) 를 참고한다.
    - **Pull Request만 보내고, 지원 플랫폼에서 과제를 제출하지 않으면 최종 제출하지 않은 것으로 처리되니 주의한다.**

## ✔️ 과제 제출 전 체크리스트 - 0점 방지

- 터미널에서 `java -version`을 실행해 자바 8인지 확인한다. 또는 Eclipse, IntelliJ IDEA와 같은 IDE의 자바 8로 실행하는지 확인한다.
- 터미널에서 맥 또는 리눅스 사용자의 경우 `./gradlew clean test`, 윈도우 사용자의 경우 `gradlew.bat clean test` 명령을 실행했을 때 모든 테스트가 아래와 같이 통과하는지 확인한다.

```
BUILD SUCCESSFUL in 0s
```

---

## 🚀 기능 요구사항

### 1.입출력 기능

#### 1-1. 기능 선택 출력 및 입력
```
기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화
Q. 종료
```
- 1,2,3,Q중 하나를 입력받아 기능을 선택한다.


#### 1-2 페어 매칭 출력 및 입력기능
```
#############################################
과정: 백엔드 | 프론트엔드
미션:
  - 레벨1: 자동차경주 | 로또 | 숫자야구게임
  - 레벨2: 장바구니 | 결제 | 지하철노선도
  - 레벨3: 
  - 레벨4: 성능개선 | 배포
  - 레벨5: 
############################################
과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 자동차경주
```
- 매칭하고자 하는 과정,레벨,미션을 입력받는다.

#### 1-3 페어 재매칭 입력
```
매칭 정보가 있습니다. 다시 매칭하시겠습니까?
네 | 아니오
```
- 네 혹은 아니오를 입력받아 코스,레벨,미션을 다시 선택한다.

#### 1-4. 페어 조회 기능
- 과정, 레벨, 미션을 선택하면 해당 미션의 페어 정보를 출력한다.
- 매칭 이력이 없으면 매칭 이력이 없다고 안내한다.
```
[ERROR] 매칭 이력이 없습니다.
```

#### 1-5 매칭 결과 출력 기능
```
이브 : 윌터
보노 : 제키
신디 : 로드
제시 : 린다
시저 : 라라
니콜 : 다비
리사 : 덴버 : 제키
```
---

### 2. 페어 매칭 기능

#### 2-1 페어 매칭 구현
- 미션을 함께 수행할 페어를 두명씩 매칭한다.
- 홀수인 경우 마지막 남은 크루는 마지막 페어에 포함시킨다.
- 같은 레벨에서 이미 페어로 만난적이 있는 크루끼리 다시 페어로 매칭 된다면 크루 목록의 순서를 다시 랜덤으로 섞어서 매칭을 시도한다.
- 크루들의 목록은 랜덤으로 섞는다.
- 랜덤으로 섞인 페어 목록에서 페어 매칭을 할 때 앞에서부터 순서대로 두명씩 페어를 맺는다.
- 3회 시도까지 매칭이 되지 않거나 매칭을 할 수 있는 경우의 수가 없으면 에러 메시지를 출력한다.


---
## 🎱 프로그래밍 요구사항

- 프로그램을 실행하는 시작점은 `Application`의 `main()`이다.
- JDK 8 버전에서 실행 가능해야 한다. **JDK 8에서 정상 동작하지 않을 경우 0점 처리**한다.
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
    - https://naver.github.io/hackday-conventions-java
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
    - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
    - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)의 길이가 15라인을 넘어가지 않도록 구현한다.
    - 함수(또는 메소드)가 한 가지 일만 잘 하도록 구현한다.
- else 예약어를 쓰지 않는다.
    - 힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
    - else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.
- build.gradle 파일을 변경할 수 없고, 외부 라이브러리를 사용하지 않는다.
- 프로그램 종료 시 `System.exit()`를 호출하지 않는다.
- 프로그래밍 요구사항에서 별도로 변경 불가 안내가 없는 경우 파일 수정과 패키지 이동을 자유롭게 할 수 있다.

### 프로그래밍 요구사항 - Randoms, Console

- JDK에서 기본 제공하는 Random, Scanner API 대신 `camp.nextstep.edu.missionutils`에서 제공하는 `Randoms`, `Console` API를 활용해 구현해야 한다.
  - Random 값 추출은 `camp.nextstep.edu.missionutils.Randoms`의 `shuffle()`를 활용한다.
  - 사용자가 입력하는 값은 `camp.nextstep.edu.missionutils.Console`의 `readLine()`을 활용한다.
- 프로그램 구현을 완료했을 때 `src/test/java` 디렉터리의 `ApplicationTest`에 있는 모든 테스트 케이스가 성공해야 한다. **테스트가 실패할 경우 0점 처리한다.**

---
## ❗️ 힌트
- 아래의 힌트를 참고하여 진행해도 좋다.
- 반드시 아래의 힌트를 따라해야하는 것은 아니며 사용하지 않아도 되고 수정도 가능하다.

### 과정
```java
public enum Course {
  BACKEND("백엔드"),
  FRONTEND("프론트엔드");

  private String name;

  Course(String name) {
    this.name = name;
  }

  // 추가 기능 구현
}
```

### 레벨
```java
public enum Level {
  LEVEL1("레벨1"),
  LEVEL2("레벨2"),
  LEVEL3("레벨3"),
  LEVEL4("레벨4"),
  LEVEL5("레벨5");

  private String name;

  Level(String name) {
    this.name = name;
  }

  // 추가 기능 구현
}
```

### 크루
```java
public class Crew {
    private Course course;
    private String name;
}

```

---

## 📈 과제 진행 요구사항

- 미션은 [java-pairmatching-precourse](https://github.com/woowacourse/java-pairmatching-precourse) 저장소를 Fork/Clone해 시작한다.
- **기능을 구현하기 전에 java-pairmatching-precourse/docs/README.md 파일에 구현할 기능 목록을 정리**해 추가한다.
- **Git의 커밋 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위**로 추가한다.
    - [AngularJS Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 참고해 commit log를 남긴다.
- 과제 진행 및 제출 방법은 [프리코스 과제 제출 문서](https://github.com/woowacourse/woowacourse-docs/tree/master/precourse) 를 참고한다.
