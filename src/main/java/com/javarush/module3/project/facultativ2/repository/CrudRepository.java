package com.javarush.module3.project.facultativ2.repository;

import java.util.Optional;

public interface CrudRepository<E> {

    Optional<E> findById(Integer id);
}
