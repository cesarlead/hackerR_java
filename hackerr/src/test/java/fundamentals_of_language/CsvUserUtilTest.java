package fundamentals_of_language;

import com.cesarlead.hr.fundamentals_of_language.lecturacsv.CsvUserUtil;
import com.cesarlead.hr.fundamentals_of_language.lecturacsv.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class CsvUserUtilTest {

    @TempDir
    Path tempDir;

    @Test
    void csvUserUtilTest() throws Exception {
        var users = List.of(
                new User(1, "cesar", "cesar@cesar.com", "123456"),
                new User(2, "edu", "edu@cesar.com", "123456"),
                new User(3, "dani", "dani@cesar.com", "123456"),
                new User(4, "flav", "flav@cesar.com", "123456")
        );

        Path pathFile = tempDir.resolve("users.csv");
        CsvUserUtil.writerUsers(pathFile, users);
        List<User> readUsers = CsvUserUtil.readerUsers(pathFile);

        assertThat(readUsers).contains(users.get(1), users.get(2), users.get(3));
    }
}
