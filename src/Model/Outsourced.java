/*
 * Project written by Tim Smith
 * Student ID #000865546
 */
package Model;

/**
 * Class: Ouotsourced
 *  -Child class of Part for externally sourced parts
 * Members
 *      Fields: String companyName
 *      Methods: getter & setter for field, validator for field
 *      Constructors: One expecting input data types that match the fields and one for excepting all Strings
 */
public class Outsourced extends Part {
    private String companyName;

    // Constructors
    public Outsourced(int partID, String name, double price, int inStock, int min, int max, String companyName) {
       super.setPartID(partID);
       super.setName(name);
       super.setPrice(price);
       super.setInStock(inStock);
       super.setMin(min);
       super.setMax(max);
       this.companyName = companyName;
    }
    
    public Outsourced(String partID, String name, String price, String inStock, String min, 
            String max, String companyName) {
       super.setPartID(Integer.parseInt(partID));
       super.setName(name);
       super.setPrice(Double.parseDouble(price));
       super.setInStock(Integer.parseInt(inStock));
       super.setMin(Integer.parseInt(min));
       super.setMax(Integer.parseInt(max));
       this.companyName = companyName;
    }

    // Getter, Setter, and Validator
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    
    public static Boolean validateCompanyNameInputText(String inputText) throws InputException {
        if (inputText.isEmpty()) {
            throw new InputException("Company Name field required");
            //to do add code to change border to red after css is configured
        } else if (inputText.startsWith(" ")) {
            throw new InputException("Company Name cannot begin with space");
        }
        
        return true;
    }
    
}
