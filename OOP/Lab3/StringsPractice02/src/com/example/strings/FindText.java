// package OOP.Lab3.StringsPractice02.src.com.example.strings;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindText {

    private String fileName = "OOP\\Lab3\\StringsPractice02\\gettys.html";
    // Create Pattern
    private Pattern pattern;
    // Create Matcher
    private Matcher match;
    public static void main(String[] args) {
        FindText find = new FindText();
        find.run();
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            int c = 1;
            pattern = Pattern.compile("<h2>"); 
            // pattern = Pattern.compile("\\bto\\b");
            // pattern = Pattern.compile("^\\s{4}");
            // pattern = Pattern.compile("^<[p|d]");
            // pattern = Pattern.compile("^</.*?>$");
            
               
            while ((line = reader.readLine()) != null) {
                // Generate a matcher based on Pattern
                match = pattern.matcher(line);
                // Search for text
                if(match.find()){
                    System.out.println(" " + c + ' ' + line);
                }
                // Print results
                c++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


