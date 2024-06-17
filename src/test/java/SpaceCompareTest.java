import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class SpaceCompareTest {

    @Test
    void solution() {
        SpaceCompare spaceCompare = new SpaceCompare();
        Assertions.assertThat(spaceCompare.solution("i    love  you")).isEqualTo(new String[]{"i","love","you"});
        Assertions.assertThat(spaceCompare.solution("    programmers  ")).isEqualTo(new String[]{"programmers"});
    }
}