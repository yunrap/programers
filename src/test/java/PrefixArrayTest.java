import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PrefixArrayTest {

    @Test
    void solution() {
        PrefixArray prefixArray = new PrefixArray();
        Assertions.assertThat(prefixArray.solution("banana")).isEqualTo(new String[]{"a", "ana", "anana", "banana", "na", "nana"});
        Assertions.assertThat(prefixArray.solution("programmers")).isEqualTo(new String[]{"ammers", "ers", "grammers", "mers", "mmers", "ogrammers", "programmers", "rammers", "rogrammers", "rs", "s"});

    }
}