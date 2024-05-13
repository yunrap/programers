import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class MakeArrayTest {

    @Test
    void solution() {
        MakeArray makeArray = new MakeArray();
        Assertions.assertThat(makeArray.solution(5, 555)).isEqualTo(new int[]{5, 50, 55, 500, 505, 550, 555});
        Assertions.assertThat(makeArray.solution(10, 20)).isEqualTo(new int[]{-1});

    }
}