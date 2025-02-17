import java.util.Scanner;
public class Ternary {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // int age;
        // String name;

        // System.out.print("Enter you age: ");
        // age = scanner.nextInt();

        // System.out.print("Enter your name: " + scanner.nextLine());
        // name = scanner.nextLine();
        
        // String result = (age > 17) ? ("hello " + name) : ("You are not allowed to enter: ");
        // System.out.println(result);
        


        //Enhanced switch 

        int number = scanner.nextInt();
        //option 1
        // switch (number) {
        //     case 1 -> System.out.println("one");
        //     case 2 -> System.out.println("two");
        //     case 3 -> System.out.println("three");
        //     case 4 -> System.out.println("four");
        //     default -> System.out.println("nothing");
        // }

        //option 2
        int define = number % 2;
    
        switch (define) {
            case 0 -> System.out.println("even");
            default -> System.out.println("odd");
        }

        scanner.close();
    }
}
