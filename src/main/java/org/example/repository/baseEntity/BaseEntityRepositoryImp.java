package org.example.repository.baseEntity;

import org.example.model.BaseEntity;

public abstract class  BaseEntityRepositoryImp <T extends BaseEntity> implements BaseEntityRepository   {
    public abstract boolean deleteById (Long id) ;

}
