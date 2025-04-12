package SimplyRugby;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class Junior.
 *
 * @author Brodie Harkins <br>
 * <p> This will hold information of our junior players at the club </p> <br>
 */



public class Junior extends Player implements Serializable {
	
	private static final long serialVersionUID = -7421889085411731015L;

	/** The j name. */
	//Variables
	private String jName; 
	
	/** The address. */
	private String address; 
	
	/** The postcode. */
	private String postcode; 
	
	/** The sru. */
	private String SRU; 
	
	/** The birth. */
	private Date birth; 
	
	/** The tel. */
	private String tel; 
	
	/** The mobile num. */
	private String mobileNum; 
	
	/** The email. */
	private String email; 
	
	/** The health. */
	private String health;
	
	/** The parent 1. */
	private String parent1; 
	
	/** The parent 2. */
	private String parent2; 
	
	/** The parent 1 number. */
	private String parent1Number; 
	
	/** The parent 1 address. */
	private String parent1Address; 
	
	/** The parent 1 relationship. */
	private String parent1Relationship;
	
	/** The parent 2 number. */
	private String parent2Number; 
	
	/** The parent 2 address. */
	private String parent2Address;  
	
	/** The parent 2 relationship. */
	private String parent2Relationship;
	
	/** The doctor. */
	private String doctor; 
	
	/** The doc address. */
	private String docAddress;
	
	/** The doctor num. */
	private String doctorNum; 	
	
	/** The position. */
	private String position;  

	/**
	 * Instantiates a new junior.
	 *
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
	public Junior (String name, String SRU, String Address, Date birth, String tel, String mobileNum, String postcode, String email, String health, String parent1Relationship, String parent1, 
				   String parent2, String parent1Num, String parent1Address, String parent2Number, String parent2Address, String p2Relationship, String doctor,
				   String docTel, String docAddress, String position) { 
		super(name, Address, postcode, SRU, birth, tel, mobileNum, email, health, 
			      parent1, doctor, docTel, parent1Num, position);
		this.jName = name; 
		this.SRU = SRU; 
		this.address = Address; 
		this.birth = birth; 
		this.tel = tel; 
		this.mobileNum = mobileNum; 
		this.postcode = postcode; 
		this.email = email; 
		this.health = health; 
		this.parent1Relationship = parent1Relationship;
		this.parent1 = parent1; 
		this.parent1Address = parent1Address; 
		this.parent1Number = parent1Num;
		this.parent2 = parent2; 
		this.parent2Address = parent2Address; 
		this.parent2Number = parent2Number;
		this.parent2Relationship = p2Relationship;
		this.doctor = doctor; 
		this.doctorNum = docTel; 
		this.docAddress = docAddress; 
		this.position = position; 
	}
	
	
	/**
	 * Gets the junior name.
	 *
	 * @return the junior name
	 */
	// Getters and setters 
	public String getJuniorName() { 
		return jName; 
	}
	
	/**
	 * Sets the junior name.
	 *
	 * @param juniorName the new junior name
	 */
	public void setJuniorName(String juniorName) { 
		this.jName = juniorName;
	}
	
	/**
	 * Gets the SRU number.
	 *
	 * @return the SRU number
	 */
	public String getSRUNumber() { 
		return SRU;
	}
	
	/**
	 * Sets the junior SRU.
	 *
	 * @param SRU the new junior SRU
	 */
	public void setJuniorSRU(String SRU) { 
		this.SRU = SRU; 
	}
	
	/**
	 * Gets the junior address.
	 *
	 * @return the junior address
	 */
	public String getJuniorAddress( ) { 
		return address; 
	}
	
	/**
	 * Sets the junior address.
	 *
	 * @param address the new junior address
	 */
	public void setJuniorAddress(String address) { 
		this.address = address;
	}
	
	/**
	 * Gets the junior birth.
	 *
	 * @return the junior birth
	 */
	public Date getJuniorBirth() { 
		return birth;
	}
	
	/**
	 * Sets the junior birth.
	 *
	 * @param birth the new junior birth
	 */
	public void setJuniorBirth(Date birth) {
		this.birth = birth;
	}
	
	/**
	 * Gets the junior tel.
	 *
	 * @return the junior tel
	 */
	public String getJuniorTel() { 
		return tel; 
	}
	
	/**
	 * Sets the junior tel.
	 *
	 * @param tel the new junior tel
	 */
	public void setJuniorTel(String tel) { 
		this.tel = tel; 
	}
	
	/**
	 * Gets the mobile num.
	 *
	 * @return the mobile num
	 */
	public String getMobileNum() { 
		return mobileNum; 
	}
	
	/**
	 * Sets the junior mobile.
	 *
	 * @param num the new junior mobile
	 */
	public void setJuniorMobile(String num) { 
		this.mobileNum = num; 
	}
	
	/**
	 * Gets the junior postcode.
	 *
	 * @return the junior postcode
	 */
	public String getJuniorPostcode() { 
		return postcode; 
	}
	
	/**
	 * Sets the junior postcode.
	 *
	 * @param post the new junior postcode
	 */
	public void setJuniorPostcode(String post) { 
		this.postcode = post; 
	}
	
	/**
	 * Gets the junior email.
	 *
	 * @return the junior email
	 */
	public String getJuniorEmail() {
		return email; 
	}
	
	/**
	 * Sets the junior email.
	 *
	 * @param email the new junior email
	 */
	public void setJuniorEmail(String email) { 
		this.email = email; 
	}
	
	/**
	 * Gets the junior health.
	 *
	 * @return the junior health
	 */
	public String getJuniorHealth() { 
		return health; 
	}
	
	/**
	 * Sets the junior health.
	 *
	 * @param h the new junior health
	 */
	public void setJuniorHealth(String h) { 
		this.health = h; 
	}
	
	/**
	 * Gets the parent 1 relationship.
	 *
	 * @return the parent 1 relationship
	 */
	public String getParent1Relationship() { 
		return parent2Relationship; 
	}
	
	/**
	 * Sets the parent 1 relationship.
	 *
	 * @param p1Relationship the new parent 1 relationship
	 */
	public void setParent1Relationship(String p1Relationship) { 
		this.parent1Relationship = p1Relationship;
	}
	
	/**
	 * Gets the junior parent 1.
	 *
	 * @return the junior parent 1
	 */
	public String getJuniorParent1() { 
		return parent1;
	}
	
	/**
	 * Sets the junior parent 1.
	 *
	 * @param parent1 the new junior parent 1
	 */
	public void setJuniorParent1(String parent1) { 
		this.parent1 = parent1; 
	}
	
	/**
	 * Gets the parent 1 address.
	 *
	 * @return the parent 1 address
	 */
	public String getParent1Address() { 
		return parent1Address; 
	}
	
	/**
	 * Sets the parent 1 address.
	 *
	 * @param parentAddress the new parent 1 address
	 */
	public void setParent1Address(String parentAddress) { 
		this.parent1Address = parentAddress; 
	}
	
	/**
	 * Gets the parent 1 number.
	 *
	 * @return the parent 1 number
	 */
	public String getParent1Number() { 
		return parent1Number; 
	}
	
	/**
	 * Sets the parent 1 number.
	 *
	 * @param parent1Number the new parent 1 number
	 */
	public void setParent1Number(String parent1Number) { 
		this.parent1Number = parent1Number; 
	}
	
	/**
	 * Gets the parent 2.
	 *
	 * @return the parent 2
	 */
	public String getParent2() { 
		return parent2;
	}
	
	/**
	 * Sets the parent 2 name.
	 *
	 * @param p2Name the new parent 2 name
	 */
	public void setParent2Name(String p2Name) {
		this.parent2 = p2Name;
	}
	
	/**
	 * Gets the parent 2 address.
	 *
	 * @return the parent 2 address
	 */
	public String getParent2Address() { 
		return parent2Address;
	}
	
	/**
	 * Sets the parent 2 address.
	 *
	 * @param p2Address the new parent 2 address
	 */
	public void setParent2Address(String p2Address) { 
		this.parent2Address = p2Address;
	}
	
	/**
	 * Gets the parent 2 number.
	 *
	 * @return the parent 2 number
	 */
	public String getParent2Number() { 
		return parent2Number;
	}
	
	/**
	 * Sets the parent 2 number.
	 *
	 * @param p2Number the new parent 2 number
	 */
	public void setParent2Number(String p2Number) { 
		this.parent2Number = p2Number; 
	}
	
	/**
	 * Gets the parent 2 relationship.
	 *
	 * @return the parent 2 relationship
	 */
	public String getParent2Relationship() { 
		return parent2Relationship;
	}
	
	/**
	 * Sets the parent 2 relationship.
	 *
	 * @param p2Relationship the new parent 2 relationship
	 */
	public void setParent2Relationship(String p2Relationship) { 
		this.parent2Relationship = p2Relationship;
	}
	
	/**
	 * Gets the doctor.
	 *
	 * @return the doctor
	 */
	public String getDoctor() { 
		return doctor;
	}
	
	/**
	 * Sets the doctor.
	 *
	 * @param doc the new doctor
	 */
	public void setDoctor(String doc) { 
		this.doctor = doc; 
	}
	
	/**
	 * Gets the doc number.
	 *
	 * @return the doc number
	 */
	public String getDocNumber() { 
		return doctorNum; 
	}
	
	/**
	 * Sets the doc num.
	 *
	 * @param docNum the new doc num
	 */
	public void setDocNum(String docNum) { 
		this.doctorNum = docNum; 
	}
	
	/**
	 * Gets the doc address.
	 *
	 * @return the doc address
	 */
	public String getDocAddress() { 
		return docAddress; 
	}
	
	/**
	 * Sets the doc address.
	 *
	 * @param docAdd the new doc address
	 */
	public void setDocAddress(String docAdd) { 
		this.docAddress = docAdd;
	}
	
	/**
	 * Gets the junior position.
	 *
	 * @return the junior position
	 */
	public String getJuniorPosition() { 
		return position; 
	}
	
	/**
	 * Sets the junior position.
	 *
	 * @param position the new junior position
	 */
	public void setJuniorPosition(String position) { 
		this.position = position; 
	}
	
	
	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() { 
		return "Junior Name: " + jName + "\nJunior SRU: " + SRU + "\nJunior Address: " + address + "\nJunior DOB: " +
				birth + "\nJunior Tel: " + tel + "\nJunior Postcode: " + postcode + "\nJunior email: " + email + "\nJunior Health: " + health +
				"\nParent 1 Relationship: " + parent1Relationship + "\nJunior Parent 1: " + parent1 + "\nParent 1 Address: " + parent1Address + "\nParent 1 Number: " + parent1Number + "\nParent 2: " + parent2
				+ "\nParent 2 Address: " + parent2Address + "\nParent 2 Number: " + parent2Number + "\nParent 2 Relationship: " + parent2Relationship + "\nDoctor: " + doctor + "\nDoctor Tel: " + doctorNum + 
				"\nDoctor Address: " + docAddress + "\nPosition: " + position;
	}
}
