/*
 * Project written by: Tim Smith
 * 
 */
package View_Controller;

import Model.Part;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Tim Smith>
 */
public class ModifyProductController implements Initializable {
    // Labels
    @FXML private Label titleLabel;
    @FXML private Label nameErrorLabel;
    @FXML private Label inStockErrorLabel;
    @FXML private Label priceErrorLabel;
    @FXML private Label maxErrorLabel;
    @FXML private Label minErrorLabel;
    @FXML private Label productPartListErrorLabel;
    
    //TextFields
    @FXML private TextField nameTextField;
    @FXML private TextField inStockTextField;
    @FXML private TextField priceTextField;
    @FXML private TextField maxTextField;
    @FXML private TextField minTextField;
    @FXML private TextField searchTextField;
    @FXML private TextField productIDTextField;
    
    //Buttons
    @FXML private Button searchButton;
    @FXML private Button addButton;
    @FXML private Button deleteButton;
    @FXML private Button saveButton;
    @FXML private Button cancelButton;
    
    //Screen TableViews
    @FXML private TableView<Part> partSearchTableView;
    @FXML private TableColumn<Part, Integer> partIDColumn;
    @FXML private TableColumn<Part, String> partNameColumn;
    @FXML private TableColumn<Part, Integer> partInStockColumn;
    @FXML private TableColumn<Part, Double> partPriceColumn;
    
    @FXML private TableView<Part> productPartTableView;
    @FXML private TableColumn<Part, Integer> productPartIDColumn;
    @FXML private TableColumn<Part, String> productPartNameColumn;
    @FXML private TableColumn<Part, Integer> productPartInStockColumn;
    @FXML private TableColumn<Part, Double> productPartPriceColumn;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
