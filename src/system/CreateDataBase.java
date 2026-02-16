package system;

import java.io.*;

public class CreateDataBase {
    public static void main(String[] args) {
        try {
            File accounts = new File("accounts.txt");
            if (accounts.createNewFile()) {
                System.out.println("File created: " + accounts.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}