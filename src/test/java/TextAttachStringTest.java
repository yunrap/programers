import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class TextAttachStringTest {

    @Test
    void solution() {
        TextAttachString textAttachString = new TextAttachString();
        Assertions.assertThat(textAttachString.solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7})).isEqualTo("programmers");
    }

}