import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class NfromTest {

    @Test
    void solution() {
        Nfrom nfrom = new Nfrom();
        Assertions.assertThat(nfrom.solution(new int[]{2, 1, 6}, 3)).isEqualTo(new int[]{6});
        Assertions.assertThat(nfrom.solution(new int[]{5, 2, 1, 7, 5}, 2)).isEqualTo(new int[]{2, 1, 7, 5});
    }
}