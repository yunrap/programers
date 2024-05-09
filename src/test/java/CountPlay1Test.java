import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class CountPlay1Test {

    @Test
    void solution() {
        CountPlay1 countPlay1 = new CountPlay1();
        Assertions.assertThat(countPlay1.solution(0,"wsdawsdassw")).isEqualTo(-1);
    }
}