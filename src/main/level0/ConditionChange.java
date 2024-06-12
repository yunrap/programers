public class ConditionChange {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int[] answerAdd = new int[arr.length];

        for (int a = 0; a < arr.length; a++) {
            if(k % 2 == 0){
                answerAdd[a] = arr[a] + k;
            }else{
                answerAdd[a] = arr[a] * k;
            }
        }
        return answerAdd;
    }
}
