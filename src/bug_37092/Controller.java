package bug_37092;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextArea editor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        editor.setStyle("-fx-font-family: 'Arial'");
        editor.setOnKeyPressed((event) -> {
            System.out.println("KeyPressed: " + event);
        });
        editor.setText("Put you cursor here |, then press the array 'down' key\n" +
                "\n" +
                "You can see the cursor won't move to this line");
    }
}
