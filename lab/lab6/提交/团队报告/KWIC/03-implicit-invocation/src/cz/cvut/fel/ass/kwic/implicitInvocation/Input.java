package cz.cvut.fel.ass.kwic.implicitInvocation;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author klimesf
 */
class Input {
    void readFile(Lines lines, File file) throws IOException {
        for (String line : Files.readAllLines(Paths.get(file.getName()))) {
            lines.insert(line);
        }
    }
}
