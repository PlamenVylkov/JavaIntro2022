package programming.intro;

import java.util.Scanner;

public class HomeworkHobby {
    public static void main(String [] args){
        //Enter name
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        //Enter hobby
        System.out.println("Please enter your favorite hobby:");
        String hobby = scanner.nextLine();

        //Show result
        System.out.println("The " + hobby + " is favorite hobby on " + name);
    }
}
