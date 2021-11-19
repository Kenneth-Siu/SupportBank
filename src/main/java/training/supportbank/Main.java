package training.supportbank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ArrayList<Transaction> transactions = new ArrayList<>();

        // Step 1
        // Be able to read the CSV file
        try {
            File myObj = new File("Transactions2014.csv");
            Scanner myReader = new Scanner(myObj);
            myReader.nextLine();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                // Step 2
                // Convert each line in the CSV file to a Transaction object
                List<String> list = Arrays.asList(data.split(","));
                Transaction transaction = new Transaction(list.get(0), list.get(1), list.get(2), list.get(3), Float.parseFloat(list.get(4)));

                // Step 3
                // Insert each Transaction object into the transactions array
                transactions.add(transaction);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i).narrative);
        }

        // Step 4
        // Create a list of accounts
            // Possibility a:
            // Go through the list of transactions and create an account for the "from" and the "to", if the account doesn't already exist

            // Possibility b:
            // Don't worry about creating accounts now, create them as we need them

        // Step 5
        // Run through each transaction and update the relevant accounts
            // If we went with possibility a:
            // Just do it

            // If we went with possibility b:
            // Does the "from" account exist?
                // If yes, then update the account
                // If no, create the account and then the update the account
            // Same thing for "to"
    }
}
