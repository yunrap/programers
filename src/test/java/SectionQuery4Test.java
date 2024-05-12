import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class SectionQuery4Test {

    @Test
    void solution() {
        SectionQuery4 sectionQuery4 = new SectionQuery4();
        Assertions.assertThat(sectionQuery4.solution(new int[]{0, 1, 2, 4, 3}, new int[][]{{0, 4, 1},{0, 3, 2},{0, 3, 3}})).isEqualTo(new int[]{3, 2, 4, 6, 4});
    }
}