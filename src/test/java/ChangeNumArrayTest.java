import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ChangeNumArrayTest {

    @Test
    void solution() {
        ChangeNumArray changeNumArray = new ChangeNumArray();
        Assertions.assertThat(changeNumArray.solution(new int[]{1, 2, 3, 100, 99, 98})).isEqualTo(new int[] {2, 2, 6, 50, 99, 49});
    }
}