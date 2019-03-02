/*
 * Project written by Tim Smith
 * Student ID #000865546
 */
package Model;

/**
 * Class: Inhouse
 *  -Child class of Part for internally sourced parts
 * Members
 *      Fields: int machineID
 *      Methods: getter & setter for field, validator for field
 *      Constructors: One expecting input data types that match the fields and one for excepting all Strings
 */
public class Inhouse extends Part {
    private int machineID;

    // Constructors
    public Inhouse(int partID, String name, double price, int inStock, int min, int max, int machineID) {
       super.setPartID(partID);
       super.setName(name);
       super.setPrice(price);
       super.setInStock(inStock);
       super.setMin(min);
       super.setMax(max);
       this.machineID = machineID;
    }
    
    public Inhouse(String partID, String name, String price, String inStock, String min, 
            String max, String machineID) {
       super.setPartID(Integer.parseInt(partID));
       super.setName(name);
       super.setPrice(Double.parseDouble(price));
       super.setInStock(Integer.parseInt(inStock));
       super.setMin(Integer.parseInt(min));
       super.setMax(Integer.parseInt(max));
       this.machineID = Integer.parseInt(machineID);
    }
    
    // Getter, Setter, Validator
    public int getMachineID() {
        return machineID;
    }

    public void setMachineID(int machineID) {
        this.machineID = machineID;
    }
    
    public static Boolean validateMachineIDInputText(String inputText) throws InputException {
        if (!NumberUtility.isInt(inputText)) {
            throw new InputException("Must be a number with no decimals");
        } else if (Integer.parseInt(inputText) <= 0) {
            throw new InputException("Cannot be less than 1");
        }
        
        return true;
    }
}
