/*
 * Project written by: Tim Smith
 * 
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Tim Smith>
 */
public class Iventory {
    private ArrayList<Part> allParts;
    private ArrayList<Product> products;
    
    public void Inventory(ArrayList<Part> allParts, ArrayList<Product> products) {
        this.allParts = allParts;
        this.products = products;
    }
}
