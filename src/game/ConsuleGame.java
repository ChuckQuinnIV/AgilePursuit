package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import group.Group;
import player.Player;
import questions.Question;

public class ConsuleGame {

	private static Game game = new Game();
	private static Play play = null;

	public static boolean askQuestion() {
		Question q = play.getQuestion();
		System.out.println("CATEGORY: " + q.getCategory());
		System.out.println(q.getQuestion());
		int i = 0;
		for (String c : q.getChocies() ){
			System.out.println(i + ": " +c);
			i++;
		}
		int sec = 20; // wait 20 seconds at most
		System.out.println("You have " + sec +" sec starting ... NOW!: ");
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

	public static void listGroups(){
		System.out.println("--- All Groups ---");  
		HashMap<String, Group> groups = game.getAllGroups();
		for (String name: groups.keySet()){
			String key = name.toString();
			ArrayList<String> memebers = groups.get(name).getPlayers();  
			System.out.println(key + " : " + memebers.toString());  
		} 
	}

	public static void listPlayers(){
		System.out.println("--- All Players ---");  
		HashMap<String, Player> players = game.getAllPlayers();
		for (String name: players.keySet()){
			String key = name.toString();
			ArrayList<String> groups = players.get(key).getGroups();  
			System.out.println(key + " : " + groups.toString());  
		} 
	}

	public static void createPlayer() throws IOException {
		System.out.println("--- Create Player ---");  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		game.addPlayer(username);
		System.out.println("Player " + username + " added!");
	}

	public static void createGroup() throws IOException {
		System.out.println("--- Create Group ---");  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Group Name: ");
		String groupName = sc.nextLine();
		game.addGroup(groupName);
		System.out.println("Group " + groupName + " added!");
	}

	public static void addPlayerToGroup() throws IOException {
		System.out.println("--- add Player To Group ---");  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Group: ");
		String groupName = sc.nextLine();
		System.out.print("Enter Username: ");
		String username = sc.nextLine();
		game.addPlayerToGroup(groupName, username);
		System.out.println("Player " + username + "added to " + groupName + " added!");

	}

	// Needs to connect to current UIController
	public static void playGame() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Group1's Name: ");
		String g1 = sc.nextLine();
		System.out.print("Enter Group2's Name: ");
		String g2 = sc.nextLine();
		
		play = game.play(g1, g2);
		
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

	// This needs to connect with a separate controller and GUI
	public static void playGameConsule() throws IOException{

		System.out.println("****** Welcome to Agile Pursuit ***********");

		while (true){
			System.out.println("\n-----------MENU-----------");
			System.out.println("Start Game............: 0");
			System.out.println("List Groups...........: 1");
			System.out.println("List Players..........: 2");
			System.out.println("Create Player.........: 3");
			System.out.println("Create Groups.........: 4");
			System.out.println("Add Player to Group...: 5");
			System.out.println("--------------------------\n");
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Choice: ");
			int option = sc.nextInt();

			if (option == 0){
				playGame();
			} else if (option == 1){
				listGroups();
			} else if (option == 2) {
				listPlayers();
			} else if (option == 3) {
				createPlayer();
			} else if (option == 4) {
				createGroup();
			} else if (option == 5) {
				addPlayerToGroup();
			} else {
				System.out.println("Invalid input");
			}

		}	
	}

	public static void main(String[] args) {
		try {
			playGameConsule();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("SOMETHING WENT REALLY WRONG");
			e.printStackTrace();
		}
	}

}
