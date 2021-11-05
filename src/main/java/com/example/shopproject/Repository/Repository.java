package com.example.shopproject.Repository;

import java.util.List;
import java.util.Optional;

public interface Repository<T,I> {

    List<T> list();
    void create(T t);
    Optional<T> get(I id);
    void update(T t,I id);
    void delete(I id);

}
