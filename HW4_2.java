import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class HW4_2 {

    public static void main(String[] args) {
        Path filePath = Path.of("/Users/YM/Downloads/demo.txt");
        try {
            String content = Files.readString(filePath);
            String regex = "(?<=href=\").+?(?=\")";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                String matchedContent = matcher.group();
                System.out.println(matchedContent);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
