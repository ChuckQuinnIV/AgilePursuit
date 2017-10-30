import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import group.Group;
import game.Game;
import game.ConsuleGame;
import javafx.scene.control.ProgressIndicator;
import player.Player;
import questions.Question;

import java.util.Timer;
import java.util.TimerTask;

public class UIController {
    public Label testResponse;
    public ProgressIndicator progressIndicator;
    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    private double startTime = 0.05;
    private ConsuleGame gameConsole = new ConsuleGame();
    private Timer t = new Timer();

    public void setResponse(ActionEvent event){
//        testResponse.setText("You are incorrect!");
        t.cancel();
        progressIndicator.setProgress(0.0);
        startTime = 0.05;
    }

    // Does stuff onload
    public void initialize() {
        // Don't call this on initialize, call whenever new question gets asked
        timer();
        button1.setText("Set from Con");
    }

    private void timer() {

        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                progressIndicator.setProgress(startTime);
                startTime += 0.05;
            }
        },0,1000);
        //Delay currently doesn't work as intended
    }
}
