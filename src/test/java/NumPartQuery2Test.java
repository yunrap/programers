import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NumPartQuery2Test {

    @Test
    void solution() {
        NumPartQuery2 numPartQuery2 = new NumPartQuery2();
        Assertions.assertThat(numPartQuery2.solution(new int[]{1, 2, 3, 100, 99, 98})).isEqualTo(5);
    }
}