import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class UIManager extends Application{
	
	Stage stage;
	AnchorPane root;
	Scene scene;
	
	public UIManager () {
		root = new AnchorPane();
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
		
		Text question = new Text("Question");
		question.setLayoutX(250);
		question.setLayoutY(450);
		question.setFont(new Font(25));
		root.getChildren().add(question);

		Button answerA = new Button("A: Answer");
		answerA.setLayoutX(50);
		answerA.setLayoutY(500);
		answerA.setPrefSize(250, 75);
		root.getChildren().add(answerA);
		Button answerB = new Button("B: Answer");
		answerB.setLayoutX(310);
		answerB.setLayoutY(500);
		answerB.setPrefSize(250, 75);
		root.getChildren().add(answerB);
		Button answerC = new Button("C: Answer");
		answerC.setLayoutX(50);
		answerC.setLayoutY(600);
		answerC.setPrefSize(250, 75);
		root.getChildren().add(answerC);
		Button answerD = new Button("D: Answer");
		answerD.setLayoutX(310);
		answerD.setLayoutY(600);
		answerD.setPrefSize(250, 75);
		root.getChildren().add(answerD);
		
		scene = new Scene(root, 750, 750);

		gameStage.setScene(scene);
		gameStage.setTitle("Agile Pursuit");
		gameStage.show();
	}

}
