package cz.cvut.fel.ass.kwic.implicitInvocation;

import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

/**
 * @author klimesf
 */
class Alphabetizer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        Lines lines = (Lines) o;
        LinesEvent event = (LinesEvent) arg;
        Collections.sort(lines.all());
    }
}
