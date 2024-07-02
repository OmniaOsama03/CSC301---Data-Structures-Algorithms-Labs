package Lab1;

import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File file = new java.io.File("C:/Users/maado/Desktop/violations.txt");

        // Create a Scanner for the file
		Scanner scanner = new Scanner(file);

        // Read data from a file
        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            String[] data = line.split(" ");

            int code = Integer.parseInt(data[0]);
            String violation = data[1];
            int fine = Integer.parseInt(data[2]);
            String paid = data[3];

            System.out.println("\n Code: " + code + "\n Violation: " + violation + "\n fine: " + fine + "\n paid: " + paid);
        }

        // Close the file
        scanner.close();
    }
}

