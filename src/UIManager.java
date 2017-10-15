import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class UIManager extends Application{
	
	Stage stage;
	Scene scene;


	public static void main(String[] args)  {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Stage gameStage = primaryStage;

//		setQuestionArea();

		Parent root = FXMLLoader.load(getClass().getResource("UI.fxml"));

		scene = new Scene(root, 1200, 800);

		gameStage.setScene(scene);
		gameStage.setTitle("Agile Pursuit");
		gameStage.show();
	}

}
