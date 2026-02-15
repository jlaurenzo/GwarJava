package system;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class CreateAccount {

    String newAccountName;
    String newAccountPassword;
    String confirmAccountPassword;
    public void createNewAccount() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Create account page");
        System.out.print("Enter Account Name: ");
        newAccountName = userInput.nextLine();
        System.out.print("Enter Account Password: ");
        newAccountPassword = userInput.nextLine();
        System.out.print("Confirm Password: ");
        confirmAccountPassword = userInput.nextLine();

        if (newAccountPassword.equals(confirmAccountPassword)) {
            System.out.println("Account created");
        }

    }


}
