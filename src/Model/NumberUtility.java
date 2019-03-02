/*
 * Project written by Tim Smith
 * Student ID #000865546
 */
package Model;

/**
 * Abstract Class to implement some number handling methods
 */
public abstract class NumberUtility {
    public static boolean isInt(String s) {
        return s.matches("\\d+");
    }
    
    public static boolean isDouble(String s) {
        return s.matches("[0-9]*\\.[0-9]{2}$");
    }
    
}
