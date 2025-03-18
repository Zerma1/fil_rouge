package models.dao.implDao;

import models.dao.Dao;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDaoImpl<T> implements Dao<T> {

    protected Map<Long, T> persistant = new HashMap<>();

    private Long Increment = 0L;

    private Long incrementationPersistant() {
        return ++Increment;
    }

    @Override
    public T save(T entity) {
        return persistant.put(incrementationPersistant(), entity);
    }

    @Override
    public T findById(Long id) {
        return persistant.get(id);
    }

    @Override
    public T update(Long id, T entity) {
        return persistant.put(id, entity);
    }

    @Override
    public void deleteAll() {
        persistant.clear();
    }

    @Override
    public Iterable<T> readAll() {
        return persistant.values();
    }

    @Override
    public boolean delete(Long id) {
        return persistant.remove(id) != null;
    }

    @Override
    public boolean exist(Long id) {
        return persistant.containsKey(id);
    }

    @Override
    public int count() {
        return persistant.size();
    }
}
