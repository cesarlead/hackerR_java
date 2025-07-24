package com.cesarlead.hr.fundamentals_of_language.uso_optional;

import java.util.Optional;

public interface UserService {
    Optional<User> findByEmail(String email);

    String getNameOrAnonymous(String email);
}
