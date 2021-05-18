package cz.cvut.fel.ass.kwic.implicitInvocation;

import java.util.*;

/**
 * @author klimesf
 */
class CircularShift implements Observer {

    private Lines shifts;

    CircularShift(Lines shifts) {
        this.shifts = shifts;
    }

    @Override
    public void update(Observable o, Object arg) {
        Lines lines = (Lines) o;
        LinesEvent event = (LinesEvent) arg;

        List<String> result = new LinkedList<>();
        List<String> words = new ArrayList<>(Arrays.asList(event.getLine().split(" ")));
        int lastIndex = words.size() - 1;
        for (int i = 0; i < words.size(); ++i) {
            words.add(0, words.remove(lastIndex));
            result.add(arrToString(words));
        }

        for (String shift : result) {
            shifts.insert(shift);
        }
    }

    private String arrToString(List<String> arr) {
        StringBuilder builder = new StringBuilder();
        for (String node : arr) {
            builder.append(node);
            builder.append(" ");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
