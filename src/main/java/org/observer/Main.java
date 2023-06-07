package org.observer;

import org.observer.observables.Agency;
import org.observer.observers.FirstObserver;
import org.observer.observers.SecondObserver;


public class Main {
    public static void main(String args[]) {

        Agency a = new Agency();
        FirstObserver obs1 = new FirstObserver();
        SecondObserver obs2 = new SecondObserver();
        a.addObserver(obs1);
        a.addObserver(obs2);
        a.updateName();
        a.updateNoChangeName();

    }
}
