import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class ListSliceTest {

    @Test
    void solution() {
        ListSlice listSlice = new ListSlice();
        Assertions.assertThat(listSlice.solution(2, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(new int[]{2, 3, 4, 5, 6});
        Assertions.assertThat(listSlice.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})).isEqualTo(new int[]{2, 4, 6});
    }
}