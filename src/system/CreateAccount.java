package system;

import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAccount {

    String newAccountName = "";
    String newAccountPassword = "";
    String confirmAccountPassword;
    public void createNewAccount() {

        Scanner userInput = new Scanner(System.in);

        System.out.println("---CREATE NEW ACCOUNT---");
        System.out.print("Enter Account Name: ");
        newAccountName = userInput.nextLine();
        System.out.print("Enter Account Password: ");
        newAccountPassword = userInput.nextLine();
        System.out.print("Confirm Password: ");
        confirmAccountPassword = userInput.nextLine();

        if (newAccountPassword.equals(confirmAccountPassword)) {

            try {
                FileWriter databaseWriter = new FileWriter("accounts.txt", true);
                databaseWriter.write(newAccountName + " , " + newAccountPassword + "\n");
                databaseWriter.close();
            } catch (IOException e) {
                System.out.println("An errror occured!");
            }
            System.out.println("Account created\n");
        } else {
            System.out.println("Password does not match, try again! \n");
            createNewAccount();
        }

    }


}
