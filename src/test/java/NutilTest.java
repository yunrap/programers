import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class NutilTest {

    @Test
    void solution() {
        Nutil nutil = new Nutil();
        Assertions.assertThat(nutil.solution(new int[]{2, 1, 6}, 1)).isEqualTo(new int[]{2});
        Assertions.assertThat(nutil.solution(new int[]{5, 2, 1, 7, 5}, 3)).isEqualTo(new int[]{5, 2, 1});
    }
}