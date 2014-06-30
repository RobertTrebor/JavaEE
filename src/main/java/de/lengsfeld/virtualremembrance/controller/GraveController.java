//package de.lengsfeld.virtualremembrance.controller;
//
//import de.lengsfeld.virtualremembrance.Grave;
//import de.lengsfeld.virtualremembrance.services.GraveService;
//import java.io.Serializable;
//import javax.annotation.PostConstruct;
//import javax.enterprise.context.SessionScoped;
//import javax.inject.Inject;
//import javax.inject.Named;
//
//@SessionScoped
//@Named
//public class GraveController implements Serializable {
//    
//    private Long cemeteryId;
//    private Grave grave;
//    
//    @Inject
//    private GraveService graveService;
//    
//    @PostConstruct
//    public void init() {
//        this.grave = new Grave();
//    }
//    
//    public Long getCemeteryId() {
//        return cemeteryId;
//    }
//
//    public void setCemeteryId(Long cemeteryId) {
//        this.cemeteryId = cemeteryId;
//    }
//    
//    public Grave getGrave() {
//        return grave;
//    }
//
//    public void setGrave(Grave grave) {
//        System.out.println("GraveController - setGrave: " + grave);
//        this.grave = grave;
//    }
//    
//    public String doGrave() {
//        addGrave();
//        return Pages.GRAVE_EDIT;
//    }
//    
//    public void addGrave() {
//        System.out.println("---GraveController.java - addGrave");
//        graveService.addGrave(getCemeteryId(), getGrave());
//        init();
//    }
//    
//}