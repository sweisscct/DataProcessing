/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataInputClasses;

import Interfaces.DataInputInterface;

/**
 *
 * @author celeb
 */
public class DataInputFactory {
    public static DataInputInterface makeDataInput(String inputType) {
        switch (inputType) {
            case "Console": {
                return new ConsoleInput();
            }
            case "File": {
                return new FileInput();
            }
            default: {
                return null;
            }
        }            
    }
}
