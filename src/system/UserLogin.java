package system;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class UserLogin {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int attempt = 0;
        boolean userLoggedIn = false;
        String accountName;
        String accountPassword;

        String testAccountName = "notc++";
        String testPassword = "nazi";


        while (attempt < 4 && !userLoggedIn) {
            System.out.println("-----------LOGIN-----------");
            System.out.print("Enter Account Name: ");
            accountName = userInput.nextLine();
            System.out.print("Enter Password: ");
            accountPassword = userInput.nextLine();

            System.out.println(accountName);
            System.out.println(accountPassword);

            if (accountName.equals(testAccountName)) {
                if (accountPassword.equals(testPassword)) {
                    userLoggedIn = true;

                    System.out.println("You are now logged in!");

                    Home newHome = new Home();
                    newHome.showHome();

                } else {
                    System.out.println("Incorrect Password! try again");
                    attempt++;
                }
            } else {
                System.out.println("Account not found!");
                attempt++;
            } if (attempt == 3) {
                System.out.println("You have reached the maximum amount of trials, try again later!");
                break;
            }

        }









    }

}
