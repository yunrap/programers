import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class MakeArray3Test {

    @Test
    void solution() {
        MakeArray3 makeArray3 = new MakeArray3();
        Assertions.assertThat(makeArray3.solution(new int[]{1, 2, 3, 4, 5}, new int[][]{{1, 3}, {0, 4}})).isEqualTo(new int[]{2, 3, 4, 1, 2, 3, 4, 5});
    }
}