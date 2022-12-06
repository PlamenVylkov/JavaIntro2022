package programming.intro;

import java.util.Scanner;

public class HomeworkHobby {
    public static void main(String [] args){
        System.out.println("Please enter your name:");
        Scanner scannerName = new Scanner(System.in);
        String name = scannerName.nextLine();
        System.out.println("Please enter your favorite hobby:");
        Scanner scannerHobby = new Scanner(System.in);
        String hobby = scannerHobby.nextLine();
        System.out.println("The " + hobby + " is favorite hobby on " + name);
    }
}
