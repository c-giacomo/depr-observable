package org.observer.observers;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Observable;
import java.util.Observer;

@Slf4j
@Getter
@Setter
public class FirstObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        log.info("First observer received news that " + o.getClass().getSimpleName() + " has changed is name in : " +
                (String) arg);
    }
}
