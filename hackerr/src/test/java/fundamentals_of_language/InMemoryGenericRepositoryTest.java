package fundamentals_of_language;

import com.cesarlead.hr.fundamentals_of_language.repo_generico_en_memoria.InMemoryGenericRepository;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.UUID;

record Client(UUID id, String name) {
}

public class InMemoryGenericRepositoryTest {

    @Test
    void saveTest() {
        var repo = new InMemoryGenericRepository<>(Client::id);

        var c1 = new Client(UUID.randomUUID(), "Cesar Fernandez");
        var c2 = new Client(UUID.randomUUID(), "Karli Mata");
        var c3 = new Client(UUID.randomUUID(), "Eduardo Fernandez");

        repo.save(c1);
        repo.save(c2);
        repo.save(c3);

        var list = repo.findAll();

        System.out.println(Arrays.toString(list.toArray()));

        assert list.contains(c1);
        assert list.contains(c2);
        assert list.contains(c3);
    }

}
