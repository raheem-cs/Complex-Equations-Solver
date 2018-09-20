package complexequationssolver;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ComplexEquationsSolver extends Application
{
    // Create a public data field so we can access stage and set new scene for it
    public static Stage primaryStage;
    
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("FXML2by2.fxml"));
        
        Scene scene = new Scene(root);
        
        primaryStage = stage;
        
        // For 2 × 2 and 3 × 3 let's hardcode the max height and width and disable maxmize
        // Block Resize ( poor way but i don't find another one :( )
        stage.maximizedProperty().addListener((observable, oldValue, newValue) -> {      
            stage.setMaximized(false);
        });
            
        stage.setMaxHeight(529);
        stage.setMaxWidth(918);
        
        // Set stage title
        stage.setTitle("Complex Equations Solver");
        
        // Set stage icon
        Image icon = new Image("images/solver-icon.png");
        stage.getIcons().add(icon);
        
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}