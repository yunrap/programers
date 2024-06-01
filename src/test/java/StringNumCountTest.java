import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class StringNumCountTest {

    @Test
    void solution() {
        StringNumCount stringNumCount = new StringNumCount();
        Assertions.assertThat(stringNumCount.solution("Programmers"))
                .isEqualTo(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                        0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1
                        , 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 2, 0, 1, 0,
                        0, 3, 1, 0, 0, 0, 0, 0, 0, 0});
    }}