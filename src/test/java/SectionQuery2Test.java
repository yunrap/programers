import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class SectionQuery2Test {

    @Test
    void solution() {
        SectionQuery2 sectionQuery2 = new SectionQuery2();
        Assertions.assertThat(sectionQuery2.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 2},{0, 3, 2},{0, 2, 2}})).isEqualTo(new int[]{3, 4, -1});
    }
}