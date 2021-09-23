import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HomeController {

    @FXML
    private TextField searchField;

    @FXML
    private TextField addressField;

    @FXML
    private Button btnFilter;

    @FXML
    void filterOpen(ActionEvent event) throws Exception{
        Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("scrFilter.fxml"));
        Scene scene = new Scene(root);

        s1.setScene(scene);
        s1.show(); 
    }

}