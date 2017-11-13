import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StartController {
    @FXML
    private Button start;
    @FXML
    private Button players;
    @FXML
    private Button groups;
    @FXML
    private Button createP;
    @FXML
    private Button createG;
    @FXML
    private Button addP;


    public void initialize() {
        // Don't call this on initialize, call whenever new question gets asked
//        timer();
//        playGame();
//        test.setText("Set from Con");
    }

    @FXML
    private void handleMenuChoice(ActionEvent event) throws IOException {

        try {


            FXMLLoader fxmlLoader;

            if (event.getSource() == start) {
                fxmlLoader = new FXMLLoader(getClass().getResource("UI.fxml"));
            } else if (event.getSource() == groups) {
                fxmlLoader = new FXMLLoader(getClass().getResource("UI.fxml"));
            } else if (event.getSource() == players) {
                fxmlLoader = new FXMLLoader(getClass().getResource("UI.fxml"));
            } else if (event.getSource() == createP) {
                fxmlLoader = new FXMLLoader(getClass().getResource("UI.fxml"));
            } else if (event.getSource() == createG) {
                fxmlLoader = new FXMLLoader(getClass().getResource("UI.fxml"));
            } else {
                fxmlLoader = new FXMLLoader(getClass().getResource("UI.fxml"));
            }

            Stage stage = new Stage();

            Parent root = fxmlLoader.load();

            Scene scene = new Scene(root, 1200, 800);
            stage.setScene(scene);
            stage.setTitle("Agile Pursuit");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
