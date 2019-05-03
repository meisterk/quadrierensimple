import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class View implements Initializable {
    @FXML
    private TextField textFieldZahl;
    @FXML
    private Button buttonQuadrieren;
    @FXML
    private Label labelErgebnis;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonQuadrieren.setOnAction(event ->{
            int zahl = Integer.parseInt(textFieldZahl.getText());
            labelErgebnis.setText(String.format("%d² = %d", zahl, zahl*zahl));
        });
    }
}
