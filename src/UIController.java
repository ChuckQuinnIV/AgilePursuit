
import game.Play;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import group.Group;
import game.Game;
import game.ConsuleGame;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import player.Player;
import questions.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import static game.ConsuleGame.*;

public class UIController {
    public Label testResponse;
    public ProgressIndicator progressIndicator;
    public Button button0;
    public Button button1;
    public Button button2;
    public Button button3;

    public Stage mainStage;
    public Stage startStage;


    @FXML
    private Text startScreenTitle;
    @FXML
    private Text mainTitle;
    @FXML
    private Text category;
    @FXML
    private Text question;
    @FXML
    private Text teamOne;
    @FXML
    private Text teamTwo;

    private double startTime = 0.05;
    private Timer t = new Timer();
    private static Game game = new Game();
    private static Play play = null;



    // Does stuff onload
    public void initialize() {
        // Don't call this on initialize, call whenever new question gets asked
//        timer();
        setTeams();
//        playGame();
    }

    private void timer() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                t.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        progressIndicator.setProgress(startTime);
                        startTime += 0.05;
                    }
                },0,1000);
            }
        });

        //Delay currently doesn't work as intended
    }
    public boolean askQuestion() {
        Question q = play.getQuestion();
        category.setText(Integer.toString(q.getCategory()));
        question.setText(q.getQuestion());
        int i = 0;
        for (String c : q.getChocies() ){
            System.out.println(i + ": " +c);
            i++;
        }
        String[] answers = q.getChocies();
        button0.setText(answers[0]);
        button1.setText(answers[1]);
        button0.setText(answers[2]);
        button0.setText(answers[3]);

        int sec = 20;
        timer();
        System.out.print("Enter Guess: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        String answer = "4547130333";
        try {
            while ((System.currentTimeMillis() - startTime) < sec * 1000 && !in.ready()) { }
            if (in.ready()) {
                int index = Integer.parseInt(in.readLine());
                answer = q.getChocies()[index];

            } else {
                System.out.println("\nTimes up!");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        boolean correct = false;
        if (play.checkAnswer(answer)){
            System.out.println("[Correct] - YOU GOT IT RIGHT!!!");
            correct = true;
        } else{
            System.out.println("[WRONG] - The correct answer is: " + q.getAnswer());

        }
        return correct;
    }
    public void playGame() {


        boolean display = true;

        while (! play.isGameOver()) {
            System.out.println("---------- Round-" + play.getRound() + ": " +play.whoseTurn() + "'s turn! ----------");
            askQuestion();
            System.out.print("\n" + play.getStringScoreCard());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println();

        }

    }

    public void setTeams() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Group1's Name: ");
        String g1 = sc.nextLine();
        System.out.print("Enter Group2's Name: ");
        String g2 = sc.nextLine();

        teamOne.setText(g1);
        teamTwo.setText(g2);
        play = game.play(g1, g2);
    }

    @FXML
    private void startGame() {
        playGame();
    }

    @FXML
    private void answerChoice(ActionEvent event) throws IOException {

    }
}
