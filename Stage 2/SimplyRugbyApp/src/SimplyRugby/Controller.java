package SimplyRugby;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * The Class Controller.
 *
 * @author Brodie Harkins <br>
 * <br> Class Name: <b> Controller </b><br>
 * <br> <b> Description: </b> <br>
 * This class will be our controller class 
 * , this will handle any data being entered into our system, 
 * users loging in and adding new users, coaches and players into our system 
 */
public class Controller implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1902135088060883788L;
	
	/** The my user. */
	static UserManager myUser;
	
	/** The login screen. */
	LoginHome loginScreen; 
	
	/** The my admin screen. */
	AdminHome myAdminScreen;
	
	/** The my coach home. */
	CoachHome myCoachHome;
		
	
	/**
	 * Instantiates a new controller.
	 */
	public Controller() { 	
		myUser = new UserManager();
		loginScreen = new LoginHome(this);
		loginScreen.setVisible(true);
	}
	
	/**
	 * Perform login request.
	 *
	 * @param username the username
	 * @param password the password
	 * @return the boolean
	 */
	// Check if validate login has been successful. If yes display appropriate screen
	public Boolean performLoginRequest(String username, String password) { 
		boolean result = false; 
		
		result = myUser.validateLogin(username, password);		
		if (result) { 
			//ArrayList<User> userList = UserManager.getUserList();
			Iterator<User> uList = UserManager.getUserList().iterator();
			while(uList.hasNext()) {
				User u = uList.next();
				
					if (u.getUserName().equals(username) && u.getPassword().equals(password) && u.getType() == UserType.Coach) { 
						if (u.getTeam() == Team.O18) {
							loginScreen.setVisible(false);					
							myCoachHome = new CoachHome(username, this);
							myCoachHome.setVisible(true);
							myCoachHome.CoachO18.setVisible(true);
							myCoachHome.CoachU18.setVisible(false);
							break;
						} else if (u.getTeam() == Team.U18) { 
							loginScreen.setVisible(false);
							myCoachHome = new CoachHome(username, this);
							myCoachHome.setVisible(true);
							myCoachHome.CoachO18.setVisible(false);
							myCoachHome.CoachU18.setVisible(true);
							break;
						}						
					} else if (u.getUserName().equals(username) && u.getPassword().equals(password) && u.getType() == UserType.Admin) { 
						loginScreen.setVisible(false);
						myAdminScreen = new AdminHome(username, this);
						myAdminScreen.setVisible(true);
						break;
					} 
				}
			} else { 		
				result = false; 
			}
		return result; 
	}
	
	/**
	 * Handle window closed.
	 *
	 * @param windowID the window ID
	 */
	// Handle closing windows given the windowID 
	public void handleWindowClosed(String windowID) {
		if (windowID.equals("CoachHome") || windowID.equals("AdminHome")) { 
			loginScreen = new LoginHome(this);
			loginScreen.setVisible(true);
		} 
	}		
	
	/**
	 * Gets the coach list.
	 *
	 * @return the coach list
	 */
	// Get coach list 
	public ArrayList<User> getCoachList() { 
		ArrayList<User> uList = UserManager.getUserList();	
		ArrayList<User> cList = new ArrayList<User>();
		Iterator<User> coachList = uList.iterator();
		while(coachList.hasNext()) { 
			User u = coachList.next();
			if(u.getType() == UserType.Coach) { 
				cList.add(u);
			}
		}
		
		return cList;
	}
	
	/**
	 * Gets the skill pos list.
	 *
	 * @return the skill pos list
	 */
	// Return skill list
	public String[] getSkillPosList() { 
		
		ArrayList<String> skillList = UserManager.getSkillList();
		String[] list = new String[skillList.size()];
		for (int i = 0; i < skillList.size(); i++) { 
			list[i] = skillList.get(i);
		}
		return list; 
	}
	
	/**
	 * Gets the player list.
	 *
	 * @return the player list
	 */
	// Get list of players
	public ArrayList<Player> getPlayerList() { 		

		return PlayerManager.getPlayerList();
	}
	
/**
 * Gets the junior list.
 *
 * @return the junior list
 */
//	// get Junior players 
	public ArrayList<Junior> getJuniorList() { 
		
		return JuniorManager.getJuniorList();		
	}
		
	/**
	 * Save player details.
	 *
	 * @param p the p
	 * @param playerName the player name
	 * @param playerAddress the player address
	 * @param playerPostcode the player postcode
	 * @param SRUNumber the SRU number
	 * @param DOB the dob
	 * @param playerNum the player num
	 * @param playerMobile the player mobile
	 * @param playerEmail the player email
	 * @param playerHealth the player health
	 * @param playerKin the player kin
	 * @param playerDoctor the player doctor
	 * @param docPhone the doc phone
	 * @param parentPhone the parent phone
	 * @param position the position
	 */
	//Save player details 
	public void savePlayerDetails(Player p, String playerName, String playerAddress, String playerPostcode, String SRUNumber, Date DOB, String playerNum,
			  String playerMobile, String playerEmail, String playerHealth, String playerKin, String playerDoctor, String docPhone,
			  String parentPhone, String position) { 
	
		p.setPlayerName(playerName);
		p.setPlayerAddress(playerAddress);
		p.setPostcode(playerPostcode);
		p.setSRU(SRUNumber);
		p.setPlayerBirth(DOB);
		p.setPlayerPhoneNum(playerNum);
		p.setMobileNum(playerMobile);
		p.setPlayerEmail(playerEmail);
		p.setPlayerHealth(playerHealth);
		p.setPlayerKin(playerKin);
		p.setPlayerDoctor(playerDoctor);
		p.setDoctorNum(docPhone);
		p.setParentNumber(parentPhone);
		p.setPosition(position);
			
		JOptionPane.showMessageDialog(null, "Player details have been saved");
		saveData();
	}
	
	/**
	 * Save junior details.
	 *
	 * @param jName the j name
	 * @param name the name
	 * @param SRU the sru
	 * @param Address the address
	 * @param birth the birth
	 * @param tel the tel
	 * @param mobileNum the mobile num
	 * @param postcode the postcode
	 * @param email the email
	 * @param health the health
	 * @param parent1Relationship the parent 1 relationship
	 * @param parent1 the parent 1
	 * @param parent2 the parent 2
	 * @param parent1Num the parent 1 num
	 * @param parent1Address the parent 1 address
	 * @param parent2Number the parent 2 number
	 * @param parent2Address the parent 2 address
	 * @param p2Relationship the p 2 relationship
	 * @param doctor the doctor
	 * @param docTel the doc tel
	 * @param docAddress the doc address
	 * @param position the position
	 */
	public void saveJuniorDetails(Junior jName, String name, String SRU, String Address, Date birth, String tel, String mobileNum, String postcode, String email, String health, 
			 String parent1Relationship, String parent1, String parent2, String parent1Num, String parent1Address, String parent2Number, String parent2Address,
			 String p2Relationship, String doctor, String docTel, String docAddress, String position) { 
			
				
		jName.setJuniorName(name);
		jName.setJuniorSRU(SRU);
		jName.setJuniorAddress(Address);
		jName.setJuniorBirth(birth);
		jName.setJuniorTel(tel);
		jName.setJuniorMobile(mobileNum);
		jName.setJuniorPostcode(postcode);
		jName.setJuniorEmail(email);
		jName.setJuniorHealth(health);
		jName.setParent1Relationship(parent1Relationship);
		jName.setJuniorParent1(parent1);
		jName.setParent2Name(parent2);
		jName.setParent1Number(parent1Num);
		jName.setParent1Address(parent1Address);
		jName.setParent2Number(parent2Number);
		jName.setParent2Address(parent2Address);
		jName.setParent2Relationship(p2Relationship);
		jName.setDoctor(doctor);
		jName.setDocNum(docTel);
		jName.setDocAddress(docAddress);
		jName.setJuniorPosition(position);	
		
		JOptionPane.showMessageDialog(null, "Junior details have been saved");
		saveData();		
	}
	
	
	
	
	/**
	 * Adds the coach.
	 *
	 * @param userName the user name
	 * @param name the name
	 * @param Password the password
	 * @param team the team
	 * @return the user
	 */
	// Add Coach to the system and the team they have been assigned to 
	public User addCoach(String userName, String name, String Password, Team team) { 
		ArrayList<User> aList = UserManager.getUserList();
		
		User u = new User(name, userName, Password, team, UserType.Coach);
		
		aList.add(u);
		
		saveData();
		return u;
	}
	
	/**
	 * Adds the junior.
	 *
	 * @param jName the j name
	 * @param jSRU the j SRU
	 * @param jAddress the j address
	 * @param jbirth the jbirth
	 * @param jTel the j tel
	 * @param jHomePhone the j home phone
	 * @param jPostcode the j postcode
	 * @param jEmail the j email
	 * @param jHealth the j health
	 * @param jParent1Relationship the j parent 1 relationship
	 * @param jParent1 the j parent 1
	 * @param jParent2 the j parent 2
	 * @param jParent1Num the j parent 1 num
	 * @param jParent1Address the j parent 1 address
	 * @param jParent2Num the j parent 2 num
	 * @param jParent2Address the j parent 2 address
	 * @param jParent2Relationship the j parent 2 relationship
	 * @param jDoc the j doc
	 * @param jDocTel the j doc tel
	 * @param jDocAddress the j doc address
	 * @param jPosition the j position
	 * @return the junior
	 */
	public Junior addJunior(String jName, String jSRU, String jAddress, Date jbirth, String jTel, String jHomePhone, String jPostcode, String jEmail, 
			String jHealth, String jParent1Relationship, String jParent1, String jParent2, String jParent1Num, String jParent1Address, String jParent2Num,
			String jParent2Address, String jParent2Relationship, String jDoc, String jDocTel, String jDocAddress, String jPosition) { 
				
		ArrayList<Junior> jList = JuniorManager.getJuniorList();
		
		Junior j = new Junior(jName, jSRU,  jAddress, jbirth, jTel, jHomePhone, jPostcode, jEmail, 
				jHealth, jParent1Relationship, jParent1, jParent2, jParent1Num,  jParent1Address, jParent2Num,
				 jParent2Address,  jParent2Relationship,  jDoc,  jDocTel,  jDocAddress, jPosition);
		
		jList.add(j);
				
		saveData();
		
		return j;
	}
	
	/**
	 * Adds the admin.
	 *
	 * @param username the username
	 * @param name the name
	 * @param password the password
	 * @return the user
	 */
	// Add admin to system
	public User AddAdmin(String username, String name, String password) { 
		ArrayList<User> aList = UserManager.getUserList();
		User u = new User(name, username, password, null, UserType.Admin);
		
		aList.add(u);
		
		JOptionPane.showMessageDialog(null, "Admin has been added");	
		saveData();
		
		return u;
	} 
	
	/**
	 * Adds the player.
	 *
	 * @param playerName the player name
	 * @param playerAddress the player address
	 * @param playerPostcode the player postcode
	 * @param SRUNumber the SRU number
	 * @param DOB the dob
	 * @param playerNum the player num
	 * @param playerMobile the player mobile
	 * @param playerEmail the player email
	 * @param playerHealth the player health
	 * @param playerKin the player kin
	 * @param playerDoctor the player doctor
	 * @param docPhone the doc phone
	 * @param parentPhone the parent phone
	 * @param position the position
	 * @return the player
	 */
	// Add player to the system. This will be used by Coach
	public Player addPlayer(String playerName, String playerAddress, String playerPostcode, String SRUNumber, Date DOB, String playerNum,
						  String playerMobile, String playerEmail, String playerHealth, String playerKin, String playerDoctor, String docPhone,
						  String parentPhone, String position) { 
		
		// Get player list
		ArrayList<Player> pList = PlayerManager.getPlayerList();
		//Add player to system
		Player p = new Player(playerName, playerAddress, playerPostcode, SRUNumber, DOB, playerNum, playerMobile, playerEmail, playerHealth, playerKin, playerDoctor,
							 docPhone, parentPhone, position);
		
		pList.add(p);		
		
		saveData();		
		
		return p;
	}
	
	/**
	 * Save junior skills.
	 *
	 * @param player the player
	 * @param standLevel the stand level
	 * @param spinLevel the spin level
	 * @param popLevel the pop level
	 * @param passNotes the pass notes
	 * @param tacklingNotes the tackling notes
	 * @param kickingNotes the kicking notes
	 * @param frontLevel the front level
	 * @param rearLevel the rear level
	 * @param sideLevel the side level
	 * @param scrabbleLevel the scrabble level
	 * @param goalLevel the goal level
	 * @param grubberLevel the grubber level
	 * @param puntLevel the punt level
	 * @param dropLevel the drop level
	 */
	// Save players skills 
		public void saveJuniorSkills(Junior player, int standLevel, int spinLevel, int popLevel, String passNotes, String tacklingNotes, String kickingNotes, int frontLevel, 
				int rearLevel, int sideLevel, int scrabbleLevel, int goalLevel, int grubberLevel, int puntLevel, int dropLevel)  { 
			
			ArrayList<SkillCatagory> catList = player.getSkillCatList();	 		
			
			boolean isEmpty = catList.isEmpty(); 
			
			System.out.println(player.getSkillCatList().toString());	
			
			
			SkillCatagory pCat = new SkillCatagory(); // Create new Catagory	
			if (isEmpty == true) { 			
				//Add Skill 'spin', 'Pop' & 'Standard' to list				
				pCat.setCatagoryName("Passing");
				pCat.setSkillNotes(passNotes);
				Skill pStan = new Skill("Standard", standLevel);
				pStan.setSkillRating(standLevel);
				pCat.addSkills(pStan);					 
				Skill spin = new Skill("Spin", spinLevel);
				spin.setSkillRating(spinLevel);
				pCat.addSkills(spin);
				Skill pop = new Skill("Pop", popLevel);
				pop.setSkillRating(popLevel);
				pCat.addSkills(pop);			
				player.addSkillCat(pCat);
						
				System.out.println("Skill Catagory: " + pCat.getCatagoryName() + " has been added");				
				// Create new SkillCatagory
				SkillCatagory tacklingCat = new SkillCatagory();
				tacklingCat.setCatagoryName("Tackling");
				tacklingCat.setSkillNotes(tacklingNotes);
				Skill tFront = new Skill("Front", frontLevel);
				tacklingCat.addSkills(tFront);
				Skill tRear = new Skill("Rear", rearLevel);
				tacklingCat.addSkills(tRear);
				Skill tSide = new Skill("Side", sideLevel);
				tacklingCat.addSkills(tSide);
				Skill tScrabble = new Skill("Scrabble", scrabbleLevel);
				tacklingCat.addSkills(tScrabble);	
				player.addSkillCat(tacklingCat);
				
				System.out.println("Skill Catagory: " + tacklingCat.getCatagoryName() + " has been added");
				
				SkillCatagory kCat = new SkillCatagory();
				kCat.setCatagoryName("Kicking");
				kCat.setSkillNotes(kickingNotes);
				Skill kDrop = new Skill("Drop", dropLevel);
				kCat.addSkills(kDrop);
				Skill kPunt = new Skill("Punt", puntLevel);
				kCat.addSkills(kPunt);
				Skill kGrubber = new Skill("Grubber", grubberLevel);
				kCat.addSkills(kGrubber);
				Skill kGoal = new Skill("Goal", goalLevel);
				kCat.addSkills(kGoal);
				player.addSkillCat(kCat);
				
				System.out.println("Skill Catagory: " + kCat.getCatagoryName() + " has been added");
				//JOptionPane.showMessageDialog(null, "Player skills have been updated");			
											
			} else { // Update all Skills		
				for (SkillCatagory s : catList) {				
					//System.out.println(p);
					s.updateSkill("Standard", standLevel);		
					//System.out.println("\nCURRENT STANDLEVEL: " + standLevel);
					s.updateSkill("Spin", spinLevel);
					//System.out.println("\nCURRENT SPINLEVEL: " + spinLevel);
					s.updateSkill("Pop", popLevel);	
					//System.out.println("\nCURRENT POPLEVEL: " + popLevel);
					s.updateSkill("Front", frontLevel); 
					//System.out.println("\nCURRENT FRONTLEVEL: " + frontLevel);
					s.updateSkill("Rear", rearLevel);
					//System.out.println("\nCURRENT REARLEVEL: " + rearLevel);
					s.updateSkill("Side", sideLevel);
					//System.out.println("\nCURRENT SLIDELEVEL: " + sideLevel);
					s.updateSkill("Scrabble", scrabbleLevel);
					//System.out.println("\nCURRENT SCRABBLELEVEL: " + scrabbleLevel);
					s.updateSkill("Drop", dropLevel);
					//System.out.println("\nCURRENT DROPLEVEL: " + dropLevel);
					s.updateSkill("Punt", puntLevel);
					//System.out.println("\nCURRENT PUNTLEVEL: " + puntLevel);
					s.updateSkill("Grubber", grubberLevel);
					//System.out.println("\nCURRENT GRUBBERLEVEL: " + grubberLevel);
					s.updateSkill("Goal", goalLevel);					
					//System.out.println("\nCURRENT GOALLEVEL: " + goalLevel);			
				}							
				player.updateNotes("Passing", passNotes);
				player.updateNotes("Tackling", tacklingNotes);
				player.updateNotes("Kicking", kickingNotes);			

			}
		
		}


	/**
	 * Save player skills.
	 *
	 * @param player the player
	 * @param standLevel the stand level
	 * @param spinLevel the spin level
	 * @param popLevel the pop level
	 * @param passNotes the pass notes
	 * @param tacklingNotes the tackling notes
	 * @param kickingNotes the kicking notes
	 * @param frontLevel the front level
	 * @param rearLevel the rear level
	 * @param sideLevel the side level
	 * @param scrabbleLevel the scrabble level
	 * @param goalLevel the goal level
	 * @param grubberLevel the grubber level
	 * @param puntLevel the punt level
	 * @param dropLevel the drop level
	 */
	
	
	// Save players skills 
	public void savePlayerSkills(Player player, int standLevel, int spinLevel, int popLevel, String passNotes, String tacklingNotes, String kickingNotes, int frontLevel, 
			int rearLevel, int sideLevel, int scrabbleLevel, int goalLevel, int grubberLevel, int puntLevel, int dropLevel)  { 
		
		ArrayList<SkillCatagory> catList = player.getSkillCatList();		
		
		boolean isEmpty = catList.isEmpty(); 
		
		System.out.println(player.getSkillCatList().toString());		
		
		
		SkillCatagory pCat = new SkillCatagory(); // Create new Catagory	
		if (isEmpty == true) { 			
			//Add Skill 'spin', 'Pop' & 'Standard' to list				
			pCat.setCatagoryName("Passing");
			pCat.setSkillNotes(passNotes);
			Skill pStan = new Skill("Standard", standLevel);
			pStan.setSkillRating(standLevel);
			pCat.addSkills(pStan);					 
			Skill spin = new Skill("Spin", spinLevel);
			spin.setSkillRating(spinLevel);
			pCat.addSkills(spin);
			Skill pop = new Skill("Pop", popLevel);
			pop.setSkillRating(popLevel);
			pCat.addSkills(pop);			
			player.addSkillCat(pCat);
					
			System.out.println("Skill Catagory: " + pCat.getCatagoryName() + " has been added");			
				
			SkillCatagory tacklingCat = new SkillCatagory();
			tacklingCat.setCatagoryName("Tackling");
			tacklingCat.setSkillNotes(tacklingNotes);
			Skill tFront = new Skill("Front", frontLevel);
			tacklingCat.addSkills(tFront);
			Skill tRear = new Skill("Rear", rearLevel);
			tacklingCat.addSkills(tRear);
			Skill tSide = new Skill("Side", sideLevel);
			tacklingCat.addSkills(tSide);
			Skill tScrabble = new Skill("Scrabble", scrabbleLevel);
			tacklingCat.addSkills(tScrabble);	
			player.addSkillCat(tacklingCat);
			
			System.out.println("Skill Catagory: " + tacklingCat.getCatagoryName() + " has been added");
			
			SkillCatagory kCat = new SkillCatagory();
			kCat.setCatagoryName("Kicking");
			kCat.setSkillNotes(kickingNotes);
			Skill kDrop = new Skill("Drop", dropLevel);
			kCat.addSkills(kDrop);
			Skill kPunt = new Skill("Punt", puntLevel);
			kCat.addSkills(kPunt);
			Skill kGrubber = new Skill("Grubber", grubberLevel);
			kCat.addSkills(kGrubber);
			Skill kGoal = new Skill("Goal", goalLevel);
			kCat.addSkills(kGoal);
			player.addSkillCat(kCat);
			
			System.out.println("Skill Catagory: " + kCat.getCatagoryName() + " has been added");
			JOptionPane.showMessageDialog(null, "Player skills have been updated");				
										
		} else { // Update all Skills		
			for (SkillCatagory s : catList) {				
				//System.out.println(p);
				s.updateSkill("Standard", standLevel);		
				//System.out.println("\nCURRENT STANDLEVEL: " + standLevel);
				s.updateSkill("Spin", spinLevel);
				//System.out.println("\nCURRENT SPINLEVEL: " + spinLevel);
				s.updateSkill("Pop", popLevel);	
				//System.out.println("\nCURRENT POPLEVEL: " + popLevel);
				s.updateSkill("Front", frontLevel); 
				//System.out.println("\nCURRENT FRONTLEVEL: " + frontLevel);
				s.updateSkill("Rear", rearLevel);
				//System.out.println("\nCURRENT REARLEVEL: " + rearLevel);
				s.updateSkill("Side", sideLevel);
				//System.out.println("\nCURRENT SLIDELEVEL: " + sideLevel);
				s.updateSkill("Scrabble", scrabbleLevel);
				//System.out.println("\nCURRENT SCRABBLELEVEL: " + scrabbleLevel);
				s.updateSkill("Drop", dropLevel);
				//System.out.println("\nCURRENT DROPLEVEL: " + dropLevel);
				s.updateSkill("Punt", puntLevel);
				//System.out.println("\nCURRENT PUNTLEVEL: " + puntLevel);
				s.updateSkill("Grubber", grubberLevel);
				//System.out.println("\nCURRENT GRUBBERLEVEL: " + grubberLevel);
				s.updateSkill("Goal", goalLevel);					
				//System.out.println("\nCURRENT GOALLEVEL: " + goalLevel);						
			}							
			player.updateNotes("Passing", passNotes);
			player.updateNotes("Tackling", tacklingNotes);
			player.updateNotes("Kicking", kickingNotes);	
			
		}
	
	}

	
	/**
	 * Save data.
	 */
	public void saveData() { 
		PlayerManager.serializePlayers();
		UserManager.serialize();
		JuniorManager.serializeJuniors();
	}
	
	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public void getData() { 
		PlayerManager.deserializePlayers();
		UserManager.deserialize();
		JuniorManager.deserializeJuniors();
	}
	
}
