import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class Back5thTest {

    @Test
    void solution() {
        Back5th back5th = new Back5th();
        Assertions.assertThat(back5th.solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})).isEqualTo(new int[]{15, 32, 38, 46, 56});
    }
}