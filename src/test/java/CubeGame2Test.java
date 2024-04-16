import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeGame2Test {

    @Test
    void solution() {
        CubeGame2 cubeGame2 = new CubeGame2();
        Assertions.assertThat(cubeGame2.solution(2,6,1)).isEqualTo(9);
        Assertions.assertThat(cubeGame2.solution(5,3,3)).isEqualTo(473);
    }
}