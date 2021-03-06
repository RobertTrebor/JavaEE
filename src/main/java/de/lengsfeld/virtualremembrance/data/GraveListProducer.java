package de.lengsfeld.virtualremembrance.data;

import de.lengsfeld.virtualremembrance.Grave;
import de.lengsfeld.virtualremembrance.services.GraveService;
import de.lengsfeld.virtualremembrance.util.Events.Added;
import de.lengsfeld.virtualremembrance.util.Events.Deleted;
import de.lengsfeld.virtualremembrance.util.Events.Updated;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;


@RequestScoped
public class GraveListProducer {

    private List<Grave> graves;
    
    @Inject
    private GraveService graveService;
    
//    @PostConstruct
//    public void init() {
//        System.out.println("GraveListProducer.java - init");
//        graves = graveService.getGraveList(1l);
//    }

    @Produces
    @Named
    public List<Grave> getGraves() {
        return graves;
    }
    
    public void onGraveAdded(@Observes @Added Grave grave) {

        System.out.println("GraveListProducer.java - onGraveAdded");
        graveService.addGrave(grave);
    }
    
    public void onGraveDeleted(@Observes @Deleted Grave grave) {
        System.out.println("GraveListProducer.java - onGraveDeleted");
        graveService.deleteGrave(grave);
    }
    
    public void onGraveUpdated(@Observes @Updated Grave grave) {
        System.out.println("GraveListProducer.java - onGraveUpdated");
        graveService.updateGrave(grave);
    }
}
