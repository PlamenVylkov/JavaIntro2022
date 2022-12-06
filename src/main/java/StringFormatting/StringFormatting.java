package StringFormatting;

import java.util.Scanner;

public class StringFormatting {
    public static void main(String[] args) {
        //Replace substring in string
        String MyName = "My name is <myName>";
        System.out.println("Please enter your name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(MyName.replace("<myName>", name));

        //Compare two strings
        System.out.println("Please enter the first string to compare:");
        String FirstString = scanner.nextLine();

        System.out.println("Please enter the second string to compare:");
        String SecondString = scanner.nextLine();

        System.out.println(FirstString.compareTo(SecondString) == 0 ? "the two strings are the same" : "the two strings are different" );

        //Split strings
        System.out.println("The result of concatenate strings:" + FirstString.concat(SecondString));

        //Count entered words
        System.out.println("please enter a few words:");
        String Words = scanner.nextLine();
        System.out.println("You entered " + Words.split(" ").length + " words.");

    }
}
