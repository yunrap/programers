import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DayCompareTest {

    @Test
    void solution() {
        DayCompare dayCompare= new DayCompare();
        Assertions.assertThat(dayCompare.solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29})).isEqualTo(1);
        Assertions.assertThat(dayCompare.solution(new int[]{1024, 10, 24},new int[]{1024, 10, 24})).isEqualTo(1);
    }


}