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
    
    // Constructor
    public void Inventory(ArrayList<Part> allParts, ArrayList<Product> products) {
        this.allParts = allParts;
        this.products = products;
    }
    
    // allParts methods
    
    public void addPart(Part part) {
        allParts.add(part);
    }
    
    public boolean deletePart(Part part) {
        return allParts.remove(part);
    }
    
    public Part lookupPart(int partID) {
        Part foundPart = null;
        
        for(Part part : allParts) {
            if(part.getPartID() == partID) {
                foundPart = part;
                break;
            }
        }
        
        return foundPart;
    }
    
    public void updatePart(int partID) {
        
    }
    
    // products methods
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public boolean deleteProduct(Product product) {
        return products.remove(product);
    }
    
    public Product lookupProduct(int productID) {
        Product foundProduct = null;
        
        for(Product product : products) {
            if(product.getProductID() == productID) {
                foundProduct = product;
                break;
            }
        }
        
        return foundProduct;
    }
    
    public void updateProduct(int producttID) {
        
    }
}
