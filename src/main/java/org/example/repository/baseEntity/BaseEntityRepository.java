package org.example.repository.baseEntity;

import org.example.model.BaseEntity;

import java.util.Optional;

public interface BaseEntityRepository <T extends BaseEntity> {
    boolean deleteById(Long id);
    Optional<T> findById(Long id);

}
