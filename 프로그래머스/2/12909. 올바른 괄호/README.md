# [level 2] 올바른 괄호 - 12909 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12909?language=java) 

### 성능 요약

메모리: 55.5 MB, 시간: 16.02 ms

### 구분

코딩테스트 연습 > 스택／큐

### 채점결과

정확성: 69.5<br/>효율성: 30.5<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 26일 21:44:14

### 문제 설명

<p>괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어</p>

<ul>
<li>"()()" 또는 "(())()" 는 올바른 괄호입니다.</li>
<li>")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.</li>
</ul>

<p>'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.</p>

<h5>제한사항</h5>

<ul>
<li>문자열 s의 길이 : 100,000 이하의 자연수</li>
<li>문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>s</th>
<th>answer</th>
</tr>
</thead>
        <tbody><tr>
<td>"()()"</td>
<td>true</td>
</tr>
<tr>
<td>"(())()"</td>
<td>true</td>
</tr>
<tr>
<td>")()("</td>
<td>false</td>
</tr>
<tr>
<td>"(()("</td>
<td>false</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1,2,3,4<br>
문제의 예시와 같습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges


# 📚 자료구조 심화: Deque (Double-Ended Queue)

## 1. Deque란?

**Deque(덱)** 은 *Double-Ended Queue*의 약자로,  
**양쪽 끝(앞, 뒤) 어디에서나 데이터를 추가·삭제할 수 있는 자료구조**입니다.

- Stack처럼 사용 가능 (LIFO)
- Queue처럼 사용 가능 (FIFO)

---

## 2. 주요 메서드 정리

Deque는 양방향 구조이기 때문에 메서드 이름에  
**First(앞)**, **Last(뒤)** 가 붙습니다.

| 기능 | 메서드 (예외 발생) | 메서드 (null / false 반환) | 설명 |
|----|------------------|---------------------------|------|
| 앞에 추가 | `addFirst(e)` | `push(e)` | 스택의 `push`와 동일 |
| 뒤에 추가 | `addLast(e)` | `offer(e)` | 큐의 `offer`와 동일 |
| 앞에서 제거 | `removeFirst()` | `poll()`, `pop()` | 스택/큐에서 값 추출 |
| 뒤에서 제거 | `removeLast()` | `pollLast()` | 뒤에서 데이터 추출 |
| 값 확인 | `getFirst()` | `peek()` | 삭제 없이 맨 앞 값 확인 |

---

## 3. 왜 ArrayDeque를 사용하는가?

Deque의 대표적인 구현체는 `ArrayDeque`와 `LinkedList`가 있지만,  
**대부분의 상황에서 `ArrayDeque`가 더 적합**합니다.

### ✅ ArrayDeque의 장점

- **성능**
  - 가변 배열 기반
  - `LinkedList`보다 메모리 효율이 좋음
  - 연속된 메모리 구조 → 캐시 친화적, 빠른 속도

- **Stack 대체**
  - 기존 `Stack` 클래스의 단점 극복
    - 불필요한 동기화 오버헤드
    - 상속 구조 문제
  - `Stack`의 **상위 호환 대체재**

---

## 4. 실전 사용법 (Java)

```java
import java.util.ArrayDeque;
import java.util.Deque;

// 1. 선언
Deque<Integer> deque = new ArrayDeque<>();

// 2. Stack처럼 활용 (LIFO)
deque.push(1); // [1]
deque.push(2); // [2, 1]
deque.pop();   // 2 반환 -> [1]

// 3. Queue처럼 활용 (FIFO)
deque.offer(1); // [1]
deque.offer(2); // [1, 2]
deque.poll();   // 1 반환 -> [2]

