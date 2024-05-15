import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;


class ColazArrayTest {

    @Test
    void solution() {
        ColazArray colazArray = new ColazArray();
        Assertions.assertThat(colazArray.solution(10)).isEqualTo(new int[]{10, 5, 16, 8, 4, 2, 1});
    }
}