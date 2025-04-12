package SimplyRugby;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
// Holds information about our Users within the system 
public class User implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 667244504044576587L;

	/** The name. */
	private String name;
	
	/** The user name. */
	private String userName; 
	
	/** The password. */
	private String password; 
	
	/** The team. */
	private Team team; 
	
	/** The type. */
	private UserType type; 
	
	/**
	 * Instantiates a new user.
	 *
	 * @param name the name
	 * @param userName the user name
	 * @param password the password
	 * @param team the team
	 * @param type the type
	 */
	// Contructor for coach, which contains information about the coach 
	public User (String name, String userName, String password, Team team, UserType type) { 
		this.name = name;
		this.userName = userName; 
		this.password = password;
		this.team = team; 
		this.type = type;
	}
		
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() { 
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param uName the new name
	 */
	public void setName(String uName) { 
		this.name = uName; 
	}
	
	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() { 
		return userName; 
	}
	
	/**
	 * Sets the username.
	 *
	 * @param userName the new username
	 */
	public void setUsername(String userName) { 
		this.userName = userName; 
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() { 
		return password; 
	}
	
	/**
	 * Sets the password.
	 *
	 * @param pWord the new password
	 */
	public void setPassword(String pWord) { 
		this.password = pWord; 
	}
	
	/**
	 * Gets the team.
	 *
	 * @return the team
	 */
	public Team getTeam() { 
		return team; 
	}
	
	/**
	 * Sets the team.
	 *
	 * @param team the new team
	 */
	public void setTeam(Team team) { 
		this.team = team;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public UserType getType() { 
		return type; 
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	public String toString() { 
		return "Username: " + userName + "\nName: " + name + "\nPassword: " + password + "\nTeam: " + team;
	}
}
