
# [level 1] 같은 숫자는 싫어 - 12906 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12906?language=java) 

### 성능 요약

메모리: 119 MB, 시간: 49.02 ms

### 구분

코딩테스트 연습 > 스택／큐

### 채점결과

정확성: 71.9<br/>효율성: 28.1<br/>합계: 100.0 / 100.0

### 제출 일자

2026년 01월 18일 22:57:55

### 문제 설명

<p>배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,</p>

<ul>
<li>arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.</li>
<li>arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.</li>
</ul>

<p>배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.</p>

<h5>제한사항</h5>

<ul>
<li>배열 arr의 크기 : 1,000,000 이하의 자연수</li>
<li>배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>arr</th>
<th>answer</th>
</tr>
</thead>
        <tbody><tr>
<td>[1,1,3,3,0,1,1]</td>
<td>[1,3,0,1]</td>
</tr>
<tr>
<td>[4,4,4,3,3]</td>
<td>[4,3]</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1,2<br>
문제의 예시와 같습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges

<hr>

<h2>📌 사용한 개념</h2>

<ul>
  <li>
    <b>Stack (스택)</b><br>
    LIFO(Last In First Out) 구조로, 마지막에 저장된 값을 즉시 확인할 수 있다.<br>
    본 문제에서는 <b>이전 값과 현재 값을 비교</b>하기 위해 스택을 사용하였다.
  </li>
  <br>

  <li>
    <b>연속 중복 판단</b><br>
    배열의 연속 중복 여부는 <code>현재 값</code>과 <code>직전에 저장된 값</code>을 비교하여 판단한다.<br>
    스택의 <code>peek()</code> 메서드를 통해 직전 값을 확인하였다.
  </li>
  <br>

  <li>
    <b>for-each 문</b><br>
    배열을 순회할 때 인덱스 접근이 필요 없으므로<br>
    <code>for (int x : arr)</code> 형태의 for-each 문을 사용하였다.
  </li>
  <br>

  <li>
    <b>Stack → 배열 변환</b><br>
    스택에 저장된 값을 <b>원래 순서 그대로</b> 반환하기 위해<br>
    <code>get(i)</code> 메서드를 사용하여 배열로 변환하였다.
  </li>
</ul>

<hr>

<h2>📚 Stack 메서드 정리 (문제 풀이를 통해 알게 된 점)</h2>

<ul>
  <li>
    <b>push(E item)</b><br>
    스택의 맨 위(top)에 값을 추가한다.<br>
    본 문제에서는 <b>연속되지 않은 값만</b> 스택에 저장하는 데 사용하였다.
  </li>
  <br>

  <li>
    <b>peek()</b><br>
    스택의 맨 위 값을 <b>제거하지 않고</b> 확인한다.<br>
    현재 값과 이전 값을 비교하여 <b>연속 중복 여부를 판단</b>하는 핵심 메서드이다.
  </li>
  <br>

  <li>
    <b>pop()</b><br>
    스택의 맨 위 값을 제거하고 반환한다.<br>
    이번 문제에서는 <b>순서 유지가 필요</b>하므로 사용하지 않았으며,<br>
    잘못 사용할 경우 결과 순서가 뒤집힐 수 있음을 알게 되었다.
  </li>
  <br>

  <li>
    <b>isEmpty()</b><br>
    스택이 비어 있는지 확인한다.<br>
    첫 번째 원소 처리 시 <code>peek()</code> 호출로 인한 예외를 방지하기 위해 사용하였다.
  </li>
  <br>

  <li>
    <b>get(int index)</b><br>
    스택 내부의 특정 인덱스 값을 조회한다.<br>
    <code>Stack</code>은 <code>Vector(List)</code>를 상속하기 때문에 사용 가능하며,<br>
    값을 제거하지 않고 <b>저장된 순서 그대로</b> 배열로 변환할 수 있었다.
  </li>
</ul>

<hr>

<h2>🔎 Stack 메서드 선택 이유</h2>

<ul>
  <li>연속 중복 판단에는 <b>이전 값 확인</b>이 필수이므로 <code>peek()</code> 사용</li>
  <li>반환 시 순서 유지를 위해 <code>pop()</code> 대신 <code>get(i)</code> 사용</li>
  <li>스택이 비어 있는 경우를 고려하여 <code>isEmpty()</code>를 먼저 검사</li>
</ul>

<hr>

<h2>✨ 정리</h2>

<p>
  이 문제를 통해 <b>Stack의 기본 메서드 역할과 차이점</b>을 이해하게 되었으며,<br>
  특히 <code>peek()</code>과 <code>pop()</code>의 차이가<br>
  결과에 직접적인 영향을 준다는 점을 학습하였다.
</p>

<hr>

<h2>⚠️ 트러블슈팅</h2>

<ul>
  <li>
    <b>for-each 문법 오류</b><br>
    자바에는 <code>for each</code> 키워드가 존재하지 않으며,<br>
    아래와 같은 문법을 사용해야 한다.<br><br>

    ❌ <code>for each (int x : arr)</code><br>
    ✅ <code>for (int x : arr)</code>
  </li>
  <br>

  <li>
    <b>배열 타입 선언 실수</b><br>
    <code>new int[n]</code>은 배열이므로 반드시 <code>int[]</code> 타입으로 선언해야 한다.<br><br>

    ❌ <code>int answer = new int[n]</code><br>
    ✅ <code>int[] answer = new int[n]</code>
  </li>
  <br>

  <li>
    <b>Stack 메서드 오해</b><br>
    <code>pop()</code>은 값을 제거하므로 순서가 깨질 수 있다.<br>
    배열 변환 시에는 값을 삭제하지 않는 <code>get(i)</code>를 사용해야 한다.
  </li>
  <br>

  <li>
    <b>main 메서드 관련 혼동</b><br>
    코딩테스트 환경에서는 채점 시스템이 <code>main</code> 메서드를 이미 제공하므로,<br>
    <code>solution()</code> 메서드만 구현하면 된다.
  </li>
</ul>

<hr>

