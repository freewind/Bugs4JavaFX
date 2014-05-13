package bug_37093;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextArea editor;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        editor.setOnKeyPressed((event) -> {
            System.out.println("KeyPressed: " + event);
        });
        editor.setText("Press <kbd>cmd</kbd> + <kbd>=</kbd>, also other keys, and see the console");
    }
}
