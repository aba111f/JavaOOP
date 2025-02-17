import java.util.regex.*;



public class Lecture2 {
    
    public static void main(String[] args) {
        String target = "something";
        Pattern p1 = Pattern.compile("s");
        String pattern = "[^a-z]";
        Matcher m1 = p1.matcher(pattern);
        
        System.out.println(m1.matches()); 
    }
}
