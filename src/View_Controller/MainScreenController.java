/*
 * Project written by: Tim Smith
 * 
 */
package View_Controller;

import Model.Part;
import Model.Product;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Tim Smith>
 */
public class MainScreenController implements Initializable {
    // Screen Buttons
    @FXML private Button searchPartsButton;
    @FXML private Button searchProductsButton;
    @FXML private Button addPartButton;
    @FXML private Button modifyPartButton;
    @FXML private Button deletePartButton;
    @FXML private Button addProductButton;
    @FXML private Button modifyProductButton;
    @FXML private Button deleteProductButton;
    @FXML private Button exitButton;
    
    // Screen TextFields
    @FXML private TextField partSearchTextField;
    @FXML private TextField productSearchTextField;
    
    // Screen TableViews
    @FXML private TableView<Part> partTableView;
    @FXML private TableColumn<Part, Integer> partIDColumn;
    @FXML private TableColumn<Part, String> partNameColumn;
    @FXML private TableColumn<Part, Integer> partInStockColumn;
    @FXML private TableColumn<Part, Double> partPriceColumn;
    
    @FXML private TableView<Product> productTableView;
    @FXML private TableColumn<Product, Integer> productIDColumn;
    @FXML private TableColumn<Product, String> productNameColumn;
    @FXML private TableColumn<Product, Integer> productInStockColumn;
    @FXML private TableColumn<Product, Double> productPriceColumn;
    
    // Labels
    @FXML private Label partSelectionErrorLabel;
    @FXML private Label productSelectionErrorLabel;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    // Button handlers
    // This method handles the exit button click and closes application
    public void handleExitButtonAction(ActionEvent event) throws IOException {
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.close();
    }
    
    // This method handles the search button click for the parts table
    public void handleSearchPartsButtonAction(ActionEvent event) throws IOException {
        
    }
    
    // This method handles the add button click for parts table
    public void handleAddPartButtonAction(ActionEvent event) throws IOException {
        
    }
    
    // This method handles the modify button click for parts table
    public void handleModifyPartButtonAction(ActionEvent event) throws IOException {
            
    }
    
    // This method handles the delete button click for parts table
    public void handleDeletePartButtonAction(ActionEvent event) throws IOException {
        // Create alert dialog to confirm delete action
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to delete this item?");
        Optional<ButtonType> action = alert.showAndWait();
        
        if(action.get() == ButtonType.OK) {
        }
        
    }
    
    // This method handles the search button click for the products table
    public void handleSearchProductsButtonAction(ActionEvent event) throws IOException {
    }
    
    // This method handles the search button click for the products table
    public void handleAddProductButtonAction(ActionEvent event) throws IOException {
    }
    
    // This method handles the button click for modify product
    public void handleModifyProductButtonAction(ActionEvent event) throws IOException {
    }
    
    //This method handles the button click for delete product
    public void handleDeleteProductButtonAction(ActionEvent event) throws IOException {
        
    }
    
}
