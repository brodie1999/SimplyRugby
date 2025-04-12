package SimplyRugby;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

//Acts as a model class which will hold data on arraylists 
/**
 * The Class UserManager.
 *
 * @author Brodie Harkins <br>
 * <br> Class Name: <b> UserManager </b><br>
 * <b> Descripton: </b> <br>
 * This class will handle our user data. this class will contain <br>
 * our user list and skill list
 */
public class UserManager  {	
	
	/** The user list. */
	// Allows for both Admin and coach array to be accessed outwith this class
	private static ArrayList<User> userList = new ArrayList<User>();	
	
	/** The skill pos. */
	public static ArrayList<String> skillPos = new ArrayList<String>();
	
	/** The team list. */
	public static ArrayList<Team> teamList = new ArrayList<Team>();
	
	
	/**
	 * Instantiates a new user manager.
	 */
	public UserManager() { 
		createUser();
		skillPos();
		teamList();
	}		
	
	/**
	 * Skill pos.
	 */
	private void skillPos() { 
		skillPos.add("Full Back");
		skillPos.add("Wing");
		skillPos.add("Centre");
		skillPos.add("Fly Half");
		skillPos.add("Scrum half");
		skillPos.add("Hooker"); 
		skillPos.add("Prop");
		skillPos.add("2nd row");
		skillPos.add("Back row");
	}
	
	/**
	 * Team list.
	 */
	private void teamList() {
		teamList.add(Team.O18);
		teamList.add(Team.U18);
	}
	
	/**
	 * Gets the skill list.
	 *
	 * @return the skill list
	 */
	public static ArrayList<String> getSkillList() { 
		return skillPos; 
	}
	
	/**
	 * Creates the user.
	 */
	private void createUser() { 
		// Create new Users 
		userList.add(new User("David Oleg", "Dav", "1", Team.O18, UserType.Coach));
		userList.add(new User("Admin", "Admin", "1", null, UserType.Admin));				
	}
	
	/**
	 * Validate login.
	 *
	 * @param username the username
	 * @param password the password
	 * @return true, if successful
	 */
	public boolean validateLogin(String username, String password) { 
		
		boolean result = false;  
		
		Iterator<User> user = userList.iterator();
		while(user.hasNext()) { 
			User users = user.next();
			if (users.getUserName().equals(username) && users.getPassword().equals(password)) { 
				result = true; 				
			}
		}		
		return result; 
	}
	
	/**
	 * Gets the user list.
	 *
	 * @return the user list
	 */
	public static ArrayList<User> getUserList() {	
			return userList;			
		}	
	
	/**
	 * Gets the team list.
	 *
	 * @return the team list
	 */
	public static ArrayList<Team> getTeamList() { 
		return teamList; 
	}
	
	
	/**
	 * Serialize.
	 */
	// Serialize Map
	public static void serialize() { 
		
		try {
			FileOutputStream fos = new FileOutputStream("user.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);			
			oos.writeObject(UserManager.userList);
			System.out.println("Updating Users...");			
			oos.close();
			fos.close();
			//System.out.println(UserManager.getUserList());		
		} catch (IOException e) {			
			System.out.println("Error! Object can't be written to file");
			return;
		}
	}
	
	/**
	 * Deserialize.
	 */
	// De-serialize Map
	@SuppressWarnings("unchecked")
	public static void deserialize() { 
		
		try {						
			FileInputStream fis = new FileInputStream("user.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			UserManager.userList = (ArrayList<User>) ois.readObject();
			System.out.println("Getting User data...");
			ois.close();
			fis.close();
			//System.out.println(UserManager.getUserList());
		
		} catch (FileNotFoundException e) {
			System.out.println("Error! File not found");
			return;
		} catch (IOException e) {			
			System.out.println("Error! Object can't be written to file");
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			System.out.println("Error! - class not found");
			return; 
		} catch (ClassCastException e) { 
			System.out.println("Error! - Cast type unavailable");
			return; 
		}		
	}

}
