package com.CSV;
import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * UC14: Ablity to read the address book with person contact as CSV file
 */

public class ReadIntoCsv {
    public static void main(String[] args) throws IOException {

        //Read into CSV file
        try {
            Reader reader = Files.newBufferedReader(Paths.get("C:/Users/SRUSHTI/Documents/AddressBook.csv"));
            CSVReader csvReader = new CSVReader(reader);
            String[] records = new String[5];
            while ((records = csvReader.readNext()) != null) {
                System.out.println("First Name:" + records[0]);
                System.out.println("Last Name:" + records[1]);
                System.out.println("Address:" + records[2]);
                System.out.println("City" + records[3]);
                System.out.println("State" + records[4]);
                System.out.println("Zip" + records[5]);
                System.out.println("Phone Number" + records[6]);
                System.out.println("Email" + records[7]);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }

    }
}
