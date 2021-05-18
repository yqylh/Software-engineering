import java.util.List;

/**
 * Created by mejty on 7.3.16.
 */
public class MyCharacters implements Characters {
    private List<String> lines;

    public MyCharacters(List<String> lines) {
        this.lines = lines;
    }

    public MyCharacters() {
    }

    @Override
    public void setChar(List<String> characters) {
        lines = characters;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }
}
