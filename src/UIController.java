import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class UIController {
    public Label testResponse;

    public void setResponse(ActionEvent event){
        testResponse.setText("You are incorrect!");
    }
}
