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
    public static DataInputInterface makeDataInput(DataInputTypes inputType) {
//        switch (inputType) {
//            case CONSOLE : {
//                return new ConsoleInput();
//            }
//            case FILE: {
//                return new FileInput();
//            }
//            case DATABASE: {
//                return new DatabaseInput();
//            }
//            default: {
//                return null;
//            }
//        } 
          if (inputType == null) {
              System.out.println("WARNING - INVALID INPUT TYPE");
              return null;
          }
          return inputType.getInput();
    }
}
