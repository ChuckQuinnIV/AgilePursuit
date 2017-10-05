import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class UIManager extends Application{
	
	Stage stage;
	AnchorPane myPane;
	Scene scene;
	
	public UIManager () {
		myPane = new AnchorPane();
	}
	
	public void play() {
		stage.setTitle("Hello!");
		stage.show();
	}
	
	public static void main(String[] args)  {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Stage gameStage = primaryStage;
		scene = new Scene(myPane, 750, 750);
		gameStage.setScene(scene);
		gameStage.setTitle("Agile Pursuit");
		gameStage.show();
	}

}
