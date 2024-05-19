import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StringReverseTest {

    @Test
    void solution() {
        StringReverse stringReverse = new StringReverse();
        Assertions.assertThat(stringReverse.solution("rermgorpsam", new int[][]{{2, 3}, {0, 7}, {5, 9}, {6, 10}})).isEqualTo("programmers");
    }
}