import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class AddResultTest {

    @Test
    void solution() {
        AddResult addResult = new AddResult();
        Assertions.assertThat(addResult.solution(3,4, new boolean[]{true, false, false, true, true})).isEqualTo(37);

    }
}