public class ArrayCompare {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1Sum = 0;
        int arr2Sum = 0;

        if (arr1.length != arr2.length) {
            answer = arr1.length > arr2.length ? 1 : -1;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                arr1Sum += arr1[i];
            }

            for (int j = 0; j < arr2.length; j++) {
                arr2Sum += arr2[j];
            }

            answer = arr1Sum > arr2Sum ? 1 : -1;

            if (arr1Sum == arr2Sum)
            answer = 0;
        }

        return answer;
    }
}
// :: 배열 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181856

// 두배열길이가다르면 배열길이긴쪽이더크다, 배열길이가같다면 각배열합 arr1크면1, arr2크면 -1 같다면 0
// :: 다른사람의풀이 Integer.compare 으로 숫자비교하기
