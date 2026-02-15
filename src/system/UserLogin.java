package system;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class UserLogin {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int attempt = 0;
        int accountChoice;
        boolean userLoggedIn = false;
        String accountName;
        String accountPassword = "";

        String testAccountName = "notc++";
        String testPassword = "nazi";


        while (attempt < 4 && !userLoggedIn) {
            System.out.println("-----------LOGIN-----------");
            System.out.print("Enter Account Name: ");
            accountName = userInput.nextLine();

            if (accountName.equals(testAccountName)) {
                System.out.print("Enter Password: ");
                accountPassword = userInput.nextLine();

            } else {
                System.out.println("Account not found!");
                System.out.println("Try again or create another account");
                System.out.print("(1) to try gain | (2) to create account: ");
                accountChoice = userInput.nextInt();
                userInput.nextLine();

                if (accountChoice == 2) {
                    CreateAccount createAccount = new CreateAccount();
                    createAccount.createNewAccount();

                } else {
                    System.out.println("Try again");
                    attempt++;
                }

            }
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
            } if (attempt == 3) {
                System.out.println("You have reached the maximum amount of trials, try again later!");
                break;
            }


        }









    }

}
