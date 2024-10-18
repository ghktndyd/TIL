## 정규 표현식 주요 메타 문자

1. `.` (마침표)
    - 의미: 임의의 하나의 문자를 의미한다. (줄바꿈 문자는 제외)
    - 예시: `a.b` ➡️ `a(임의의 문자)b`로 이루어진 문자열을 찾는다. (`acb`, `a1b` 등)

2. `^` (캐럿)
    - 의미: 문자열의 시작을 의미한다.
    - 예시: `^abc` ➡️ `abc`로 시작하는 문자열을 찾는다.

3. `$` (달러)
    - 의미: 문자열의 끝을 의미한다.
    - 예시: `abc$` ➡️ `abc`로 끝나는 문자열을 찾는다.

4. `*` (별표 || 아스테리스크)
    - 의미: 0번 이상 반복을 의미한다. (0번 이상임을 기억할 것!)
    - 예시: `ab*c` ➡️ `a`로 시작하고, `b`가 0번 이상 반복되며, `c`로 끝나는 문자열을 찾는다. (`ac`, `abc`, `abbc` 등)

5. `+` (플러스)
    - 의미: 1번 이상 반복을 의미한다.
    - 예시 `ab+c` ➡️ `a`로 시작하고, `b`가 1번 이상 반복되며, `c`로 끝나는 문자열을 찾는다. (`abc`, `abbc` 등)

6. `?` (물음표)
    - 의미: 0번 또는 1번 나오는 것을 의미한다.
    - 예시 `ab?c` ➡️ `a` 뒤에 `b`가 0번이나 1번 나오고, `c`로 끝나는 문자열을 찾는다. (`ac`, `abc` 등)

7. `[]` (대괄호)
    - 의미: 문자 집합을 정의한다. 대괄호 안에 속한 문자 중 하나하고 매칭된다.
    - 예시: `[a-z]` ➡️ `a~z 까지의 알파벳 소문자` 중 하나와 일치하는 문자열을 찾는다.
    - 범위 사용: `[a-z]`, `[0-9]` ➡️ 앞의 표현식은 알파벳 소문자만 허용하고, 뒤의 표현식은 숫자만 허용한다.

8. `[^]` (대괄호 안에 캐럿)
    - 의미: 해당 문자를 제외한 나머지 문자와 매칭된다.
    - 예시 `[^abc]` ➡️ `a`, `b`, `c`가 아닌 문자와 일치하는 문자열을 찾는다.

9. `|` (파이프)
    - 의미: OR 연산자를 의미한다.
    - 예시: `a|b` ➡️ `a` 또는 `b`에 매칭되는 문자열을 찾는다. (`a`, `b` 등)

10. `{}` (중괄호)
    - 의미: 반복 횟수를 지정한다.
    - 예시: `a{2,4}` ➡️ `a`가 2번에서 4번 반복되는 문자열을 찾는다. (`aa`, `aaa`, `aaaa`)

11. `()` (소괄호)
    - 의미: 그룹화를 의미한다. 괄호 내의 패턴을 하나의 단위로 묶어서 처리한다.
    - 예시: `(abc)+` ➡️ abc가 1번 이상 반복되는 문자열을 찾는다. (`abc`, `abcabc` 등)

12. `\` (백슬래시)
    - 의미: 이스케이프 문자고, 메타 문자를 일반 문자로 해석하거나 정규식 내에서 특별한 기능을 할 때 사용된다.
    - 예시:
        - `\.` ➡️ 마침표 .를 문자 그대로 사용한다.
        - `\d` ➡️ 숫자를 의미한다. `[0-9]`와 동일하다.
        - `\w` ➡️ 단어 문자를 의미한다. (알파벳, 숫자, 밑줄 같은 문자)
        - `\s` ➡️ 공백 문자를 의미한다. (스페이스, 탭 등)