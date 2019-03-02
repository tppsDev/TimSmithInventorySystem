/*
 * Project written by: Tim Smith
 * 
 */
package View_Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Tim Smith>
 */
public class ModifyPartController implements Initializable {
    // Buttons
    @FXML private Button saveButton;
    @FXML private Button cancelButton;
    
    // RadioButtons
    @FXML private RadioButton inhouseRadioButton;
    @FXML private RadioButton outsourcedRadioButton;
    @FXML private ToggleGroup partTypeToggleGroup;
    
    // Label items
    @FXML private Label titleLabel;
    @FXML private Label machineOrCompanyLabel;
    @FXML private Label nameTextFieldErrorLabel;
    @FXML private Label inStockTextFieldErrorLabel;
    @FXML private Label priceTextFieldErrorLabel;
    @FXML private Label minTextFieldErrorLabel;
    @FXML private Label maxTextFieldErrorLabel;
    @FXML private Label machineCompanyTextFieldErrorLabel;
    
    // TextFields
    @FXML private TextField partIDTextField;
    @FXML private TextField nameTextField;
    @FXML private TextField inStockTextField;
    @FXML private TextField priceTextField;
    @FXML private TextField maxTextField;
    @FXML private TextField minTextField;
    @FXML private TextField machineCompanyTextField;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
