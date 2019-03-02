/*
 * Project written by Tim Smith
 * Student ID #000865546
 */
package Model;

import java.util.ArrayList;

/**
 * Class: Product
 * 
 * Members
 *      Fields: int productID, String name, double price, int inStock, int min, int max
 *      Methods: getters & setters for each field, validators for each field, addPart(Part) to add Part to 
 *              associatedParts
 */
public class Product {
    private ArrayList<Part> associatedParts;   // parts needed to produce product
    private int productID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;

    // Constructors
    // All fields but associatedParts incase that list is not created yet
    public Product(int productID, String name, double price, int inStock, int min, int max) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.min = min;
        this.max = max;
        this.associatedParts = new ArrayList<>();
    }
    
    // All fields including associatedParts
    public Product(int productID, String name, double price, int inStock, int min, 
            int max, ArrayList<Part> associatedParts) {
        this.associatedParts = associatedParts;
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
        this.min = min;
        this.max = max;
    }
    
    //Special constructor to pass form strings directly and parse as needed
    public Product(String productID, String name, String price, String inStock, String min, 
            String max, ArrayList<Part> associatedParts) {
        this.associatedParts = associatedParts;
        this.productID = Integer.parseInt(productID);
        this.name = name;
        this.price = Double.parseDouble(price);
        this.inStock = Integer.parseInt(inStock);
        this.min = Integer.parseInt(min);
        this.max = Integer.parseInt(max);
    }

    //Getters
    public int getProductID() {
        return productID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getInStock() {
        return inStock;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
    
    public ArrayList<Part> getPartList() {
        return associatedParts;
    }

    //Setters
    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(int inStock) {
        this.inStock = inStock;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public void setPartList(ArrayList<Part> partList) {
        associatedParts = partList;
    }
    
    //Validators
    public static Boolean validateNameInputText(String inputText) throws InputException {
        if (inputText.isEmpty()) {
            throw new InputException("Name field required");
        } else if (inputText.startsWith(" ")) {
            throw new InputException("Name cannot begin with space");
        }
                
        return true;
    }
    
    public static Boolean validateInStockInputText(String inputText) throws InputException {
        if (!NumberUtility.isInt(inputText)) {
            throw new InputException("Must be a number with no decimals");
        } else if (Integer.parseInt(inputText) < 0) {
            throw new InputException("Cannot be less than 0");
        }
        
        return true;
    }
    
    public static Boolean validatePriceInputText(String inputText) throws InputException {
        if (!NumberUtility.isDouble(inputText)) {
            throw new InputException("Must be a number with 2 decimal places");
        } else if (Double.parseDouble(inputText) <= 0) {
            throw new InputException("Must be greater than 0");
        }
        
        return true;
    }
    
    public static Boolean validateMinInputText(String inputText) throws InputException {
        if (!NumberUtility.isInt(inputText)) {
            throw new InputException("Must be a number with no decimals");
        }
        
        return true;
    }
    
    public static Boolean validateMaxInputText(String inputText) throws InputException {
        if (!NumberUtility.isInt(inputText)) {
            throw new InputException("Must be a number with no decimals");
        }
        
        return true;
    }
    
    public static Boolean validateAssociatedPartsInput(ArrayList<Part> inputPartList) throws InputException {
        if (inputPartList.isEmpty()) {
            throw new InputException("Product must have at least one associated part");
        }
        
        return true;
    }
    
    // This validation is separate so it can be called after both fields are populated
    public static Boolean minLessThanEqualToMax(int min, int max) throws InputException {
        if (min > max) {
            throw new InputException("Min must be <= Max");
        }
        
        return true;
    }
    
    // Validation to ensure Product price is greater than the total cost of associatedParts
    public static Boolean priceMoreThanPartCost (double price, ArrayList<Part> partList) throws InputException {
        double totalPartCost = 0;
        
        for(Part part : partList) {
            totalPartCost += part.getPrice();
        }
        
        if(price <= totalPartCost) {
            throw new InputException("Product price must be > than total cost of parts: " + totalPartCost);
        }
        
        return true;
    }
    
    //Add part to associatedParts
    public void addPart(Part newPart) {
        associatedParts.add(newPart);
    }
    
}
