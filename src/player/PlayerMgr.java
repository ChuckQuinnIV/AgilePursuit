package player;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;





public class PlayerMgr implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HashMap<Integer,Player> allPlayers = new HashMap<Integer,Player>();
	
	private static final String PATH = "./src/player/players.ser";
	
	@Override
	public String toString() {
		return allPlayers.toString();
	}

	public void addPlayer(Player n){
		int id = n.getId();
		Player value = allPlayers.get(id);
		if (value != null) { throw new IllegalArgumentException(id + " is already in the all Players hashmap");}
		allPlayers.put(n.getId(), n);
	}
	
	public void setHash(HashMap<Integer, Player> hash) {
		allPlayers = hash;
	}
	
	
	public HashMap<Integer, Player> getHash() {
		return allPlayers;
	}
	
	public void saveFile () throws IOException {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(PATH))) {
			os.writeObject(allPlayers);
		}
	}
	
	public HashMap<Integer, Player> readFile() throws ClassNotFoundException, IOException {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(PATH))) {
			return (HashMap<Integer, Player>) is.readObject();
		}
	}
}
