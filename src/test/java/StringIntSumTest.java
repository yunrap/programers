import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class StringIntSumTest {

    @Test
    void solution() {
        StringIntSum stringIntSum = new StringIntSum();
        Assertions.assertThat(stringIntSum.solution("123456789")).isEqualTo(45);
        Assertions.assertThat(stringIntSum.solution("1000000")).isEqualTo(1);
    }
}