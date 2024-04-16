import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CubeGame3 {
    public int solution(int a, int b, int c, int d) {
        Map<Integer, Integer> dice = new HashMap<Integer, Integer>();
        int result = 0;

        dice.put(a, dice.getOrDefault(a, 0) + 1);
        dice.put(b, dice.getOrDefault(b, 0) + 1);
        dice.put(c, dice.getOrDefault(c, 0) + 1);
        dice.put(d, dice.getOrDefault(d, 0) + 1);

        List<Integer> keys = new ArrayList<Integer>(dice.keySet());
        for(Integer v : keys) {
            System.out.print(dice.get(v) + " ");
        }

        switch(dice.size()) {
            case 1: // 모두 같은 주사위
                result = 1111 * a;
                break;
            case 2: // 2 : 2 or 1 : 3 주사위
                if(dice.get(keys.get(0)) == 1 || dice.get(keys.get(1)) == 1) { // 1 : 3 주사위
                    int p = dice.get(keys.get(0)) == 3 ? keys.get(0) : keys.get(1);
                    int q = dice.get(keys.get(0)) == 1 ? keys.get(0) : keys.get(1);

                    result = (int)Math.pow((10 * p) + q, 2);
                } else { // 2 : 2 주사위
                    int p = keys.get(0);
                    int q = keys.get(1);
                    result = (p + q) * (Math.abs(p - q));
                }
                break;
            case 3: // 두 개씩 같은 주사위에 각각 다른 주사위
                int temp = 0;
                for(Integer v : dice.keySet()) {
                    if(dice.get(v) != 2) {
                        if(temp == 0) {
                            temp = v;
                        } else {
                            temp *= v;
                        }
                    }
                }
                result = temp;
                break;
            case 4: // 모두 다른 주사위
                int temp2 = 7;
                for(Integer v : dice.keySet()) {
                    temp2 = temp2 > v ? v : temp2;
                }
                result = temp2;
                break;
        }

        return result;
    }
}

// 네숫자가 모두 p로 같다면 1111 * p -> 1가지
// 세숫자가 모두 p이고 나머지숫자가 q면 (10*p+q) * (10*p+q)  -> 4가지
// 두숫자씩 같은값이고 나온숫자가 p,q라면 (p+q) * |p-q| -> 3가지
// 두숫자가 p이고 한수자가 q, 한숫자가r이면 q*r -> 3가지
// 네숫자가 모두다르면 나온숫자중 가작작은수 -> 1가지


// 제한사항 : a,b,c,d  -> 1이상 6이하의정수이다

// key값을 사용
// temp2 = temp2 > v ? v : temp2; 이렇게 표현하는법 참고