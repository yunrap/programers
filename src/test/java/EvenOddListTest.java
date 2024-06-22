import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class EvenOddListTest {

    @Test
    void solution() {
        EvenOddList evenOddList = new EvenOddList();
        Assertions.assertThat(evenOddList.solution(new int[] {4, 2, 6, 1, 7, 6})).isEqualTo(17);
        Assertions.assertThat(evenOddList.solution(new int[] {-1, 2, 5, 6, 3})).isEqualTo(8);
    }
}