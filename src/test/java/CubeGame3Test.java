import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class CubeGame3Test {
    @Test
    void solution() {
        CubeGame3 cubeGame3 = new CubeGame3();
        Assertions.assertThat(cubeGame3.solution(2,2,2,2)).isEqualTo(2222);
        Assertions.assertThat(cubeGame3.solution(4,1,4,4)).isEqualTo(1681);
        Assertions.assertThat(cubeGame3.solution(6,3,3,6)).isEqualTo(27);
        Assertions.assertThat(cubeGame3.solution(2,5,2,6)).isEqualTo(30);
        Assertions.assertThat(cubeGame3.solution(6,4,2,5)).isEqualTo(2);
        Assertions.assertThat(cubeGame3.solution(1,1,4,1)).isEqualTo(196);
        Assertions.assertThat(cubeGame3.solution(4,2,5,5)).isEqualTo(8);
    }
}