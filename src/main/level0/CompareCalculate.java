public class CompareCalculate {
    public int solution(int a, int b) {
        int answer = 0;

        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        int compareA = Integer.parseInt(strA + strB);
        int compareB = 2 * a * b;

        answer = compareGab(compareA, compareB) ? compareA : compareB;

        return answer;
    }

    private boolean compareGab(int compareA, int compareB) {
        if (compareA > compareB) {
            return true;
        }
        return false;
    }

}
// :: 두수의 연산값 비교하기
//https://school.programmers.co.kr/learn/courses/30/lessons/181938
