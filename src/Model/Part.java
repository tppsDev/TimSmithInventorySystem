/*
 * Project written by Tim Smith
 * Student ID #000865546
 */
package Model;

/**
 * Class: Part
 *  -Abstract Class for parts that can be divided into to subclasses:
 *      Inhouse - internally produced parts
 *      Outsourced - externally purchased parts
 * Members
 *      Fields: int partID, String name, double price, int inStock, int min, int max
 *      Methods: getters & setters for each field, validators for each field
 */
public abstract class Part {
        
    private int partID;
    private String name;
    private double price;
    private int inStock;
    private int min;
    private int max;

    //Getter methods
    public int getPartID() {
        return partID;
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
    
    //Setter methods
    public void setPartID(int partID) {
        this.partID = partID;
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
    
    //Validation methods
    
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
    
    // This validation is separate so it can be called after both fields are populated
    public static Boolean minLessThanEqualToMax(int min, int max) throws InputException {
        if (min > max) {
            throw new InputException("Min must be <= Max");
        }
        
        return true;
    }
}
