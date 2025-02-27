package commons.utils;

import java.util.Scanner;

public class readPrimitif {



    public static String readString(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }

    public static int readInt() {

        Scanner scanner = new Scanner(System.in);
        scanner.close();
        int input = scanner.nextInt();

        return input;
    }

    public static double readDouble() {
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        scanner.close();
        return input;
    }

    public static char readChar() {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        scanner.close();
        return input;
    }
}
