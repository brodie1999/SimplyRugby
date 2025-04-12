package SimplyRugby;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * The Class Player.
 */
// Holds all information about a player in the system 
public class Player implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7421889085411731015L;


	/** The name. */
	private String name; 
	
	/** The address. */
	private String address; 
	
	/** The postcode. */
	private String postcode; 
	
	/** The sru. */
	private String SRU; 
	
	/** The birth. */
	private Date birth; 
	
	/** The phone num. */
	private String phoneNum; 
	
	/** The mobile num. */
	private String mobileNum; 
	
	/** The email. */
	private String email; 
	
	/** The health. */
	private String health; 
	
	/** The kin. */
	private String kin; 
	
	/** The doctor. */
	private String doctor; 
	
	/** The doctor num. */
	private String doctorNum; 
	
	/** The parent num. */
	private String parentNum; 
	
	/** The position. */
	private String position; 
		
	/** The skill cat. */
	private ArrayList<SkillCatagory> skillCat = new ArrayList<SkillCatagory>();	
 
	/**
	 * Instantiates a new player.
	 *
	 * @param name the name
	 * @param address the address
	 * @param postcode the postcode
	 * @param SRU the sru
	 * @param birth the birth
	 * @param phoneNum the phone num
	 * @param mobileNum the mobile num
	 * @param email the email
	 * @param health the health
	 * @param kin the kin
	 * @param doc the doc
	 * @param doctorNum the doctor num
	 * @param parentNum the parent num
	 * @param position the position
	 */
	// Player class contructor 
	public Player(String name, String address, String postcode, String SRU, Date birth, String phoneNum, String mobileNum, String email, String health, 
			      String kin, String doc, String doctorNum, String parentNum, String position) { 
		
		this.name = name; 
		this.address = address; 
		this.postcode = postcode; 
		this.SRU = SRU; 
		this.birth = birth; 
		this.phoneNum = phoneNum; 
		this.mobileNum = mobileNum; 
		this.email = email; 
		this.health = health; 
		this.kin = kin; 
		this.doctor = doc; 
		this.doctorNum = doctorNum; 
		this.parentNum = parentNum; 
		this.position = position; 
	}
	
	/**
	 * Gets the player name.
	 *
	 * @return the player name
	 */
	//Getter and setters for Player class 
	public String getPlayerName() { 
		return name; 
	}
	
	/**
	 * Sets the player name.
	 *
	 * @param PlayerName the new player name
	 */
	public void setPlayerName(String PlayerName) { 
		this.name = PlayerName;
	}
	
	/**
	 * Gets the player address.
	 *
	 * @return the player address
	 */
	public String getPlayerAddress() { 
		return address; 
	}
	
	/**
	 * Sets the player address.
	 *
	 * @param Address the new player address
	 */
	public void setPlayerAddress(String Address) { 
		this.address = Address;
	}
	
	/**
	 * Gets the post code.
	 *
	 * @return the post code
	 */
	public String getPostCode() { 
		return postcode; 
	}
	
	/**
	 * Sets the postcode.
	 *
	 * @param Postcode the new postcode
	 */
	public void setPostcode(String Postcode) { 
		this.postcode = Postcode;
	}
	
	/**
	 * Gets the sru.
	 *
	 * @return the sru
	 */
	public String getSRU() { 
		return SRU;
	}
	
	/**
	 * Sets the sru.
	 *
	 * @param SRU the new sru
	 */
	public void setSRU(String SRU) { 
		this.SRU = SRU; 
	}
	
	/**
	 * Gets the player birth.
	 *
	 * @return the player birth
	 */
	public Date getPlayerBirth() { 
		return birth; 
	}
	
	/**
	 * Sets the player birth.
	 *
	 * @param birth the new player birth
	 */
	public void setPlayerBirth(Date birth) { 
		this.birth = birth; 
	}
	
	/**
	 * Gets the player phone num.
	 *
	 * @return the player phone num
	 */
	public String getPlayerPhoneNum() { 
		return phoneNum; 
	}
	
	/**
	 * Sets the player phone num.
	 *
	 * @param phoneNumber the new player phone num
	 */
	public void setPlayerPhoneNum(String phoneNumber) { 
		this.phoneNum = phoneNumber; 
	}
	
	/**
	 * Gets the mobile number.
	 *
	 * @return the mobile number
	 */
	public String getMobileNumber() { 
		return mobileNum; 
	}
	
	/**
	 * Sets the mobile num.
	 *
	 * @param mobileNumber the new mobile num
	 */
	public void setMobileNum(String mobileNumber) {
		this.mobileNum = mobileNumber; 
	}
	
	/**
	 * Gets the player email.
	 *
	 * @return the player email
	 */
	public String getPlayerEmail() { 
		return email; 
	}
	
	/**
	 * Sets the player email.
	 *
	 * @param playerEmail the new player email
	 */
	public void setPlayerEmail(String playerEmail) { 
		this.email = playerEmail; 
	}
	
	/**
	 * Gets the player health.
	 *
	 * @return the player health
	 */
	public String getPlayerHealth() { 
		return health; 
	}
	
	/**
	 * Sets the player health.
	 *
	 * @param playerHealth the new player health
	 */
	public void setPlayerHealth(String playerHealth) { 
		this.health = playerHealth; 
	}
	
	/**
	 * Gets the player kin.
	 *
	 * @return the player kin
	 */
	public String getPlayerKin() { 
		return kin; 
	}
	
	/**
	 * Sets the player kin.
	 *
	 * @param playerKin the new player kin
	 */
	public void setPlayerKin(String playerKin) { 
		this.kin = playerKin; 
	}
	
	/**
	 * Gets the player doctor.
	 *
	 * @return the player doctor
	 */
	public String getPlayerDoctor() { 
		return doctor; 
	}
	
	/**
	 * Sets the player doctor.
	 *
	 * @param playerDoc the new player doctor
	 */
	public void setPlayerDoctor(String playerDoc) { 
		this.doctor = playerDoc;
	}
	
	/**
	 * Gets the doc num.
	 *
	 * @return the doc num
	 */
	public String getDocNum() { 
		return doctorNum;
	}
	
	/**
	 * Sets the doctor num.
	 *
	 * @param docNumber the new doctor num
	 */
	public void setDoctorNum(String docNumber) { 
		this.doctorNum = docNumber;
	}
	
	/**
	 * Gets the parent number.
	 *
	 * @return the parent number
	 */
	public String getParentNumber() { 
		return parentNum; 
	}
	
	/**
	 * Sets the parent number.
	 *
	 * @param parentNumber the new parent number
	 */
	public void setParentNumber(String parentNumber) { 
		this.parentNum = parentNumber; 
	}
	
	/**
	 * Gets the position.
	 *
	 * @return the position
	 */
	public String getPosition() { 
		return position; 
	}
	
	/**
	 * Sets the position.
	 *
	 * @param skillPos the new position
	 */
	public void setPosition(String skillPos) { 
		this.position = skillPos;
	} 
	
	/**
	 * Gets the skill cat list.
	 *
	 * @return the skill cat list
	 */
	public ArrayList<SkillCatagory> getSkillCatList() {		
		return skillCat;
	}	
	
	/**
	 * Adds the skill cat.
	 *
	 * @param skillCatName the skill cat name
	 */
	public void addSkillCat(SkillCatagory skillCatName) { 
		skillCat.add(skillCatName);
	}	
	
	/**
	 * Gets the skill value.
	 *
	 * @param catName the cat name
	 * @param skillName the skill name
	 * @return the skill value
	 */
	public int getSkillValue(String catName, String skillName) { 
		//int rating = 0;
			for (SkillCatagory skill : skillCat) { 
				//System.out.println("\nSKILL NAME: " + skillName + "\nSKILL VALUE: " + skill.getSkillRating(skillName));
				if (catName.equals(skill.getCatagoryName()) && skillName.equals(skill.getSkillName(skillName))) {
					//System.out.println("\nGETTING SKILL RATING: " + skill.getSkillRating(skillName));
					return skill.getSkillRating(skillName);							
				}
			}			
		return 0;		
	}

	/**
	 * Update notes.
	 *
	 * @param notesName the notes name
	 * @param notes the notes
	 */
	public void updateNotes(String notesName, String notes) { 
		for (SkillCatagory note : skillCat) { 
			if (notesName.toString().contains(note.getCatagoryName().toString())) { 
				note.setSkillNotes(notes);				
			}
		}
	}
		
	/**
	 * Gets the skill notes.
	 *
	 * @param name the name
	 * @return the skill notes
	 */
	public String getSkillNotes(String name) { 		
		
		for (SkillCatagory i : skillCat) { 
			if (name.toString().contains(i.getCatagoryName().toString())) { 
				return i.getNotes();
			}
		}
			
		return null; 
	}
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	//@Override
	public String toString() { 
		return "Name: " + name + "\nAddress: " + address + "\nPostCode: " + postcode + "\nSRU: " + SRU + "\nD.O.B: " + birth + "\nPhone Number: " + phoneNum +
				"\nMobile Number: " + mobileNum + "\nEmail: " + email + "\nHealth: " + health + "\nKin: " + kin + "\nDoctor: " + doctor + "\nDoctor No: " + doctorNum
				+ "\nParent Number: " + parentNum + "\nPosition: " + position;
	}
}
