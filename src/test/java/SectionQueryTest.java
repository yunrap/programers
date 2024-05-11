import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class SectionQueryTest {

    @Test
    void solution() {
        SectionQuery sectionQuery = new SectionQuery();
        Assertions.assertThat(sectionQuery.solution(new int[]{0, 1, 2, 3, 4}, new int[][]{{0, 3},{1, 2},{1, 4}})).isEqualTo(new int[]{3, 4, 1, 0, 2});
    }
}