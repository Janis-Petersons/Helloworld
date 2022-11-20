package lekcijasSesiTest.mavenTestNGHomework;

import com.github.lalyos.jfiglet.FigletFont;
import org.openqa.selenium.json.JsonOutput;

import java.io.IOException;

public class MavenTest {
    public static void main(String[] args) throws IOException {
        String asciiArt = FigletFont.convertOneLine ("JĀNIS PĒTERSONS");
        System.out.println(asciiArt);
    }

}
