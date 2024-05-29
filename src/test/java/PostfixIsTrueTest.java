import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PostfixIsTrueTest {

    @Test
    void solution() {
        PostfixIsTrue prefixIsTrue = new PostfixIsTrue();
        Assertions.assertThat(prefixIsTrue.solution("banana", "ana")).isEqualTo(1);
        Assertions.assertThat(prefixIsTrue.solution("banana", "nan")).isEqualTo(0);
        Assertions.assertThat(prefixIsTrue.solution("banana", "wxyz")).isEqualTo(0);
        Assertions.assertThat(prefixIsTrue.solution("banana", "abanana")).isEqualTo(0);
    }
}