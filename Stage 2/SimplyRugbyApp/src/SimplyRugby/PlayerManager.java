package SimplyRugby;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * The Class PlayerManager.
 */
// Holds data about our players 
public class PlayerManager implements Serializable {

	 
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The player list. */
	// Create an arrayList of our players 
	public static ArrayList<Player> playerList = new ArrayList<Player>(); 	
	/**
	 * Gets the player list.
	 *
	 * @return the player list
	 */
	public static ArrayList<Player> getPlayerList() { 
		return playerList;
	}
	
	
	/**
	 * Serialize players.
	 */
	// Serliaze player list
	public static void serializePlayers() { 
		try { 
			FileOutputStream fos = new FileOutputStream("player.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(PlayerManager.playerList);
			System.out.println("Updating players...");
			oos.close();
			fos.close();
		} catch (IOException e) { 
			System.out.println("Error! player Object Can't be written to file");
			
			return; 
		}
	}
	
	/**
	 * Deserialize players.
	 */
	@SuppressWarnings("unchecked")
	public static void deserializePlayers() { 
		try {						
			FileInputStream fis = new FileInputStream("player.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			PlayerManager.playerList = (ArrayList<Player>) ois.readObject();
			System.out.println("Getting Player data...");
			ois.close();
			fis.close();		
		} catch (FileNotFoundException e) {
			System.out.println("Error! File not found");
			return;
		} catch (IOException e) {			
			System.out.println("Error! Object can't be written to file");
			//e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("Error! - class not found");
			return; 
		} catch (ClassCastException e) { 
			System.out.println("Error! - Cast type unavailable");
			e.printStackTrace();
			return; 
		}		
	}
}
