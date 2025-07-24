package com.cesarlead.hr.fundamentals_of_language.repo_generico_en_memoria;


import java.util.*;
import java.util.function.Function;

public class InMemoryGenericRepository<T, ID> implements GenericRepository<T, ID> {

    private final Map<ID, T> storage = new HashMap<>();

    private final Function<T, ID> idExtrartor;

    public InMemoryGenericRepository(Function<T, ID> idExtrartor) {
        this.idExtrartor = Objects.requireNonNull(idExtrartor, "idExtrartor cannot be null");
    }


    @Override
    public void save(T entity) {
        var id = idExtrartor.apply(entity);
        storage.put(id, entity);

    }

    @Override
    public List<T> findAll() {
        return List.copyOf(storage.values());
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(storage.get(id));
    }
}
