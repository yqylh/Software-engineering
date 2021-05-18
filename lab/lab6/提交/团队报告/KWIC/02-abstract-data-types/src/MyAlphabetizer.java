import java.util.Collections;
import java.util.List;

/**
 * Created by mejty on 20.3.16.
 */
public class MyAlphabetizer implements Alphabetizer {
    private List<String> lines;

    public MyAlphabetizer() {
    }

    public MyAlphabetizer(List<String> lines) {
        this.lines = alfabetize(lines);
    }


    private List<String> alfabetize(List<String> lines){
        Collections.sort(lines);
        return lines;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }
}
