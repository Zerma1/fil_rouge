package model.dao.implDao;

import model.dao.Dao;
import model.entities.AbstractEntity;
import model.entities.exceptions.DaoExeption;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractDaoImpl<T extends AbstractEntity> implements Dao<T> {

    protected Map<Long, T> persistence = new HashMap<>();

    private Long incrementationMapEntitie = 0L;

    private Long incrementationMapIngredient(){
        return incrementationMapEntitie++;
    }

    @Override
    public T save(T entite) throws DaoExeption, NullPointerException {
        if (entite == null) {
            throw new NullPointerException("Erreur de Dao save param Null");
        }
        if(persistence.containsValue(entite)){
            throw new DaoExeption("Erreur de Dao save");
        }

        entite.setId(this.incrementationMapIngredient());
        return persistence.put(entite.getId(), entite);
    }

    @Override
    public T read(Long id) throws NullPointerException {
        if (id == null) {
            throw new NullPointerException("Erreur de Dao read param Null");
        }
        return persistence.get(id);
    }

    @Override
    public T update(Long id, T entite) throws NullPointerException {
        if (entite == null || id == null) {
            throw new NullPointerException("Erreur de Dao update param Null");
        }
        return persistence.replace(id, entite);
    }

    @Override
    public Iterable<T> readAll() {
        return Collections.unmodifiableCollection(persistence.values());
    }

    @Override
    public boolean delete(Long id) throws NullPointerException {
        if (id == null) {
            throw new NullPointerException("Erreur de Dao update param Null");
        }
        return persistence.remove(id) != null;
    }

    @Override
    public boolean exist(Long id) throws NullPointerException {
        if (id == null) {
            throw new NullPointerException("Erreur de Dao update param Null");
        }
        return persistence.containsKey(id);
    }

    @Override
    public int count() {
        return persistence.size();
    }
}
