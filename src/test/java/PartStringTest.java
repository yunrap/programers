import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PartStringTest {

    @Test
    void solution() {
        PartString partString = new PartString();
        Assertions.assertThat(partString.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}})).isEqualTo("programmers");


    }
}