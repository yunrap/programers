import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PrefixIsTrueTest {

    @Test
    void solution() {
        PrefixIsTrue prefixIsTrue = new PrefixIsTrue();
        Assertions.assertThat(prefixIsTrue.solution("banana", "ana")).isEqualTo(1);
        Assertions.assertThat(prefixIsTrue.solution("banana", "nan")).isEqualTo(0);
        Assertions.assertThat(prefixIsTrue.solution("banana", "wxyz")).isEqualTo(0);
        Assertions.assertThat(prefixIsTrue.solution("banana", "abanana")).isEqualTo(0);
    }
}