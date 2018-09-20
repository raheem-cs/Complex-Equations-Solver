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

public class FXML3by3Controller extends Application implements Initializable
{
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ImageView imgBackground;
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
    private TextArea txtRealZ1;
    @FXML
    private TextArea txtRealZ2;
    @FXML
    private TextArea txtImagZ1;
    @FXML
    private TextArea txtImagZ2;
    @FXML
    private TextArea txtRealX3;
    @FXML
    private TextArea txtImagX3;
    @FXML
    private TextArea txtRealY3;
    @FXML
    private TextArea txtImagY3;
    @FXML
    private TextArea txtRealZ3;
    @FXML
    private TextArea txtImagZ3;
    @FXML
    private TextArea txtAbsReal3;
    @FXML
    private TextArea txtAbsImag3;
    @FXML
    private TextArea txtYSolution;
    @FXML
    private TextArea txtXSolution;
    @FXML
    private TextArea txtZSolution;
    @FXML
    private ComboBox comboMode;
    @FXML
    private Button btnSolve;
    @FXML
    private ImageView imgHelp;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // On enter, move foucus to next field (I don't manage to make loop for it)
        txtRealX1.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagX1.requestFocus();
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
                txtRealZ1.requestFocus();
                e.consume();
            }
        });
        
        txtRealZ1.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagZ1.requestFocus();
                e.consume();
            }
        });
        
        txtImagZ1.setOnKeyPressed(e ->
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
                txtRealZ2.requestFocus();
                e.consume();
            }
        });
        
        txtRealZ2.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagZ2.requestFocus();
                e.consume();
            }
        });
        
        txtImagZ2.setOnKeyPressed(e ->
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
        
        txtAbsImag2.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtRealX3.requestFocus();
                e.consume();
            }
        });
        
        txtRealX3.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagX3.requestFocus();
                e.consume();
            }
        });
        
        txtImagX3.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtRealY3.requestFocus();
                e.consume();
            }
        });
        
        txtRealY3.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagY3.requestFocus();
                e.consume();
            }
        });
        
        txtImagY3.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtRealZ3.requestFocus();
                e.consume();
            }
        });
        
        txtRealZ3.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtImagZ3.requestFocus();
                e.consume();
            }
        });
        
        txtImagZ3.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtAbsReal3.requestFocus();
                e.consume();
            }
        });
        
        txtAbsReal3.setOnKeyPressed(e ->
        {
            if (e.getCode() == KeyCode.ENTER)
            {
                txtAbsImag3.requestFocus();
                e.consume();
            }
        });
        
        txtAbsImag3.setOnKeyPressed(e ->
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
        
        // Select by default 3 × 3
        comboMode.getSelectionModel().select(mode2);
        
        // Add listner to catch changes, if user changed mode it's hooked
        comboMode.getSelectionModel().selectedItemProperty().addListener( (Observable, oldValue, newValue) ->
        {
            // If user choosed 2 × 2, let's load it's FXML
            if (newValue.equals(mode1))
            {
                // Try and catch in case that FXML not found
                try
                {
                    // Let's load our new FXML
                    Parent root = FXMLLoader.load(getClass().getResource("FXML2by2.fxml"));
                    
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
    
    // All our calculations happens when user click solve button
    @FXML
    private void onSolve(ActionEvent event)
    {
         // Define variables to store Real, Imag values in
        double realX1, imagX1, realY1, imagY1, realZ1, imagZ1, absReal1, absImag1;
        double realX2, imagX2, realY2, imagY2, realZ2, imagZ2, absReal2, absImag2;
        double realX3, imagX3, realY3, imagY3, realZ3, imagZ3, absReal3, absImag3;
        
        // Try and catch so in case user does not enter anything and it's empty it don't throw errors.
        // It will just print the exception information (TODO: Make graphical error)
        try
        {
            // Let's convert string values to double and store them
            realX1 = Double.parseDouble(txtRealX1.getText());
            imagX1 = Double.parseDouble(txtImagX1.getText());
            realY1 = Double.parseDouble(txtRealY1.getText());
            imagY1 = Double.parseDouble(txtImagY1.getText());
            realZ1 = Double.parseDouble(txtRealZ1.getText());
            imagZ1 = Double.parseDouble(txtImagZ1.getText());
            
            absReal1 = Double.parseDouble(txtAbsReal1.getText());
            absImag1 = Double.parseDouble(txtAbsImag1.getText());
            
            realX2 = Double.parseDouble(txtRealX2.getText());
            imagX2 = Double.parseDouble(txtImagX2.getText());
            realY2 = Double.parseDouble(txtRealY2.getText());
            imagY2 = Double.parseDouble(txtImagY2.getText());
            realZ2 = Double.parseDouble(txtRealZ2.getText());
            imagZ2 = Double.parseDouble(txtImagZ2.getText());

            absReal2 = Double.parseDouble(txtAbsReal2.getText());
            absImag2 = Double.parseDouble(txtAbsImag2.getText());
            
            realX3 = Double.parseDouble(txtRealX3.getText());
            imagX3 = Double.parseDouble(txtImagX3.getText());
            realY3 = Double.parseDouble(txtRealY3.getText());
            imagY3 = Double.parseDouble(txtImagY3.getText());
            realZ3 = Double.parseDouble(txtRealZ3.getText());
            imagZ3 = Double.parseDouble(txtImagZ3.getText());

            absReal3 = Double.parseDouble(txtAbsReal3.getText());
            absImag3 = Double.parseDouble(txtAbsImag3.getText());
            
            // Let's make complex numbers vairables
            Complex x1, y1, z1, abs1;
            Complex x2, y2, z2, abs2;
            Complex x3, y3, z3, abs3;
            
            // Let's create them using Complex constructor
            x1 = new Complex(realX1, imagX1);
            y1 = new Complex(realY1, imagY1);
            z1 = new Complex(realZ1, imagZ1);
            abs1 = new Complex(absReal1, absImag1);
            
            x2 = new Complex(realX2, imagX2);
            y2 = new Complex(realY2, imagY2);
            z2 = new Complex(realZ2, imagZ2);
            abs2 = new Complex(absReal2, absImag2);
            
            x3 = new Complex(realX3, imagX3);
            y3 = new Complex(realY3, imagY3);
            z3 = new Complex(realZ3, imagZ3);
            abs3 = new Complex(absReal3, absImag3);
            
            /* We will use Cramer's rule to solve equations
            *  Let's now create complex matrices to get it's determinants
            *  
            *  m - Is the coefficient matrix
            *  mX - Is the x matrix (x column is replaced by absolute values abs1, abs2, abs3)
            *  mY - is the y matrix (y column is replaced by absolute values abs1, abs2, abs3)
            *  mZ - is the z matrix (z column is replaced by absolute values abs1, abs2, abs3)
            */
            
            // Make addresses for our complex matrices
            ComplexMatrix m, mX, mY, mZ;
            
            // Create the complex matrices (3 × 3)
            m = new ComplexMatrix(3, 3);
            mX = new ComplexMatrix(3, 3);
            mY = new ComplexMatrix(3, 3);
            mZ = new ComplexMatrix(3, 3);
            
            // Let's fill complex matrix - m
            m.addElement(0, 0, x1);
            m.addElement(0, 1, y1);
            m.addElement(0, 2, z1);
            m.addElement(1, 0, x2);
            m.addElement(1, 1, y2);
            m.addElement(1, 2, z2);
            m.addElement(2, 0, x3);
            m.addElement(2, 1, y3);
            m.addElement(2, 2, z3);
            
            // Let's fill complex matrix - mX
            mX.addElement(0, 0, abs1);
            mX.addElement(0, 1, y1);
            mX.addElement(0, 2, z1);
            mX.addElement(1, 0, abs2);
            mX.addElement(1, 1, y2);
            mX.addElement(1, 2, z2);
            mX.addElement(2, 0, abs3);
            mX.addElement(2, 1, y3);
            mX.addElement(2, 2, z3);
            
            // Let's fill complex matrix - mY
            mY.addElement(0, 0, x1);
            mY.addElement(0, 1, abs1);
            mY.addElement(0, 2, z1);
            mY.addElement(1, 0, x2);
            mY.addElement(1, 1, abs2);
            mY.addElement(1, 2, z2);
            mY.addElement(2, 0, x3);
            mY.addElement(2, 1, abs3);
            mY.addElement(2, 2, z3);
            
            // Let's fill complex matrix - mZ
            mZ.addElement(0, 0, x1);
            mZ.addElement(0, 1, y1);
            mZ.addElement(0, 2, abs1);
            mZ.addElement(1, 0, x2);
            mZ.addElement(1, 1, y2);
            mZ.addElement(1, 2, abs2);
            mZ.addElement(2, 0, x3);
            mZ.addElement(2, 1, y3);
            mZ.addElement(2, 2, abs3);
            
            // Create four complex number for the 4 determinants
            Complex d, dX, dY, dZ;
            
            // Calculate determinants
            d = ComplexMatrix.getDeterminant(m);
            dX = ComplexMatrix.getDeterminant(mX);
            dY = ComplexMatrix.getDeterminant(mY);
            dZ = ComplexMatrix.getDeterminant(mZ);
            
            // Let's first check if coefficient determinant not zero
            if (d.getReal() == 0 && d.getImag() == 0)
            {
                // Let's show an alret and then exit onSolve() function
                Alert alertZeroDivision = new Alert(Alert.AlertType.ERROR, "Coefficient Determinent = 0, No solution for these equations!", ButtonType.OK);
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
            
            // Get Z Solution
            Complex z = Complex.divideComplex(dZ, d);
            
            // Show the solution in text area
            txtXSolution.setText(x.toString());
            txtYSolution.setText(y.toString());
            txtZSolution.setText(z.toString());
        }
        catch (NumberFormatException ex)
        {
            // Let's show an alret if any field is empty!
            Alert alertEmptyField = new Alert(Alert.AlertType.ERROR, "Please fill all fields with valid numbers!", ButtonType.OK);
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
        Alert alertGetHelp = new Alert(Alert.AlertType.INFORMATION, "", ButtonType.OK);
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

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        // NOTHING TODO HERE
    }
}