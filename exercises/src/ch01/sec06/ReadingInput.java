package ch01.sec06;

import java.io.InputStream;
import java.util.Scanner;
import java.io.Console;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = in.nextLine();

        System.out.print("Age: ");
        Integer age = in.nextInt();

// doesn't work for some reason
//        Console terminal = System.console();
//        String username = terminal.readLine("Username: ");
//        char[] password = terminal.readPassword("Password: ");


        Integer ageNextYear = getNextAge(age);

        String message = String.format("Hello, %s. Next year, you'll be %d", name, ageNextYear);
        System.out.print(message);
    }

    private static Integer getNextAge(int age) {
        return age + 1;
    }
}
