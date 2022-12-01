package programming.intro;

import java.util.Scanner;

public class Intro {
    public static void main(String [] args){
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please enter your favorite hobby:");
        Scanner scanner2 = new Scanner(System.in);
        String hobby = scanner2.nextLine();
        System.out.println("The " + hobby + " is favorite hobby on " + name);
    }
}
