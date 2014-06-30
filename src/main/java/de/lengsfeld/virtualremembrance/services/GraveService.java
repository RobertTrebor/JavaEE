package de.lengsfeld.virtualremembrance.services;

import de.lengsfeld.virtualremembrance.Grave;
import java.util.List;

public interface GraveService {
    List<Grave> getGraveList(Long cemeteryId);
    void addGrave(Grave grave);
    void deleteGrave(Grave grave);
    void updateGrave(Grave grave);
}
