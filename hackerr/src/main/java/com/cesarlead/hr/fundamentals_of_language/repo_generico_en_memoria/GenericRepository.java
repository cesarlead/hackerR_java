package com.cesarlead.hr.fundamentals_of_language.repo_generico_en_memoria;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T, ID> {
    void save(T entity);

    List<T> findAll();

    Optional<T> findById(ID id);
}