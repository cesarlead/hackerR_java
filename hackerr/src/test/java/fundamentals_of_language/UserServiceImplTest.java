package fundamentals_of_language;

import com.cesarlead.hr.fundamentals_of_language.uso_optional.User;
import com.cesarlead.hr.fundamentals_of_language.uso_optional.UserService;
import com.cesarlead.hr.fundamentals_of_language.uso_optional.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

class UserServiceImplTest {

    private UserService us;

    @BeforeEach
    void setUp() {
        us = new UserServiceImpl(
                List.of(
                        new User(UUID.randomUUID(), "cesar", "cesar@cesar.com"),
                        new User(UUID.randomUUID(), "edu", "edu@cesar.com"),
                        new User(UUID.randomUUID(), "karli", "karli@cesar.com"),
                        new User(UUID.randomUUID(), "jose", "jose@cesar.com"),
                        new User(UUID.randomUUID(), "flav", "flav@cesar.com")
                )
        );
    }

    @Test
    void findByEmailTest() {
        Optional<User> u = us.findByEmail("cesar@cesar.com");
        assertThat(u).isPresent()
                .map(User::Name)
                .contains("cesar");

    }

    @Test
    void getNameOrAnonymousTest() {
        String name = us.getNameOrAnonymous("cesar1@cesar.com");
        assertThat(name).isEqualTo("ANONIMO");
    }


}
