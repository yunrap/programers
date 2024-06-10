import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;


class NpaddingElTest {

    @Test
    void solution() {
        NpaddingEl npaddingEl = new NpaddingEl();
        Assertions.assertThat(npaddingEl.solution(new int[]{4, 2, 6, 1, 7, 6}, 2)).isEqualTo(new int[]{4, 6, 7});
        Assertions.assertThat(npaddingEl.solution(new int[]{4, 2, 6, 1, 7, 6}, 4)).isEqualTo(new int[]{4, 7});

    }
}