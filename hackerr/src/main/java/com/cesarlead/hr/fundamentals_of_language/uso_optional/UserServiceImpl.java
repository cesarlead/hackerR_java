package com.cesarlead.hr.fundamentals_of_language.uso_optional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class UserServiceImpl implements UserService {

    private static final String ANONYMOUS = "ANONIMO";

    private final List<User> arr;

    public UserServiceImpl(List<User> arr) {
        this.arr = Objects.requireNonNull(arr, "arr cannot be null");
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return arr.stream()
                .filter(u -> u.email().equals(email))
                .findFirst();
    }

    @Override
    public String getNameOrAnonymous(String email) {
        return arr.stream()
                .filter(u -> u.email().equals(email))
                .map(u -> u.Name().toUpperCase())
                .findFirst()
                .orElse(ANONYMOUS);
    }
}
