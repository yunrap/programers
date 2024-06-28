import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumPartQueryTest {

    @Test
    void solution() {
        NumPartQuery numPartQuery = new NumPartQuery();
        Assertions.assertThat(numPartQuery.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 1},{1, 2},{2, 3}})).isEqualTo(new int[]{1, 3, 4, 4, 4});
    }
}