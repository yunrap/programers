import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class FirstMinusTest {

    @Test
    void solution() {
        FirstMinus firstMinus = new FirstMinus();
        Assertions.assertThat(firstMinus.solution(new int[]{12, 4, 15, 46, 38, -2, 15})).isEqualTo(5);
        Assertions.assertThat(firstMinus.solution(new int[]{13, 22, 53, 24, 15, 6})).isEqualTo(-1);

    }
}