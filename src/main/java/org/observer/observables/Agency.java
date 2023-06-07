package org.observer.observables;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;

@Getter
@Setter
public class Agency extends Observable {

    private String name;

    public void updateName() {
        this.name = "IBM";
        setChanged();
        notifyObservers(name);
    }

}
