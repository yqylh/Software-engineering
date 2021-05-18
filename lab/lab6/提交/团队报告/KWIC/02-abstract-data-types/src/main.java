import java.io.IOException;

/**
 * Created by mejty on 7.3.16.
 */
public class main {
    public static void main(String[] args) throws IOException {
        Input in = new FileInput("input.txt");
        Characters characters = new MyCharacters(in.readAll());
        CircularShift shifter = new MyShifter(characters.getLines());
        Alphabetizer alphabetizer = new MyAlphabetizer(shifter.getShiftedLines());
        Output output = new FileOutput("out.txt");
        output.writeLines(alphabetizer.getLines());
        output.close();

    }
}

