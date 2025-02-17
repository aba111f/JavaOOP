package OOP.Lectures;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lecture1 {
    
    public static void main(String[] args){
        System.out.println("fast" + 'c');
        ArrayList arr = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int n, elem;
        n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            elem = scanner.nextInt();
            arr.add(elem);
        }
        arr.sort(null);
        System.out.println(arr);

        scanner.close();
    }
}
