public class SectionQuery {
    public int[] solution(int[] arr, int[][] queries) {
        int[] chageArr = {};
        for (int i = 0; i < queries.length; i++) {
            if (i == 0) {
                chageArr = arr;
            }
            chageArr = changeArrray(queries[i][0], queries[i][1], chageArr);
        }
        return chageArr;
    }

    private int[] changeArrray(int i, int j, int[] arr) {
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}

// :: 수열의 구간 쿼리3
// https://school.programmers.co.kr/learn/courses/30/lessons/181924
