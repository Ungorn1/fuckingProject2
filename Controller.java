package sample;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class Controller{

    @FXML
    public ResourceBundle resources;

    @FXML
    public URL location;

    @FXML
    public TextArea textAreaMain;

    @FXML
    public ImageView imageViewLockations;

    @FXML
    public Button buttonLockTwo;

    @FXML
    public Button buttonLockOne;

    @FXML
    public Button buttonLockThree;

    @FXML
    public Button buttonLockFore;

    @FXML
    void initialize() {
        Locations locations = new Locations();
        locations.city();
    }
}
