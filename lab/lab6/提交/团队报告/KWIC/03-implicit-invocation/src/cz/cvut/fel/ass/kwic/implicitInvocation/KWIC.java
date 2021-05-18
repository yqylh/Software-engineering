package cz.cvut.fel.ass.kwic.implicitInvocation;

import java.io.File;
import java.io.IOException;

/**
 * @author klimesf
 */
public class KWIC {

    public static void main(String[] args) {
        Lines lines = new Lines();
        Lines shifts = new Lines();

        Input input = new Input();
        CircularShift circularShift = new CircularShift(shifts);
        Alphabetizer alphabetizer = new Alphabetizer();
        Output output = new Output();

        lines.addObserver(circularShift);
        shifts.addObserver(alphabetizer);

        try {
            input.readFile(lines, new File("input.txt"));
            output.writeFile(shifts, new File("output.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
