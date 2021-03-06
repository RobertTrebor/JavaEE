package de.lengsfeld.virtualremembrance.controller;

import de.lengsfeld.virtualremembrance.Cemetery;
import de.lengsfeld.virtualremembrance.util.Events.Added;
import de.lengsfeld.virtualremembrance.util.Events.Updated;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

@SessionScoped
@Named
public class CemeteryEditController implements Serializable {

    @Inject @Added
    private Event<Cemetery> cemeteryAddEventSrc;
    
    @Inject @Updated
    private Event<Cemetery> cemeteryUpdatedEventSrc;

    public enum Mode {
        EDIT, ADD
    };

    private Cemetery cemetery;
    private Mode mode;

    public Cemetery getCemetery() {
        return cemetery;
    }

    public Mode getMode() {
        return mode;
    }

    public void setCemeteryToEdit(Mode mode) {
        setCemeteryToEdit(mode, new Cemetery());
    }

    public void setCemeteryToEdit(Mode mode, Cemetery cemetery) {
        this.cemetery = cemetery;
        this.mode = mode;
    }

    public String doSave() {
        if (getMode() == Mode.ADD) {
            cemeteryAddEventSrc.fire(cemetery);
        } else {
            cemeteryUpdatedEventSrc.fire(cemetery);
        }
        return Pages.CEMETERY_LIST;
    }

    public String doCancel() {
        return Pages.CEMETERY_LIST;
    }

    public String getTitle() {
        return getMode() == Mode.EDIT ? "Edit Cemetery" : "Add New Cemetery";
    }
}
