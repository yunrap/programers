public class CodeSolution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int modeVal = 0;

        for (int i = 0; i < code.length(); i++) {
            if (modeVal == 0) {
                if (appendIndexVal(code.charAt(i))) {
                    if (i % 2 == 0) {
                        answer.append(code.charAt(i));
                    }
                } else {
                    modeVal = checkModeVal(code.charAt(i), modeVal);
                }

            } else {
                if (appendIndexVal(code.charAt(i))) {
                    if (i % 2 != 0) {
                        answer.append(code.charAt(i));
                    }
                } else {
                    modeVal = checkModeVal(code.charAt(i), modeVal);
                }
            }
        }

        if (answer.toString().equals("")) {
            answer = new StringBuilder("EMPTY");
        }

        return answer.toString();
    }

    private boolean appendIndexVal(char charAt) {
        return charAt != '1';
    }

    private int checkModeVal(char code, int modeVal) {
        if (code == '1') {
            modeVal = modeVal == 1 ? 0 : 1;
        }
        return modeVal;
    }
}

// mode 가 1을만나면 0, 1 번갈아 바뀜
// mode 0이면 | code[idx] 1 아니면 ,idx짝수일때 맨뒤에 추가
// mode 0이면 | code[idx] 1 이면 , mode를 0->1 바꿈
// mode 1이면 | code[idx] 1 아니면 ,idx홀수일때 맨뒤에 추가
// mode 1이면서 | code[idx] 1 이면 , mode를 1->0 바꿈
// result가 빈문자열이면 EMPTY return

// :: 코드처리하기
// :: 걸린시간 : 1시간10분 why? 조건문을 확실히보고 처리안해서 결과값이달라서 시간많이걸림
// https://school.programmers.co.kr/learn/courses/30/lessons/181932