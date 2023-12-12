package ba.smoki.one.error;

import java.util.Scanner;

public class ErrorMain {
    public static void main(String[] args) {
        //Exception - Izuzetak
        System.out.println("Svi idu kući..");
        int number = 23;
        int result = new Scanner(System.in).nextInt();
        System.out.println(number/result);
        System.out.println("Muhamed će da prespava u office...");

    }
}
