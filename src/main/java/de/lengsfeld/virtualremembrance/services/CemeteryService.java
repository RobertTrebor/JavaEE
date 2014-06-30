package de.lengsfeld.virtualremembrance.services;

import de.lengsfeld.virtualremembrance.Cemetery;
import java.util.List;


public interface CemeteryService {
    List<Cemetery> getAllCemeteries();
    void addCemetery(Cemetery cemetery);
    void deleteCemetery(Cemetery cemetery);
    void updateCemetery(Cemetery cemetery);
}
