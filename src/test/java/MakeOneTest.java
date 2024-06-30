import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MakeOneTest {

    @Test
    void solution() {
        MakeOne makeOne = new MakeOne();
        Assertions.assertThat(makeOne.solution(new int[]{12, 4, 15, 1, 14})).isEqualTo(11);
    }
}