import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class MultiplySumTest {

    @Test
    void solution() {
        MultiplySum multiplySum = new MultiplySum();
        Assertions.assertThat(multiplySum.solution(new int[]{3, 4, 5, 2, 1})).isEqualTo(1);
    }
}