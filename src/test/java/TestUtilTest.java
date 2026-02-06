import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {
    @Test
    @DisplayName("TestUtil.genScanner()")
    void t1() {

        Scanner scanner = TestUtil.genScanner("""
                등록
                현재를 사랑하라.
                작자미상
                """
        );
        String cmd = scanner.nextLine();
        String content = scanner.nextLine();
        String author = scanner.nextLine();


        assertThat(cmd).isEqualTo("등록");
        assertThat(content).isEqualTo("현재를 사랑하라.");
        assertThat(author).isEqualTo("작자미상");
    }

    @Test
    @DisplayName("TestUtil.setOutByteArray()")
    void t2() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = TestUtil.setOutByteArray();

        System.out.println("1 / 이순신 / 나의 죽음을 적에게 알리지 마라");

        String rst = byteArrayOutputStream.toString();

        TestUtil.clearSetOutToByteArray(byteArrayOutputStream);

        System.out.println("출력: " + rst);

        assertThat(rst).contains("1 / 이순신 / 나의 죽음을 적에게 알리지 마라");
    }






}
//TestUtil의 필요한 것을 설계하고 작성하는게 아니라 TestUtilTest를 통해 필요한 것을 만든다