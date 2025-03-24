package model.dao;

public interface Dao<T> {
    T save (T entite);

    T read (Long id);

    T update (Long id, T entite);

    Iterable<T> readAll ();

    boolean delete (Long id);

    boolean exist (Long id);

    int count();
}
