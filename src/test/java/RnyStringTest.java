import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RnyStringTest {

    @Test
    void solution() {
        RnyString rnyString = new RnyString();
        Assertions.assertThat(rnyString.solution("masterpiece")).isEqualTo("rnasterpiece");
    }
}