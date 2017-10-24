package player;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

public class PlayerMgr implements Serializable{
		
	private static final long serialVersionUID = 1L;
	private HashMap<String,Player> allPlayers = readFile();
	private static final String PATH = "./src/player/players.ser";
	

	public void addPlayer(Player n){
		String username = n.getUsername();
		Player value = allPlayers.get(username);
		if (value != null) { throw new IllegalArgumentException(username + " is already in the all Players hashmap");}
		allPlayers.put(username, n);
	}
	
	public boolean containsPlayer(String username){
		return allPlayers.containsKey(username);
	}
	
	public Player getPlayer(String username){
		if (allPlayers.containsKey(username)){
			return allPlayers.get(username);
		}else{
			throw new IllegalArgumentException(username + " is not in the all Players hashmap");
		}
	}
	
	public HashMap<String, Player> getAllPlayers() {
		return allPlayers;
	}
	
	public void saveFile() throws IOException {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(PATH))) {
			os.writeObject(allPlayers);
		}
	}
	// TODO: WE NEED TO REMOVE THIS LATER!!!!!!!! 
	public void clear() {
		allPlayers.clear();
	}
	
	public void deletePlayer(int id) {
		allPlayers.remove(id);
	}
	
	@SuppressWarnings("unchecked")
	private HashMap<String, Player> readFile()  {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(PATH))) {
			return (HashMap<String, Player>) is.readObject();
		} catch (FileNotFoundException e) {
			return new HashMap<String,Player>();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public String toString() {
		return allPlayers.toString();
	}
	
}
