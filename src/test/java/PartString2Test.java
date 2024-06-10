import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class PartString2Test {

    @Test
    void solution() {
        PartString2 partString2 = new PartString2();
        Assertions.assertThat(partString2.solution("abc", "aabcc")).isEqualTo(1);
        Assertions.assertThat(partString2.solution("tbt", "tbbttb")).isEqualTo(0);
    }
}