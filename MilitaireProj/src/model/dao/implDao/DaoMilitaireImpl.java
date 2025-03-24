package model.dao.implDao;

import model.dao.DaoMilitaire;
import model.entities.Militaire;

import java.util.*;

public class DaoMilitaireImpl extends AbstractDaoImpl<Militaire> implements DaoMilitaire {

    private Map<Long, Militaire> mapMilitaire = new HashMap<>();

    public DaoMilitaireImpl() {}

    @Override
    public Militaire findByNID(Long nid) throws NoSuchElementException  {

        if(nid == null){
            throw new NullPointerException("Erreur de DaoMilitaire findByNID param NID Null");
        }

        Militaire militaire = null;
        for (Map.Entry<Long, Militaire> entry : mapMilitaire.entrySet()) {
            if (entry.getValue().getNid() == nid) {
                militaire = entry.getValue();
            }
        }

        if (militaire == null) {
            throw new NoSuchElementException("Erreur de DaoMilitaire findByNID nid " + nid + " n'existe pas");
        }

        return militaire;
    }
}
