import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class SeqChangeTest {

    @Test
    void solution() {
        SeqChange seqChange = new SeqChange();
        Assertions.assertThat(seqChange.solution(new int[]{2, 1, 6}, 1)).isEqualTo(new int[]{1, 6, 2});
        Assertions.assertThat(seqChange.solution(new int[]{5, 2, 1, 7, 5}, 3)).isEqualTo(new int[]{7, 5, 5, 2, 1});
    }
}