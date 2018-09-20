package complexequationssolver;

import static complexequationssolver.ComplexEquationsSolver.primaryStage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.stage.Stage;

public class FXML2by2Controller extends Application implements Initializable
{
    // Here the FXML variables
    @FXML
    private AnchorPane anchorPane;
    @FXML
    public ImageView imgBackground;
    @FXML
    private TextArea txtRealX1;
    @FXML
    private TextArea txtImagX1;
    @FXML
    private TextArea txtRealY1;
    @FXML
    private TextArea txtImagY1;
    @FXML
    private TextArea txtAbsReal1;
    @FXML
    private TextArea txtAbsImag1;
    @FXML
    private TextArea txtRealX2;
    @FXML
    private TextArea txtImagX2;
    @FXML
    private TextArea txtRealY2;
    @FXML
    private TextArea txtImagY2;
    @FXML
    private TextArea txtAbsReal2;
    @FXML
    private TextArea txtAbsImag2;
    @FXML
    private Button btnSolve;
    @FXML
    private TextArea txtYSolution;
    @FXML
    private TextArea txtXSolution;
    @FXML
    private ComboBox comboMode;
    @FXML
    private ImageView imgAbout;

    // This event will be called once our FXML loaded, let's add all important things here
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // On enter, move foucus to next field
        txtRealX1.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                // This will move to next field
                txtImagX1.requestFocus();
                
                // This will block new lines in our text area
                e.consume();
            }
        });

        txtImagX1.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtRealY1.requestFocus();
                e.consume();
            }            
        });
        
        txtRealY1.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagY1.requestFocus();
                e.consume();
            }            
        });
        
        txtImagY1.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtAbsReal1.requestFocus();
                e.consume();
            }            
        });
        
        txtAbsReal1.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtAbsImag1.requestFocus();
                e.consume();
            }            
        });
        
        txtAbsImag1.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtRealX2.requestFocus();
                e.consume();
            }            
        });
        
        txtRealX2.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagX2.requestFocus();
                e.consume();
            }            
        });
        
        txtImagX2.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtRealY2.requestFocus();
                e.consume();
            }            
        });
        
        txtRealY2.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagY2.requestFocus();
                e.consume();
            }            
        });
        
        txtImagY2.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtAbsReal2.requestFocus();
                e.consume();
            }            
        });
        
        txtAbsReal2.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtAbsImag2.requestFocus();
                e.consume();
            }            
        });
        
        // Back to first field
        txtAbsImag2.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtRealX1.requestFocus();
                e.consume();
            }            
        });
        
        // Our modes
        String mode1 = "2×2";
        String mode2 = "3×3";
        
        // Add modes to combo box
        comboMode.getItems().addAll(mode1, mode2);
        
        // Select by default 2 × 2
        comboMode.getSelectionModel().select(mode1);
        
        // Add listner to catch changes, if user changed mode it's hooked
        comboMode.getSelectionModel().selectedItemProperty().addListener( (Observable, oldValue, newValue) ->
        {
            
            // If user choosed 3 × 3, let's load it's FXML
            if (newValue.equals(mode2))
            {
                // Try and catch in case that FXML not found
                try
                {
                    // Let's load our new FXML
                    Parent root = FXMLLoader.load(getClass().getResource("FXML3by3.fxml"));
                    
                    Scene scene = new Scene(root);
                    
                    primaryStage.setScene(scene);
                }
                catch (IOException ex)
                {
                    Logger.getLogger(FXML2by2Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    // On pressing Solve button (Generated by FXML), here all our calculations
    @FXML
    private void onSolve(ActionEvent event)
    {
        // Define variables to store Real, Imag values in
        double realX1, imagX1, realY1, imagY1, absReal1, absImag1;
        double realX2, imagX2, realY2, imagY2, absReal2, absImag2;
        
        // Try and catch so in case user does not enter anything and it's empty it don't throw errors.
        // It will just print the exception information (TODO: Make graphical error)
        try
        {
            // Let's convert string values to double and store them
            realX1 = Double.parseDouble(txtRealX1.getText());
            imagX1 = Double.parseDouble(txtImagX1.getText());
            realY1 = Double.parseDouble(txtRealY1.getText());
            imagY1 = Double.parseDouble(txtImagY1.getText());

            absReal1 = Double.parseDouble(txtAbsReal1.getText());
            absImag1 = Double.parseDouble(txtAbsImag1.getText());

            realX2 = Double.parseDouble(txtRealX2.getText());
            imagX2 = Double.parseDouble(txtImagX2.getText());
            realY2 = Double.parseDouble(txtRealY2.getText());
            imagY2 = Double.parseDouble(txtImagY2.getText());

            absReal2 = Double.parseDouble(txtAbsReal2.getText());
            absImag2 = Double.parseDouble(txtAbsImag2.getText());
            
            // Let's make complex numbers vairables
            Complex x1, y1, abs1;
            Complex x2, y2, abs2;
            
            // Let's create them using Complex constructor
            x1 = new Complex(realX1, imagX1);
            y1 = new Complex(realY1, imagY1);
            abs1 = new Complex(absReal1, absImag1);
            
            x2 = new Complex(realX2, imagX2);
            y2 = new Complex(realY2, imagY2);
            abs2 = new Complex(absReal2, absImag2);
            
            /* We will use Cramer's rule to solve equations
            *  Let's now create complex matrices to get it's determinants
            *  
            *  m - Is the coefficient matrix
            *  mX - Is the x matrix (x column is replaced by absolute values abs1, abs2)
            *  mY - is the y matrix (y column is replaced by absolute values abs1, abs2)
            */
            
            // Make addresses for our complex matrices
            ComplexMatrix m, mX, mY;
            
            // Create the complex matrices (2 × 2)
            m = new ComplexMatrix(2, 2);
            mX = new ComplexMatrix(2, 2);
            mY = new ComplexMatrix(2, 2);
            
            // Let's fill complex matrix - m
            m.addElement(0, 0, x1);
            m.addElement(0, 1, y1);
            m.addElement(1, 0, x2);
            m.addElement(1, 1, y2);
            
            // Let's fill complex matrix - mX
            mX.addElement(0, 0, abs1);
            mX.addElement(0, 1, y1);
            mX.addElement(1, 0, abs2);
            mX.addElement(1, 1, y2);
            
            // Let's fill complex matrix - mY
            mY.addElement(0, 0, x1);
            mY.addElement(0, 1, abs1);
            mY.addElement(1, 0, x2);
            mY.addElement(1, 1, abs2);
            
            // Create three complex number for the 3 determinants
            Complex d, dX, dY;
            
            // Calculate determinants
            d = ComplexMatrix.getDeterminant(m);
            dX = ComplexMatrix.getDeterminant(mX);
            dY = ComplexMatrix.getDeterminant(mY);
            
            // Let's first check if coefficient determinant not zero
            if (d.getReal() == 0 && d.getImag() == 0)
            {
                // Let's show an alret and then exit onSolve() function
                Alert alertZeroDivision = new Alert(AlertType.ERROR, "Coefficient Determinent = 0, No solution for these equations!", ButtonType.OK);
                alertZeroDivision.setTitle("Zero Division");
                alertZeroDivision.setHeaderText(null);
                
                Stage stage;
                
                // A way to add icon to the alret stage
                stage = (Stage) alertZeroDivision.getDialogPane().getScene().getWindow();
                stage.getIcons().add(new Image("images/solver-icon.png"));
                
                alertZeroDivision.showAndWait();
                return;
            }
                
            // Get X Solution
            Complex x = Complex.divideComplex(dX, d);
            
            // Get Y Solution
            Complex y = Complex.divideComplex(dY, d);
            
            // Show the solution in text area
            txtXSolution.setText(x.toString());
            txtYSolution.setText(y.toString());
        }
        catch (NumberFormatException ex)
        {
            // Let's show an alret if any field is empty!
            Alert alertEmptyField = new Alert(AlertType.ERROR, "Please fill all fields with valid numbers!", ButtonType.OK);
            alertEmptyField.setTitle("Empty Field or Wrong Values");
            alertEmptyField.setHeaderText(null);
            
            Stage stage;
            
            // A way to add icon to the alret stage
            stage = (Stage) alertEmptyField.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("images/solver-icon.png"));
            
            alertEmptyField.showAndWait();
        }
    }

    @FXML
    private void onHelp(MouseEvent event)
    {
        // Create our alert and set it's settings
        Alert alertGetHelp = new Alert(AlertType.INFORMATION, "", ButtonType.OK);
        alertGetHelp.setTitle("Need help?");
        alertGetHelp.setHeaderText(null);
        
        // Create hyberlink for our github
        Hyperlink githubLink = new Hyperlink("Check this project on GitHub.");
        
        // Add the hyberlink to our alert
        alertGetHelp.getDialogPane().setContent(githubLink);

        Stage stage;

        // A way to add icon to the alret stage
        stage = (Stage) alertGetHelp.getDialogPane().getScene().getWindow();
        stage.getIcons().add(new Image("images/solver-icon.png"));
        
        // Let's handle the click on the link, open in browser
        githubLink.setOnAction(e -> {
            getHostServices().showDocument("https://github.com/raheem-cs/Complex-Equations-Solver");
        });
        
        // Remove the stupid border for the hyberlink
        githubLink.setBorder(Border.EMPTY);
        
        // Show the alret and wait
        alertGetHelp.showAndWait();
    }
    
    // We extended Application class so we can use getHostServices() function
    // That's why start implemented here
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // NOTHING TODO HERE
    }
}