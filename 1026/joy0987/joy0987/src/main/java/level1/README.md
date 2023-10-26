# 🚀 Level1

### 나의 생각

- 소수 판별 방법 : 에라토스테네스의 체
- 결과 출력은 StringBuilder 사용해서 메모리 관리
- solution 메서드 종료 시 사라져도 되는 StringBuilder, BufferedReader는 지역변수로 선언
- 입력 시 예외처리

### 문제 풀이

1. 대상 숫자 입력
2. 소수 여부를 담은 isPrime 배열 초기화
3. 에라토스테네스의 체로 2 ~ 입력값의 제곱근까지 배수 제거
4. isPrime 배열을 돌면서 소수인 값을 StringBuilder 에 담아서 출력

### Reference

- https://nahwasa.com/entry/에라토스테네스의-체-혹은-소수판정-시-제곱근-까지만-확인하면-되는-이유

<br/>
<br/>
<br/>
<br/>

---

<br/>
<br/>
<br/>
<br/>

### 🎯 요구 사항

3️⃣ 양의 정수를 입력받고 1부터 해당 입력값 사이의 모든 소수를 출력합니다.

- `-1`을 입력하면 프로그램을 종료합니다.
    - 즉, `-1`을 입력하기 전까지는 프로그램이 종료되지 않습니다.
- 입력된 수가 소수인지 판별하는 함수에 `메모이제이션` 기법을 적용하여 최적화합니다.
- long 자료형이 아닌 int 자료형을 사용해주세요.

<br/>

### ✅ 입출력 예시

```text
== 입력 ==
숫자 입력 : [입력 1]
== 결과 ==
- [결과 1]
- [결과 2]
- [결과 ..]
- [결과 n]

== 입력 ==
숫자 입력 : [입력 1]
== 결과 ==
- [결과 1]
- [결과 2]
- [결과 ..]
- [결과 n]

== 입력 ==
숫자 입력 : [입력 2]
== 종료 ==
```