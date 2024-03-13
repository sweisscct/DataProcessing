/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataInputClasses;

import Interfaces.DataInputInterface;
import dataprocessing.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author celeb
 */
public class DatabaseInput extends Database implements DataInputInterface {
    public ArrayList<String> getAndValidateAllData() {
        ArrayList<String> allData = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM example_table;");
            
            while (rs.next()) {
                String name = rs.getString("name");
                allData.add(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allData;
    }
}
