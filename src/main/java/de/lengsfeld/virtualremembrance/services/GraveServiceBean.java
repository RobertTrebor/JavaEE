package de.lengsfeld.virtualremembrance.services;

import de.lengsfeld.virtualremembrance.Cemetery;
import de.lengsfeld.virtualremembrance.Grave;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class GraveServiceBean implements GraveService {

    @PersistenceContext(unitName="VR")
    EntityManager entityManager;
    
    @Override
    public List<Grave> getGraveList(Long cemeteryId) {
        System.out.println("GraveServiceBean - getGraveList");
        Cemetery managedCemetery = entityManager.find(Cemetery.class, cemeteryId);
        System.out.println("managedCemetery: " + managedCemetery);
        //TypedQuery<Grave> query = entityManager.createNamedQuery(Grave.findAll, Grave.class);
        System.out.println("TypedQuery: ");
        TypedQuery<Grave> query;
        query = entityManager.createNamedQuery(Grave.findByCemetery, Grave.class);
        query.setParameter("cemetery", managedCemetery);
        List<Grave> graves = query.getResultList();
//        List<Grave> graves = managedCemetery.getGraves();
        System.out.println("List<Grave> graves: " + graves);
        graves.size();
        return graves;
    }

    @Override
    public void addGrave(Grave grave) {
        System.out.println("GraveServiceBean.java - addGrave: grave: " + grave);
        entityManager.persist(grave);
    }

    @Override
    public void deleteGrave(Grave grave) {
        System.out.println("GraveServiceBean.java - deleteGrave: grave" + grave);
        Grave managedGrave = entityManager.find(Grave.class, grave.getId());
        entityManager.remove(managedGrave);
    }

    @Override
    public void updateGrave(Grave grave) {
        System.out.println("GraveServiceBean.java - updateGrave: grave" + grave);
        entityManager.merge(grave);
    }

}