package group;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import player.Player;


public class GroupMgr implements Serializable{

	private static final long serialVersionUID = 1L;
	private HashMap<String,Group> allGroups = readFile();
	private static final String PATH = "./src/group/groups.ser";
	
	
	public void addGroup(Group n){
		String name = n.getGroupName();
		Group value = allGroups.get(name);
		if(value != null) { throw new IllegalArgumentException(name + " is already in the Group hashmap");}
		allGroups.put(name, n);
	}
	
	public boolean containsGroup(String id) {
		return allGroups.containsKey(id);
	}
	
	public Group getGroup(String id){
		if (allGroups.containsKey(id)){
			return allGroups.get(id);
		} else {
			throw new IllegalArgumentException(id + " is already in the Group hashmap");
		}
	}
	
	public HashMap<String, Group> getAllGroups() {
		return allGroups;
	}
	
	public void saveFile() throws IOException {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(PATH))) {
			os.writeObject(allGroups);
		}
	}
	
	public void deleteGroup(String id) {
		allGroups.remove(id);
	}
	
	@SuppressWarnings("unchecked")
	private HashMap<String, Group> readFile()  {
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(PATH))) {return (HashMap<String, Group>) is.readObject();} 
		catch (FileNotFoundException e) {return new HashMap<String, Group>();} 
		catch (IOException e) {e.printStackTrace();} 
		catch (ClassNotFoundException e) {e.printStackTrace();}
		return null;
	}
	
	@Override
	public String toString() {
		return allGroups.toString();
	}

	public void addPlayer(String p, String groupname) {
		allGroups.get(groupname).addPlayer(p);
	}
}

