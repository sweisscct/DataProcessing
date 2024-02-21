/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataprocessing;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author celeb
 */
public class ConsoleInput implements DataInputInterface {
    public ArrayList<String> getAndValidateAllData() {
        ArrayList<String> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        DataValidationInterface validator = new DummyValidator();
        
        boolean moreData = true;
        do {
            System.out.println("Please enter in some data:\n");
            String line = sc.nextLine();
            if (validator.validateLine(line)) {
                data.add(line);
            }
        } while (moreData);
        return data;
    }
}
