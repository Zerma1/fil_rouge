package models.dao;

public interface Dao<T> {

    T save(T entity);

    T findById(Long id);

    T update(Long id, T entity);

    void deleteAll();

    Iterable<T> readAll();

    boolean delete(Long id);

    boolean exist(Long id);

    int count();
}
