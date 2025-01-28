package something;
import java.util.Scanner;

public class anotha {
    public static void main(String[] argums){
        Scanner getinp = new Scanner(System.in);
        System.out.print(
            "enter your name pls: "
        );
        String name = getinp.nextLine();

        System.out.print(
            "enter your age pls: "
        );
        int age = getinp.nextInt();
        double pi = getinp.nextDouble();

        System.out.println("well, well, well");
        System.out.println("hello " + name + " " + pi);
        System.out.println(
            "and, your age is: " + age + " and, its fine for this"
        );
        getinp.close();
    }
}
