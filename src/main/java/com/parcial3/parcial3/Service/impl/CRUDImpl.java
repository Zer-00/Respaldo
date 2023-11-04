package com.parcial3.parcial3.Service.impl;


import java.util.List;

import com.parcial3.parcial3.Repositories.IGenericRepo;
import com.parcial3.parcial3.Service.ICRUD;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID>{

    protected abstract IGenericRepo<T, ID> getRepo();

    @Override
    public T save(T t) {
        return getRepo().save(t);
    }

    @Override
    public T update(T t) {
        return getRepo().save(t);
    }

    @Override
    public T findById(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public List<T> findAll() {
        return getRepo().findAll();
    }

    @Override
    public void delete(ID id) {
        getRepo().deleteById(id);
    }
}