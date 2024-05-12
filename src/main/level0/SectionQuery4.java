public class SectionQuery4 {
    public int[] solution(int[] arr, int[][] queries) {

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int j = s; j < e + 1; j++) {
                if (j % k == 0) {
                    arr[j] = arr[j] + 1;
                }
            }
        }

        return arr;
    }
}

// 0 <= i <= 4   -> 1,2,3 -> arr[0]+1, arr[1]+1, arr[2]+1, arr[3]+1 ,arr[4]+1

