import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class CountPlay2Test {

    @Test
    void solution() {
        CountPlay2 countPlay2 = new CountPlay2();
        Assertions.assertThat(countPlay2.solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1})).isEqualTo("wsdawsdassw");
    }
}