import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeGame2Test {

    @Test
    void solution() {
        CubeGame2 cubeGame2 = new CubeGame2();
        System.out.println(cubeGame2.solution(2,6,1));
        System.out.println(cubeGame2.solution(5,3,3));

    }
}