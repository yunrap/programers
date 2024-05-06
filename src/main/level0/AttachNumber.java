public class AttachNumber {
    public int solution(int[] num_list) {
        StringBuilder oddNum = new StringBuilder(); // 짝수
        StringBuilder evenNum = new StringBuilder(); // 홀수

        for (int i = 0; i <num_list.length ; i++) {
            if(num_list[i] % 2 == 0){
                oddNum.append(num_list[i]);
            }else{
                evenNum.append(num_list[i]);
            }
        }

        return Integer.parseInt(String.valueOf(oddNum)) + Integer.parseInt(String.valueOf(evenNum));
    }
}

// :: 이어 붙인 수
// :: 걸린시간 7분
// https://school.programmers.co.kr/learn/courses/30/lessons/181928

// Integer.parseInt 문자열 -> int 변경


// toString, String.valueOf 둘중에 뭐를써야하는가
/* Exception 발생
if( !(strTestVal .equals("")) ) ret = "1";
 정상
if( !("".equals(strTestVal)) ) ret = "2";
String.valueOf는 null인경우 null이라는 문자열로 대체한다.
Npe를 방지하기위해 toString 보다는 String.valueOf로 대체하것을 추천한다..
*/