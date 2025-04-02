package NetworkThreading.src.com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ThreadInterruptedMain {
    public static void main(String[] args) throws IOException {
        
        Runnable r = new Counter();
        Thread t = new Thread(r);
        t.start();
        try(Scanner scan = new Scanner(System.in);){
            scan.nextLine();
        }catch(Exception e){}
        
        
        t.interrupt();
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
        System.out.println("Thread is alive: " + t.isAlive());
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
        //     br.readLine();
        // }catch(IOException e){

        // }
    }
}
