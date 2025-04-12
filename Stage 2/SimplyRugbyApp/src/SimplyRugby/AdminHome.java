package SimplyRugby;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;



import javax.swing.JEditorPane;
import javax.swing.border.EtchedBorder;

import javax.swing.JTextPane;

import com.toedter.calendar.JDateChooser;

/**
 * The Class AdminHome.
 *
 * @author Brodie Harkins
 * This will implement the GUI 
 * which will be used by the user to 
 * interact with the system
 */

public class AdminHome extends JFrame implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1625492612714766043L;
	
	/** The my controller. */
	private Controller myController;	 

	/** The my user. */
	static UserManager myUser;
	
	/** The team. */
	private Team team; 
	
	/** The add admin BTN. */
	private JButton addAdminBTN;
	
	/** The add coach BTN. */
	private JButton addCoachBTN;
	
	/** The add player BTN. */
	private JButton addPlayerBTN;
	
	/** The view all players BTN. */
	private JButton viewAllPlayersBTN;
	
	/** The view all coaches BTN. */
	private JButton viewAllCoachesBTN;
	
	/** The add junior. */
	private JButton addJunior;
	
	/** The view coach details. */
	private JButton viewCoachDetails;
	
	/** The delete coach. */
	private JButton deleteCoach;
	
	/** The btn view all junior. */
	private JButton btnViewAllJunior;

	/** The view all players. */
	private JPanel viewAllPlayers;
	
	/** The Add player panel. */
	private JPanel AddPlayerPanel;
	
	/** The Add coach panel. */
	private JPanel AddCoachPanel; 
	
	/** The View all coaches. */
	private JPanel ViewAllCoaches; 
	
	/** The Add admin panel. */
	private JPanel AddAdminPanel; 
	
	/** The view all juniors. */
	private JPanel viewAllJuniors;
	
	/** The player details. */
	private JPanel playerDetails;
	
	/** The add junior panel. */
	private JPanel addJuniorPanel;
	
	/** The edit player. */
	private JPanel editPlayer; 
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The view junior panel. */
	private JPanel viewJuniorPanel;
	
	/** The edit junior. */
	private JPanel editJunior;
	
	/** The skill position 1. */
	private JComboBox<Object> skillPosition_1; 
	
	/** The cmb team. */
	private JComboBox<Object> cmbTeam;
	
	/** The e player health. */
	private JEditorPane ePlayerHealth;
	
	/** The player health. */
	private JEditorPane playerHealth;
	
	/** The player list. */
	private JList<Player> playerList;
	
	/** The coach list. */
	private JList<User> coachList; 
	
	/** The Junior player list. */
	private JList<Junior> JuniorPlayerList;
		
	/** The j list. */
	private DefaultListModel<Junior> jList;
	
	/** The coach detail pane. */
	private JTextPane coachDetailPane;
	
	/** The lbl new label 1. */
	private JLabel lblNewLabel_1;
	
	/** The junior name. */
	private JTextField juniorName;
	
	/** The Junior SRU. */
	private JTextField JuniorSRU;
	
	/** The junior address. */
	private JTextField juniorAddress;
	
	/** The mobile num. */
	private JTextField mobileNum;
	
	/** The home phone. */
	private JTextField homePhone;
	
	/** The junior email. */
	private JTextField juniorEmail;
	
	/** The Post code. */
	private JTextField PostCode;
	
	/** The parent 1. */
	private JTextField parent1;
	
	/** The parent relationship. */
	private JTextField parentRelationship;
	
	/** The parent 1 address. */
	private JTextField parent1Address;
	
	/** The parent 1 tel. */
	private JTextField parent1Tel;
	
	/** The parent 2 name. */
	private JTextField parent2Name;
	
	/** The parent 2 relationship. */
	private JTextField parent2Relationship;
	
	/** The parent 2 address. */
	private JTextField parent2Address;
	
	/** The parent 2 tel. */
	private JTextField parent2Tel;
	
	/** The doctor name. */
	private JTextField doctorName;
	
	/** The doc address. */
	private JTextField docAddress;
	
	/** The doc tel. */
	private JTextField docTel;
	
	/** The e name. */
	private JTextField eName;
	
	/** The e address. */
	private JTextField eAddress;
	
	/** The e postcode. */
	private JTextField ePostcode;
	
	/** The e SRU. */
	private JTextField eSRU;
	
	/** The e phone. */
	private JTextField ePhone;
	
	/** The e mobile. */
	private JTextField eMobile;
	
	/** The e email. */
	private JTextField eEmail;
	
	/** The e kin. */
	private JTextField eKin;
	
	/** The e doctor. */
	private JTextField eDoctor;
	
	/** The e doc num. */
	private JTextField eDocNum;
	
	/** The e parent num. */
	private JTextField eParentNum;
	
	/** The player name. */
	private JTextField playerName;
	
	/** The Player address. */
	private JTextField PlayerAddress;
	
	/** The player postcode. */
	private JTextField playerPostcode;
	
	/** The SRU number. */
	private JTextField SRUNumber;
	
	/** The player num. */
	private JTextField playerNum;
	
	/** The player mobile. */
	private JTextField playerMobile;
	
	/** The player email. */
	private JTextField playerEmail;
	
	/** The player kin. */
	private JTextField playerKin;
	
	/** The player doctor. */
	private JTextField playerDoctor;
	
	/** The doc phone. */
	private JTextField docPhone;
	
	/** The parent phone. */
	private JTextField parentPhone;
	
	/** The Admin name. */
	private JTextField AdminName;
	
	/** The Admin user name. */
	private JTextField AdminUserName;
	
	/** The Admin password. */
	private JTextField AdminPassword;
	
	/** The coach name. */
	private JTextField coachName;
	
	/** The coach username. */
	private JTextField coachUsername;
	
	/** The coach password. */
	private JTextField coachPassword;
	
	/** The selected player. */
	private Player p;
	
	/** The j name. */
	private String jName; 
	
	/** The j SRU. */
	private String jSRU; 
	
	/** The j address. */
	private String jAddress; 
	
	/** The j mobile. */
	private String jMobile;
	
	/** The j home phone. */
	private String jHomePhone; 
	
	/** The j health. */
	private String jHealth; 
	
	/** The j email. */
	private String jEmail; 
	
	/** The j postcode. */
	private String jPostcode; 
	
	/** The j parent 1. */
	private String jParent1; 
	
	/** The j parent 1 relationship. */
	private String jParent1Relationship;
	
	/** The j parent 1 address. */
	private String jParent1Address; 
	
	/** The j parent 1 tel. */
	private String jParent1Tel; 
	
	/** The j parent 2 name. */
	private String jParent2Name; 
	
	/** The j parent 2 relationship. */
	private String jParent2Relationship; 
	
	/** The j parent 2 address. */
	private String jParent2Address; 
	
	/** The j parent 2 tel. */
	private String jParent2Tel; 
	
	/** The j doc. */
	private String jDoc; 
	
	/** The j doc address. */
	private String jDocAddress; 
	
	/** The j doc tel. */
	private String jDocTel; 
	
	/** The j position. */
	private String jPosition;
	
	/** The selected junior. */
	private Junior j;
	
	/** The s skill. */
	private String sSkill;
	
	/** The name. */
	private String name; 
	
	/** The player address. */
	private String playerAddress; 
	
	/** The postcode. */
	private String postcode; 
	
	/** The sru. */
	private String SRU; 
	
	/** The birth. */
	private Date birth; 
	
	/** The phone number. */
	private String phoneNumber; 
	
	/** The mobile number. */
	private String mobileNumber; 
	
	/** The email. */
	private String email; 
	
	/** The kin. */
	private String kin; 
	
	/** The doctor. */
	private String doctor; 
	
	/** The doctor num. */
	private String doctorNum; 
	
	/** The parent number. */
	private String parentNumber;
	
	/** The health. */
	private String health; 
	
	/** The skill pos. */
	private String skillPos;
	
	/** The coach pword. */
	private String coachPword;
	
	/** The Coach name. */
	private String CoachName; 
	
	/** The coach user name. */
	private String coachUserName;
	
	/** The admin username. */
	private String adminUsername;
	
	/** The admin name. */
	private String adminName; 
	
	/** The junior player name. */
	private String juniorPlayerName;
	
	/** The junior SRU number. */
	private String juniorSRUNumber;
	
	/** The junior player address. */
	private String juniorPlayerAddress; 
	
	/** The junior player postcode. */
	private String juniorPlayerPostcode;
	
	/** The junior player mobile. */
	private String juniorPlayerMobile;
	
	/** The junior player tel. */
	private String juniorPlayerTel; 
	
	/** The junior player birth. */
	private Date juniorPlayerBirth; 
	
	/** The junior player email. */
	private String juniorPlayerEmail; 
	
	/** The junior player health. */
	private String juniorPlayerHealth; 
	
	/** The junior parent 1 rel. */
	private String juniorParent1Rel;
	
	/** The junior parent 1. */
	private String juniorParent1;
	
	/** The junior parent 2. */
	private String juniorParent2; 
	
	/** The junior parent 1 num. */
	private String juniorParent1Num; 
	
	/** The junior parent 1 address. */
	private String juniorParent1Address; 
	
	/** The junior parent 2 number. */
	private String juniorParent2Number; 
	
	/** The junior parent 2 address. */
	private String juniorParent2Address; 
	
	/** The junior parent 2 rel. */
	private String juniorParent2Rel; 
	
	/** The junior doc. */
	private String juniorDoc;
	
	/** The junior doc tel. */
	private String juniorDocTel; 
	
	/** The junior doc address. */
	private String juniorDocAddress; 
	
	/** The junior skill pos. */
	private String juniorSkillPos;
	
	/** The admin password. */
	private String adminPassword;
	
	/** The j player name. */
	private JTextField jPlayerName;
	
	/** The lbl name 3. */
	private JLabel lblName_3;
	
	/** The lbl address 4. */
	private JLabel lblAddress_4;
	
	/** The lbl post code 3. */
	private JLabel lblPostCode_3;
	
	/** The lbl num 3. */
	private JLabel lblNum_3;
	
	/** The lbl dob 3. */
	private JLabel lblDob_3;
	
	/** The lbl home phone 1. */
	private JLabel lblHomePhone_1;
	
	/** The lbl mobile no 3. */
	private JLabel lblMobileNo_3;
	
	/** The lbl email 3. */
	private JLabel lblEmail_3;
	
	/** The lbl health 3. */
	private JLabel lblHealth_3;
	
	/** The lbl parent 1. */
	private JLabel lblParent_1;
	
	/** The lbl doctor 3. */
	private JLabel lblDoctor_3;
	
	/** The j player tel. */
	private JTextField jPlayerTel;
	
	/** The j player email. */
	private JTextField jPlayerEmail;
	
	/** The j player address. */
	private JTextField jPlayerAddress;
	
	/** The j player SRU. */
	private JTextField jPlayerSRU;
	
	/** The j player parent 1. */
	private JTextField jPlayerParent1;
	
	/** The j player parent rel. */
	private JTextField jPlayerParentRel;
	
	/** The lbl relationship 2. */
	private JLabel lblRelationship_2;
	
	/** The j player postcode. */
	private JTextField jPlayerPostcode;
	
	/** The j parent 1 tel num. */
	private JTextField jParent1TelNum;
	
	/** The lbl address 5. */
	private JLabel lblAddress_5;
	
	/** The j player mobile. */
	private JTextField jPlayerMobile;
	
	/** The lbl address 3 3. */
	private JLabel lblAddress_3_3;
	
	/** The j player parent 2 address. */
	private JTextField jPlayerParent2Address;
	
	/** The lbl parent 3. */
	private JLabel lblParent_3;
	
	/** The j player P 2 name. */
	private JTextField jPlayerP2Name;
	
	/** The lbl relationship 3. */
	private JLabel lblRelationship_3;
	
	/** The j player P 1 address. */
	private JTextField jPlayerP1Address;
	
	/** The lbl address 3 4. */
	private JLabel lblAddress_3_4;
	
	/** The j doctor. */
	private JTextField jDoctor;
	
	/** The lbl address 3 1 2. */
	private JLabel lblAddress_3_1_2;
	
	/** The j player doc address. */
	private JTextField jPlayerDocAddress;
	
	/** The j player P 2 rel. */
	private JTextField jPlayerP2Rel;
	
	/** The j player parent 2 tel. */
	private JTextField jPlayerParent2Tel;
	
	/** The lbl doctor 2 2. */
	private JLabel lblDoctor_2_2;
	
	/** The doc tellbl. */
	private JLabel docTellbl;
	
	/** The j player health. */
	private JEditorPane jPlayerHealth;
	
	/** The junior health. */
	private JEditorPane juniorHealth;
	
	/** The j player position. */
	private JComboBox<Object> jPlayerPosition;
	
	/** The junior position. */
	private JComboBox<Object> juniorPosition;
	
	/** The btn save details. */
	private JButton btnSaveDetails;
	
	/** The lbl new label 3. */
	private JLabel lblNewLabel_3;
	
	/** The j doctor tel. */
	private JTextField jDoctorTel;
	
	/** The date chooser. */
	private JDateChooser dateChooser;
	
	/** The e DOB. */
	private JDateChooser eDOB;
	
	/** The j junior birth. */
	private JDateChooser jJuniorBirth;
	
	/** The j player date. */
	private JDateChooser jPlayerDate;
	
	/** The Player list. */
	public DefaultListModel<Player> PlayerList;
	
	/** The dlm. */
	private DefaultListModel<User> dlm;
	
	/** The skill position. */
	private JComboBox<Object> skillPosition;
	
	/** The u. */
	private User u;
	
	/** The btn delete player. */
	private JButton btnDeletePlayer;
		
	/**
	 * Display message.
	 *
	 * @param message the message
	 */
	private void displayMessage(String message) { 
		JOptionPane.showMessageDialog(this, message);
	}
	
	/**
	 * Adds the player.
	 *
	 * @throws ParseException the parse exception
	 */
	private void addPlayer() throws ParseException { 
		
			name = playerName.getText(); 
			playerAddress = PlayerAddress.getText(); 
			postcode = playerPostcode.getText(); 
			SRU = SRUNumber.getText(); 
			phoneNumber = playerNum.getText(); 
			mobileNumber = playerMobile.getText();
			email = playerEmail.getText(); 
			health = playerHealth.getText(); 
			kin = playerKin.getText(); 
			doctor = playerDoctor.getText(); 
			doctorNum = docPhone.getText(); 
			parentNumber = parentPhone.getText(); 
			skillPos = skillPosition.getSelectedItem().toString();			
			// Make sure fields are not emtpy
			if (name.isBlank() || playerAddress.isBlank() || postcode.isBlank() || SRU.isBlank() || phoneNumber.isBlank() 
				|| mobileNumber.isBlank()|| email.isBlank() || health.isBlank() || kin.isBlank()
				|| doctor.isBlank() || doctorNum.isBlank() || parentNumber.isBlank() || skillPos.isBlank()) {
				displayMessage("Error! - All Fields must be filled");					
			} else { 
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String getDate = sdf.format(dateChooser.getDate());
					
					Date dob = sdf.parse(getDate);										
					Date compareDate = sdf.parse("05-05-2004");
					 
					if (dob.compareTo(compareDate) > 0) { 
						displayMessage("This player is too young to play for the senior team");
					} else { 
						Date date = dateChooser.getDate();
					 
						// Add player to system 
						Player newPlayer = myController.addPlayer(name, playerAddress, postcode, SRU, date, phoneNumber, mobileNumber, 
											   email, health, kin, doctor, doctorNum, parentNumber, skillPos);
						
						if (newPlayer == null) { 
							displayMessage("Error - A Player already exists with those credentials!");
						} else { 
							displayMessage("Player added successfully"); 
						}
						
						PlayerList.addElement(newPlayer);							
					}
				} catch (NullPointerException e) { 
					displayMessage("Error - Enter DOB for Player");
				}
			}							
		}
	 
	
	/**
	 * Adds the junior.
	 *
	 * @throws ParseException the parse exception
	 */
	private void addJunior() throws ParseException {
		
		jName = juniorName.getText();
		jSRU = JuniorSRU.getText(); 
		jAddress = juniorAddress.getText();
		jMobile = mobileNum.getText(); 
		jHomePhone = homePhone.getText(); 
		jEmail = juniorEmail.getText(); 		
		jHealth = juniorHealth.getText();
		jPostcode = PostCode.getText(); 
		jParent1 = parent1.getText(); 
		jParent1Relationship = parentRelationship.getText(); 
		jParent1Address = parent1Address.getText(); 
		jParent1Tel = parent1Tel.getText(); 
		jParent2Name = parent2Name.getText(); 
		jParent2Relationship = parent2Relationship.getText(); 
		jParent2Address = parent2Address.getText(); 
		jParent2Tel = parent2Tel.getText();
		jDoc = doctorName.getText(); 
		jDocAddress = docAddress.getText(); 
		jDocTel = docTel.getText(); 
		jPosition = juniorPosition.getSelectedItem().toString();
		
		if (jName.isEmpty() || jSRU.isEmpty() || jAddress.isEmpty() || jMobile.isEmpty() || jHomePhone.isEmpty() || jEmail.isEmpty() || jPostcode.isEmpty() ||
			jParent1.isEmpty() || jParent1Relationship.isEmpty() || jParent1Address.isEmpty() || jParent1Tel.isEmpty() || jParent2Name.isEmpty() || 
			jParent2Relationship.isEmpty() || jParent2Address.isEmpty() || jDoc.isEmpty() || jDocAddress.isEmpty() || jDocTel.isEmpty() || jPosition.isBlank()) { 
			displayMessage("Error! Make sure all fields are filled");
		} else { 
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String getDate = sdf.format(jPlayerDate.getDate());
				
				Date dob = sdf.parse(getDate);										
				Date compareDate = sdf.parse("05-05-2004");
				
				if (dob.compareTo(compareDate) < 0) { 
					displayMessage("This player is too old to play for the junior team");
				} else { 
					Date date = jPlayerDate.getDate();
				 
					// Add player to system 
					Junior newJunior = myController.addJunior(jName, jSRU,  jAddress, date, jMobile, jHomePhone, jPostcode, jEmail, 
							jHealth, jParent1Relationship, jParent1, jParent2Name, jParent1Tel,  jParent1Address, jParent2Tel,
							 jParent2Address,  jParent2Relationship,  jDoc,  jDocTel,  jDocAddress, jPosition);
					
					if (newJunior == null) { 
						displayMessage("Error - A Junior already exists with those credentials!");
					} else { 
						displayMessage("Junior added successfully"); 
					}				
					jList.addElement(newJunior);	
				 				
				}
			} catch (NullPointerException e) { 		
				displayMessage("Error - Enter DOB for Junior");
			}
		}
	}
	
	/**
	 * Removes the junior.
	 */
	public void removeJunior() { 
		j = (Junior) JuniorPlayerList.getSelectedValue();
		Iterator<Junior> rJ = JuniorManager.getJuniorList().iterator();
		while(rJ.hasNext()) { 
			Junior jP = rJ.next();
			if (jP.equals(j)) { 
				jList.removeElement(j);
				rJ.remove();
			}
		}	
		displayMessage("Junior has been removed");
		myController.saveData();
	}
	
	/**
	 * Removes the player.
	 */
	public void removePlayer() { 		
		
		p = (Player) playerList.getSelectedValue();
		Iterator<Player> rP = PlayerManager.getPlayerList().iterator();
		while(rP.hasNext()) { 
			Player player = rP.next();
			if (player.equals(p)) { 
				PlayerList.removeElement(p);
				rP.remove();
			}
		}			
		displayMessage("Player has been removed");
		myController.saveData();		
	}
	
	/**
	 * Removes the coach.
	 */
	private void removeCoach( ) { 
		// Loop through CoachList and remove selected coach
		u = (User) coachList.getSelectedValue();
		Iterator<User> c = myController.getCoachList().iterator();
		while(c.hasNext()) { 
			User coach = c.next();
			if (coach.equals(u)) { 
				dlm.removeElement(u);
				c.remove(); 
			}
		}	
		// Loop through user list and remove coach 
		Iterator<User> userList = UserManager.getUserList().iterator(); {
			while(userList.hasNext()) { 
				User coach = userList.next();
				if (coach.equals(u)) { 
					userList.remove();
				}
			}
		}
		displayMessage("Coach has been removed");
		myController.saveData();
	} 
	
	/**
	 * Gets the coach details.
	 *
	 * @param coach the coach
	 * @return the coach details
	 */
	private void getCoachDetails(User coach) { 
		
		coachDetailPane.setText(coach.toString());
	}
	
	/**
	 * Instantiates a new admin home.
	 *
	 * @param username the username
	 * @param cont the cont
	 */
	public AdminHome(String username, Controller cont) {
		
		myController = cont;		
		myController.saveData();
		
		
		// create a player list list 
		PlayerList = new DefaultListModel<Player>();	
		for (Player p: myController.getPlayerList()) { 
			PlayerList.addElement(p);
		}
		
		// create a Junior list 
		jList = new DefaultListModel<Junior>();
		for (Junior j: myController.getJuniorList()) { 
			jList.addElement(j);
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				myController.handleWindowClosed("AdminHome");						
			}
		});
		
		setForeground(new Color(0, 51, 153));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 793, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		// display Coach list to jList
		dlm = new DefaultListModel<User>();	
		for (User u: myController.getCoachList()) { 
			dlm.addElement(u);
		}	
		
			
		viewAllJuniors = new JPanel();
		viewAllJuniors.setBounds(266, 56, 511, 397);
		contentPane.add(viewAllJuniors);
		viewAllJuniors.setLayout(null);
		viewAllJuniors.setVisible(false);
		
		JLabel pLabel_1 = new JLabel("Junior List");
		pLabel_1.setBounds(179, 12, 119, 22);
		pLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		viewAllJuniors.add(pLabel_1);
		
		JButton editJuniorbtn = new JButton("Edit Junior");
		editJuniorbtn.addActionListener(new ActionListener() {
			
			/**
			 * Action performed.
			 *
			 * @param e the e
			 */
			public void actionPerformed(ActionEvent e) {
				try {
					// Get the Selected player and display the correct panel 
					j = JuniorPlayerList.getSelectedValue();
					
					
					jPlayerName.setText(j.getJuniorName());
					jPlayerAddress.setText(j.getJuniorAddress());
					jPlayerPostcode.setText(j.getJuniorPostcode());
					jPlayerMobile.setText(j.getMobileNum());
					jPlayerSRU.setText(j.getSRUNumber());
					jPlayerTel.setText(j.getJuniorTel());
					jPlayerEmail.setText(j.getJuniorEmail());
					jPlayerParent1.setText(j.getJuniorParent1());
					jPlayerParentRel.setText(j.getParent1Relationship());
					jParent1TelNum.setText(j.getParent1Number());
					jPlayerP1Address.setText(j.getParent1Address());
					jPlayerP2Name.setText(j.getParent2());
					jPlayerP2Rel.setText(j.getParent2Relationship());
					jPlayerParent2Tel.setText(j.getParent2Number());
					jPlayerParent2Address.setText(j.getParent2Address());
						
					jDoctor.setText(j.getDoctor());
					jDoctorTel.setText(j.getDocNumber());
					jPlayerDocAddress.setText(j.getDocAddress());
							
					jPlayerHealth.setText(j.getJuniorHealth());
					jPlayerPosition.setSelectedItem(j.getJuniorPosition());
					jJuniorBirth.setDate(j.getJuniorBirth());							
				
					// Set edit panel to true	
					editJunior.setVisible(true);
					editPlayer.setVisible(false);				
					viewAllPlayers.setVisible(false);
					viewAllJuniors.setVisible(false);
					// Disable sidebar buttons. Stops users from accessing different panels 
					addAdminBTN.setEnabled(false);
					addCoachBTN.setEnabled(false);
					addPlayerBTN.setEnabled(false);
					viewAllPlayersBTN.setEnabled(false);
					viewAllCoachesBTN.setEnabled(false);				
					btnViewAllJunior.setEnabled(true);
					addJunior.setEnabled(false);
				} catch (NullPointerException ex) { 
					displayMessage("Please Selected a Junior");
					addAdminBTN.setEnabled(true);
					addCoachBTN.setEnabled(true);
					//btnViewAllJunior.setEnabled(true);
					addPlayerBTN.setEnabled(true);
					viewAllPlayersBTN.setEnabled(true);
					viewAllCoachesBTN.setEnabled(true);
					addJunior.setEnabled(true);
				}
				
			}
			
		});
		editJuniorbtn.setBounds(157, 247, 156, 30);
		viewAllJuniors.add(editJuniorbtn);
		
		viewJuniorPanel = new JPanel();
		viewJuniorPanel.setBounds(157, 45, 156, 191);
		viewAllJuniors.add(viewJuniorPanel);
		viewJuniorPanel.setLayout(null);
		
		JuniorPlayerList = new JList<Junior>(jList);		
		JuniorPlayerList.setCellRenderer(new DefaultListCellRenderer() {

			/**
			 * 
			 */
			// Display junior object to JList 
			private static final long serialVersionUID = 1L;
			
			@Override 
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) { 
				Component renderer = super.getListCellRendererComponent(JuniorPlayerList, value, index, isSelected, cellHasFocus);
				if (renderer instanceof JLabel && value instanceof Junior) { 
					((JLabel) renderer).setText(((Junior) value).getJuniorName());
				}
				
				return renderer;
			}
			
			
		});
		JuniorPlayerList.setBounds(0, 0, 156, 191);
		JuniorPlayerList.setVisibleRowCount(20);
		JuniorPlayerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JuniorPlayerList.setSelectionBackground(Color.CYAN);
		JuniorPlayerList.setMaximumSize(new Dimension(50, 50));
		JuniorPlayerList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		JuniorPlayerList.setFocusTraversalPolicyProvider(true);
		JuniorPlayerList.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(192, 192, 192), null, null));
		JuniorPlayerList.setBackground(Color.WHITE);
		JuniorPlayerList.setAlignmentY(1.0f);
		JuniorPlayerList.setAlignmentX(1.0f);
		
		viewJuniorPanel.add(JuniorPlayerList);
		
		JButton btnNewButton = new JButton("Delete Junior");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Remove Junior from system
				removeJunior();
			}
		});
		btnNewButton.setBounds(157, 313, 156, 30);
		viewAllJuniors.add(btnNewButton);
		
		addJuniorPanel = new JPanel();
		addJuniorPanel.setBackground(Color.WHITE);
		addJuniorPanel.setBounds(266, 56, 511, 397);
		contentPane.add(addJuniorPanel);
		addJuniorPanel.setLayout(null);
		addJuniorPanel.setVisible(false);
		
		juniorName = new JTextField();
		juniorName.setBounds(10, 29, 96, 20);
		juniorName.setColumns(10);
		addJuniorPanel.add(juniorName);
		
		JLabel lblName_2 = new JLabel("Player Name");
		lblName_2.setBounds(19, 7, 76, 22);
		lblName_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		addJuniorPanel.add(lblName_2);
		
		JLabel lblAddress_2 = new JLabel("Address");
		lblAddress_2.setBounds(275, 7, 50, 22);
		lblAddress_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		addJuniorPanel.add(lblAddress_2);
		
		JLabel lblPostCode_2 = new JLabel("Postcode");
		lblPostCode_2.setBounds(384, 54, 57, 22);
		lblPostCode_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostCode_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		addJuniorPanel.add(lblPostCode_2);
		
		JLabel lblNum_2 = new JLabel("SRU Number");
		lblNum_2.setBounds(142, 8, 80, 22);
		lblNum_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		addJuniorPanel.add(lblNum_2);
		
		JLabel lblDob_2 = new JLabel("D.O.B");
		lblDob_2.setBounds(384, 7, 35, 22);
		lblDob_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		addJuniorPanel.add(lblDob_2);
		
		JLabel lblHomePhone = new JLabel("Home phone");
		lblHomePhone.setBounds(138, 54, 84, 22);
		lblHomePhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePhone.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		addJuniorPanel.add(lblHomePhone);
		
		JLabel lblMobileNo_2 = new JLabel("Mobile No.");
		lblMobileNo_2.setBounds(23, 55, 64, 22);
		lblMobileNo_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNo_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		addJuniorPanel.add(lblMobileNo_2);
		
		JLabel lblEmail_2 = new JLabel("Email");
		lblEmail_2.setBounds(282, 54, 32, 22);
		lblEmail_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		addJuniorPanel.add(lblEmail_2);
		
		JLabel lblHealth_2 = new JLabel("Player Health issues:");
		lblHealth_2.setBounds(10, 237, 128, 22);
		lblHealth_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblHealth_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		addJuniorPanel.add(lblHealth_2);
		
		JLabel lblParent = new JLabel("Parent 1");
		lblParent.setBounds(20, 104, 68, 22);
		lblParent.setHorizontalAlignment(SwingConstants.CENTER);
		lblParent.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		addJuniorPanel.add(lblParent);
		
		JLabel lblDoctor_2 = new JLabel("Doctor");
		lblDoctor_2.setBounds(34, 191, 41, 22);
		lblDoctor_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctor_2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		addJuniorPanel.add(lblDoctor_2);
		
		JuniorSRU = new JTextField();
		JuniorSRU.setColumns(10);
		JuniorSRU.setBounds(134, 29, 96, 20);
		addJuniorPanel.add(JuniorSRU);
		
		juniorAddress = new JTextField();
		juniorAddress.setColumns(10);
		juniorAddress.setBounds(253, 29, 96, 20);
		addJuniorPanel.add(juniorAddress);
		
		mobileNum = new JTextField();
		mobileNum.setColumns(10);
		mobileNum.setBounds(11, 72, 96, 20);
		addJuniorPanel.add(mobileNum);
		
		homePhone = new JTextField();
		homePhone.setColumns(10);
		homePhone.setBounds(132, 72, 96, 20);
		addJuniorPanel.add(homePhone);
		
		juniorEmail = new JTextField();
		juniorEmail.setColumns(10);
		juniorEmail.setBounds(252, 72, 96, 20);
		addJuniorPanel.add(juniorEmail);
		
		PostCode = new JTextField();
		PostCode.setColumns(10);
		PostCode.setBounds(365, 71, 96, 20);
		addJuniorPanel.add(PostCode);
		
		parent1 = new JTextField();
		parent1.setColumns(10);
		parent1.setBounds(11, 124, 96, 20);
		addJuniorPanel.add(parent1);
		
		JLabel lblRelationship = new JLabel("Relationship");
		lblRelationship.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelationship.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblRelationship.setBounds(132, 103, 94, 22);
		addJuniorPanel.add(lblRelationship);
		
		parentRelationship = new JTextField();
		parentRelationship.setColumns(10);
		parentRelationship.setBounds(130, 123, 96, 20);
		addJuniorPanel.add(parentRelationship);
		
		parent1Address = new JTextField();
		parent1Address.setColumns(10);
		parent1Address.setBounds(251, 123, 96, 20);
		addJuniorPanel.add(parent1Address);
		
		JLabel lblAddress_3 = new JLabel("Address");
		lblAddress_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblAddress_3.setBounds(253, 103, 94, 22);
		addJuniorPanel.add(lblAddress_3);
		
		parent1Tel = new JTextField();
		parent1Tel.setColumns(10);
		parent1Tel.setBounds(365, 124, 96, 20);
		addJuniorPanel.add(parent1Tel);
		
		JLabel lblAddress_3_1 = new JLabel("Tel");
		lblAddress_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_3_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblAddress_3_1.setBounds(367, 104, 94, 22);
		addJuniorPanel.add(lblAddress_3_1);
		
		parent2Name = new JTextField();
		parent2Name.setColumns(10);
		parent2Name.setBounds(12, 171, 96, 20);
		addJuniorPanel.add(parent2Name);
		
		JLabel lblParent_2 = new JLabel("Parent 2");
		lblParent_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblParent_2.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		lblParent_2.setBounds(21, 151, 68, 22);
		addJuniorPanel.add(lblParent_2);
		
		parent2Relationship = new JTextField();
		parent2Relationship.setColumns(10);
		parent2Relationship.setBounds(131, 170, 96, 20);
		addJuniorPanel.add(parent2Relationship);
		
		JLabel lblRelationship_1 = new JLabel("Relationship");
		lblRelationship_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelationship_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblRelationship_1.setBounds(133, 150, 94, 22);
		addJuniorPanel.add(lblRelationship_1);
		
		parent2Address = new JTextField();
		parent2Address.setColumns(10);
		parent2Address.setBounds(252, 170, 96, 20);
		addJuniorPanel.add(parent2Address);
		
		JLabel lblAddress_3_2 = new JLabel("Address");
		lblAddress_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_3_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblAddress_3_2.setBounds(254, 150, 94, 22);
		addJuniorPanel.add(lblAddress_3_2);
		
		parent2Tel = new JTextField();
		parent2Tel.setColumns(10);
		parent2Tel.setBounds(366, 171, 96, 20);
		addJuniorPanel.add(parent2Tel);
		
		JLabel lblAddress_3_1_1 = new JLabel("Tel");
		lblAddress_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_3_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblAddress_3_1_1.setBounds(368, 151, 94, 22);
		addJuniorPanel.add(lblAddress_3_1_1);
		
		doctorName = new JTextField();
		doctorName.setColumns(10);
		doctorName.setBounds(10, 211, 96, 20);
		addJuniorPanel.add(doctorName);
		
		docAddress = new JTextField();
		docAddress.setColumns(10);
		docAddress.setBounds(129, 210, 96, 20);
		addJuniorPanel.add(docAddress);
		
		docTel = new JTextField();
		docTel.setColumns(10);
		docTel.setBounds(250, 210, 96, 20);
		addJuniorPanel.add(docTel);
		
		JLabel lblDoctor_2_1 = new JLabel("Doctor Address");
		lblDoctor_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctor_2_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDoctor_2_1.setBounds(130, 191, 97, 22);
		addJuniorPanel.add(lblDoctor_2_1);
		
		JLabel lblDoctor_2_1_1 = new JLabel("Doc Tel");
		lblDoctor_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctor_2_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDoctor_2_1_1.setBounds(249, 193, 97, 22);
		addJuniorPanel.add(lblDoctor_2_1_1);
		
		juniorHealth = new JEditorPane();
		juniorHealth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		juniorHealth.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		juniorHealth.setBounds(12, 256, 433, 60);
		addJuniorPanel.add(juniorHealth);		
		 		// Display junior positions to combobox
				juniorPosition = new JComboBox<Object>(myController.getSkillPosList());
				juniorPosition.setBounds(10, 337, 141, 22);
				addJuniorPanel.add(juniorPosition);
				
				JButton Add = new JButton("Add Junior");
				Add.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try { // Add junior to system  
							addJunior();
						} catch (ParseException e1) { // Display error if exception caught 							
							displayMessage("Error in adding junior");
						}
					}
				});
				Add.setBounds(365, 333, 103, 42);
				addJuniorPanel.add(Add);
				
				
				JLabel lblNewLabel_2 = new JLabel("Position");
				lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
				lblNewLabel_2.setBounds(53, 319, 76, 14);
				addJuniorPanel.add(lblNewLabel_2);
				
				jPlayerDate = new JDateChooser();
				jPlayerDate.setBounds(365, 29, 96, 20);
				addJuniorPanel.add(jPlayerDate);
		
		// Player Panel
		AddPlayerPanel = new JPanel();
		AddPlayerPanel.setBounds(266, 56, 511, 397);
		contentPane.add(AddPlayerPanel);
		AddPlayerPanel.setLayout(null);
		
		playerName = new JTextField();
		playerName.setBounds(22, 29, 131, 20);
		AddPlayerPanel.add(playerName);
		playerName.setColumns(10);
		
		JLabel lblName = new JLabel("Player Name");
		lblName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(36, 13, 89, 20);
		AddPlayerPanel.add(lblName);
		
		PlayerAddress = new JTextField();
		PlayerAddress.setColumns(10);
		PlayerAddress.setBounds(16, 81, 131, 20);
		AddPlayerPanel.add(PlayerAddress);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblAddress.setBounds(31, 64, 89, 20);
		AddPlayerPanel.add(lblAddress);
		
		playerPostcode = new JTextField();
		playerPostcode.setColumns(10);
		playerPostcode.setBounds(16, 136, 131, 20);
		AddPlayerPanel.add(playerPostcode);
		
		JLabel lblPostCode = new JLabel("Postcode");
		lblPostCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostCode.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblPostCode.setBounds(30, 119, 89, 20);
		AddPlayerPanel.add(lblPostCode);
		
		SRUNumber = new JTextField();
		SRUNumber.setColumns(10);
		SRUNumber.setBounds(177, 30, 131, 20);
		AddPlayerPanel.add(SRUNumber);
		
		JLabel lblNum = new JLabel("SRU Number");
		lblNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblNum.setBounds(198, 12, 89, 20);
		AddPlayerPanel.add(lblNum);
		
		JLabel lblDob = new JLabel("D.O.B");
		lblDob.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDob.setBounds(201, 63, 89, 20);
		AddPlayerPanel.add(lblDob);		
		
		playerNum = new JTextField();
		playerNum.setColumns(10);
		playerNum.setBounds(181, 137, 135, 20);
		AddPlayerPanel.add(playerNum);
		
		JLabel lblPhoneNo = new JLabel("Phone No.");
		lblPhoneNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblPhoneNo.setBounds(197, 120, 89, 20);
		AddPlayerPanel.add(lblPhoneNo);
		
		playerMobile = new JTextField();
		playerMobile.setColumns(10);
		playerMobile.setBounds(333, 30, 147, 20);
		AddPlayerPanel.add(playerMobile);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNo.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblMobileNo.setBounds(361, 13, 89, 20);
		AddPlayerPanel.add(lblMobileNo);
		
		playerEmail = new JTextField();
		playerEmail.setColumns(10);
		playerEmail.setBounds(331, 82, 147, 20);
		AddPlayerPanel.add(playerEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblEmail.setBounds(362, 65, 89, 20);
		AddPlayerPanel.add(lblEmail);
		
		playerHealth = new JEditorPane();
		playerHealth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		playerHealth.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		playerHealth.setBounds(30, 224, 473, 71);
		AddPlayerPanel.add(playerHealth);
		
		JLabel lblHealth = new JLabel("Player Health issues:");
		lblHealth.setHorizontalAlignment(SwingConstants.CENTER);
		lblHealth.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblHealth.setBounds(30, 203, 147, 20);
		AddPlayerPanel.add(lblHealth);
		
		playerKin = new JTextField();
		playerKin.setColumns(10);
		playerKin.setBounds(333, 136, 145, 20);
		AddPlayerPanel.add(playerKin);
		
		JLabel lblNextOfKin = new JLabel("Next Of kin");
		lblNextOfKin.setHorizontalAlignment(SwingConstants.CENTER);
		lblNextOfKin.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblNextOfKin.setBounds(350, 119, 89, 20);
		AddPlayerPanel.add(lblNextOfKin);
		
		playerDoctor = new JTextField();
		playerDoctor.setColumns(10);
		playerDoctor.setBounds(17, 175, 131, 20);
		AddPlayerPanel.add(playerDoctor);
		
		JLabel lblDoctor = new JLabel("Doctor");
		lblDoctor.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctor.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDoctor.setBounds(32, 158, 89, 20);
		AddPlayerPanel.add(lblDoctor);
		
		docPhone = new JTextField();
		docPhone.setColumns(10);
		docPhone.setBounds(185, 179, 131, 20);
		AddPlayerPanel.add(docPhone);
		
		JLabel lblDcotorPhoneNumber = new JLabel("Dcotor Phone Number");
		lblDcotorPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblDcotorPhoneNumber.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDcotorPhoneNumber.setBounds(175, 160, 147, 20);
		AddPlayerPanel.add(lblDcotorPhoneNumber);
		
		JLabel lblParentguardianPhone = new JLabel("Parent/Guardian Phone");
		lblParentguardianPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblParentguardianPhone.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblParentguardianPhone.setBounds(327, 160, 147, 20);
		AddPlayerPanel.add(lblParentguardianPhone);
		
		skillPosition = new JComboBox<Object>(myController.getSkillPosList());
		skillPosition.setBounds(193, 316, 141, 22);
		AddPlayerPanel.add(skillPosition);	
		
		JButton addPlayer = new JButton("Add Player");
		addPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				try { // Add player to system 
					addPlayer();
				} catch (ParseException e1) {				
					displayMessage("Parsing error");
					return;
				}
			}
			
		});
		addPlayer.setBounds(216, 358, 97, 32);
		AddPlayerPanel.add(addPlayer);
		
		
		
		parentPhone = new JTextField();
		parentPhone.setColumns(10);
		parentPhone.setBounds(336, 178, 131, 20);
		AddPlayerPanel.add(parentPhone);
		
		JLabel lblNewLabel_6 = new JLabel("Skill Position");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(215, 289, 94, 32);
		AddPlayerPanel.add(lblNewLabel_6);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(177, 81, 131, 20);
		AddPlayerPanel.add(dateChooser); 
		AddPlayerPanel.setVisible(false);		
		
		viewAllPlayers = new JPanel();
		viewAllPlayers.setBounds(266, 56, 511, 397);
		contentPane.add(viewAllPlayers);
		viewAllPlayers.setLayout(null);
		
		JPanel playerListPanel = new JPanel();
		playerListPanel.setBorder(null);
		playerListPanel.setBounds(103, 11, 33, 197);
		viewAllPlayers.add(playerListPanel);
		playerListPanel.setLayout(null);
		
		JButton editPlayerbtn = new JButton("Edit Player");
		
		editPlayerbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					// Get the Selected player and display the correct panel 
					p = playerList.getSelectedValue();
					
					// Get player details and set them to the appropriate each field
					eName.setText(p.getPlayerName());
					eAddress.setText(p.getPlayerAddress());
					ePostcode.setText(p.getPostCode());
					ePhone.setText(p.getPlayerPhoneNum());
					eSRU.setText(p.getSRU());
					eMobile.setText(p.getMobileNumber());
					eEmail.setText(p.getPlayerEmail());
					eKin.setText(p.getPlayerKin());
					eParentNum.setText(p.getParentNumber());
					eDoctor.setText(p.getPlayerDoctor());
					eDocNum.setText(p.getDocNum());
					ePlayerHealth.setText(p.getPlayerHealth());
					skillPosition_1.setSelectedItem(p.getPosition());
					eDOB.setDate(p.getPlayerBirth());						
				
					// Set edit panel to true				
					editPlayer.setVisible(true);
					viewAllPlayers.setVisible(false);
					// Disable sidebar buttons. Stops users from accessing different panels 
					addAdminBTN.setEnabled(false);
					addCoachBTN.setEnabled(false);
					addPlayerBTN.setEnabled(false);
					viewAllPlayersBTN.setEnabled(true);
					viewAllCoachesBTN.setEnabled(false);
					btnViewAllJunior.setEnabled(false);
					addJunior.setEnabled(false);
				} catch (NullPointerException ex) { 
					displayMessage("Please Selected a player");
					addAdminBTN.setEnabled(true);
					addCoachBTN.setEnabled(true);
					btnViewAllJunior.setEnabled(true);
					addPlayerBTN.setEnabled(true);
					//viewAllPlayersBTN.setEnabled(true);
					viewAllCoachesBTN.setEnabled(true);
					addJunior.setEnabled(true);
				}
			}
		});
		
		editPlayerbtn.setBounds(165, 219, 162, 23);
		viewAllPlayers.add(editPlayerbtn);
		
		
		playerList = new JList<Player>(PlayerList);
		playerList.setCellRenderer(new DefaultListCellRenderer() {

			/**
			 * 
			 */
			// Display objects in JList 
			private static final long serialVersionUID = 1L;
			
			@Override 
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) { 
				Component renderer = super.getListCellRendererComponent(playerList, value, index, isSelected, cellHasFocus);
				if (renderer instanceof JLabel && value instanceof Player) { 
					((JLabel) renderer).setText(((Player) value).getPlayerName());
				}
				
				return renderer;
			}
			
			
		});
		playerList.setBounds(160, 42, 156, 127);
		viewAllPlayers.add(playerList);
		playerList.setSelectionBackground(Color.CYAN);
		playerList.setVisibleRowCount(10);
		playerList.setFocusTraversalPolicyProvider(true);
		playerList.setMaximumSize(new Dimension(50, 50));
		playerList.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		playerList.setAlignmentX(Component.RIGHT_ALIGNMENT);
		playerList.setBackground(Color.WHITE);
		playerList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		playerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		playerList.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(192, 192, 192), null, null));
		
		JLabel pLabel = new JLabel("Player List");
		pLabel.setBounds(186, 11, 108, 39);
		viewAllPlayers.add(pLabel);
		pLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		btnDeletePlayer = new JButton("Delete Player");
		btnDeletePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Delete player from system
				removePlayer();
			}
		});
		btnDeletePlayer.setBounds(165, 266, 162, 23);
		viewAllPlayers.add(btnDeletePlayer);
		viewAllPlayers.setVisible(false);
		
		ViewAllCoaches = new JPanel();
		ViewAllCoaches.setBounds(266, 56, 511, 397);
		contentPane.add(ViewAllCoaches);
		ViewAllCoaches.setLayout(null);
		ViewAllCoaches.setVisible(false);
		
		JPanel coachListPanel = new JPanel();
		coachListPanel.setLayout(null);
		coachListPanel.setBorder(null);
		coachListPanel.setBounds(0, 5, 176, 370);
		ViewAllCoaches.add(coachListPanel);
		
		coachList = new JList<User>(dlm);
		coachList.setCellRenderer(new DefaultListCellRenderer() {

			/**
			 * 
			 */
			// Allows objects to be displayed in a jList 
			private static final long serialVersionUID = 1L;
			
			@Override 
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) { 
				Component renderer = super.getListCellRendererComponent(coachList, value, index, isSelected, cellHasFocus);
				if (renderer instanceof JLabel && value instanceof User) { 
					((JLabel) renderer).setText(((User) value).getName());
				}
				
				return renderer;
			}
			
			
		});
		coachList.setVisibleRowCount(20);
		coachList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		coachList.setSelectionBackground(Color.CYAN);
		coachList.setMaximumSize(new Dimension(50, 50));
		coachList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		coachList.setFocusTraversalPolicyProvider(true);
		coachList.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(192, 192, 192), null, null));
		coachList.setBackground(Color.WHITE);
		coachList.setAlignmentY(1.0f);
		coachList.setAlignmentX(1.0f);
		coachList.setBounds(13, 26, 156, 343);
		coachListPanel.add(coachList);
		
		JLabel lblCoachList = new JLabel("Coach List");
		lblCoachList.setBounds(27, -5, 141, 39);
		coachListPanel.add(lblCoachList);
		lblCoachList.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		viewCoachDetails = new JButton("View Details");
		viewCoachDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get selected value and display their details
				u = coachList.getSelectedValue();
				getCoachDetails(u);
			}
		});
		viewCoachDetails.setBounds(186, 52, 109, 23);
		ViewAllCoaches.add(viewCoachDetails);
		
		deleteCoach = new JButton("Delete Coach");
		deleteCoach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Remove coach
				removeCoach();				
				
			}
		});
		deleteCoach.setBounds(186, 102, 109, 23);
		ViewAllCoaches.add(deleteCoach);
		
		playerDetails = new JPanel();
		playerDetails.setLayout(null);
		playerDetails.setBounds(302, 21, 183, 351);
		ViewAllCoaches.add(playerDetails);
		
		coachDetailPane = new JTextPane();
		coachDetailPane.setEditable(false);
		coachDetailPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.LIGHT_GRAY, null, null));
		coachDetailPane.setBounds(0, 11, 183, 340);
		playerDetails.add(coachDetailPane);
		
		lblNewLabel_1 = new JLabel("Coach details");
		lblNewLabel_1.setBounds(331, 1, 140, 23);
		ViewAllCoaches.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		editJunior = new JPanel();
		editJunior.setBounds(266, 56, 511, 397);
		contentPane.add(editJunior);
		editJunior.setVisible(false);
		editJunior.setLayout(null);
		
		jPlayerName = new JTextField();
		jPlayerName.setBounds(8, 34, 86, 20);
		jPlayerName.setColumns(10);
		editJunior.add(jPlayerName);
		
		lblName_3 = new JLabel("Player Name");
		lblName_3.setBounds(14, 5, 76, 22);
		lblName_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		editJunior.add(lblName_3);
		
		lblAddress_4 = new JLabel("Address");
		lblAddress_4.setBounds(326, 5, 50, 22);
		lblAddress_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_4.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblAddress_4);
		
		lblPostCode_3 = new JLabel("Postcode");
		lblPostCode_3.setBounds(109, 57, 57, 22);
		lblPostCode_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostCode_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblPostCode_3);
		
		lblNum_3 = new JLabel("SRU Number");
		lblNum_3.setBounds(109, 6, 80, 22);
		lblNum_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblNum_3);
		
		lblDob_3 = new JLabel("D.O.B");
		lblDob_3.setBounds(231, 57, 35, 22);
		lblDob_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblDob_3);
		
		lblHomePhone_1 = new JLabel("Home phone");
		lblHomePhone_1.setBounds(414, 5, 77, 22);
		lblHomePhone_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHomePhone_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblHomePhone_1);
		
		lblMobileNo_3 = new JLabel("Mobile No.");
		lblMobileNo_3.setBounds(18, 57, 64, 22);
		lblMobileNo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNo_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblMobileNo_3);
		
		lblEmail_3 = new JLabel("Email");
		lblEmail_3.setBounds(234, 5, 32, 22);
		lblEmail_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblEmail_3);
		
		lblHealth_3 = new JLabel("Player Health issues:");
		lblHealth_3.setBounds(8, 246, 128, 22);
		lblHealth_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblHealth_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblHealth_3);
		
		lblParent_1 = new JLabel("Parent 1");
		lblParent_1.setBounds(22, 110, 52, 22);
		lblParent_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblParent_1.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		editJunior.add(lblParent_1);
		
		lblDoctor_3 = new JLabel("Doctor");
		lblDoctor_3.setBounds(29, 203, 41, 22);
		lblDoctor_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctor_3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		editJunior.add(lblDoctor_3);
		
		jPlayerTel = new JTextField();
		jPlayerTel.setBounds(405, 34, 86, 20);
		jPlayerTel.setColumns(10);
		editJunior.add(jPlayerTel);
		
		jPlayerEmail = new JTextField();
		jPlayerEmail.setBounds(203, 34, 86, 20);
		jPlayerEmail.setColumns(10);
		editJunior.add(jPlayerEmail);
		
		jPlayerAddress = new JTextField();
		jPlayerAddress.setBounds(309, 34, 86, 20);
		jPlayerAddress.setColumns(10);
		editJunior.add(jPlayerAddress);
		
		jPlayerSRU = new JTextField();
		jPlayerSRU.setBounds(107, 35, 86, 20);
		jPlayerSRU.setColumns(10);
		editJunior.add(jPlayerSRU);
		
		jPlayerParent1 = new JTextField();
		jPlayerParent1.setBounds(5, 132, 86, 20);
		jPlayerParent1.setColumns(10);
		editJunior.add(jPlayerParent1);
		
		jPlayerParentRel = new JTextField();
		jPlayerParentRel.setBounds(106, 131, 86, 20);
		jPlayerParentRel.setColumns(10);
		editJunior.add(jPlayerParentRel);
		
		lblRelationship_2 = new JLabel("Relationship");
		lblRelationship_2.setBounds(109, 109, 75, 22);
		lblRelationship_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelationship_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblRelationship_2);
		
		jPlayerPostcode = new JTextField();
		jPlayerPostcode.setBounds(104, 82, 86, 20);
		jPlayerPostcode.setColumns(10);
		editJunior.add(jPlayerPostcode);
		
		jParent1TelNum = new JTextField();
		jParent1TelNum.setBounds(208, 132, 86, 20);
		jParent1TelNum.setColumns(10);
		editJunior.add(jParent1TelNum);
		
		lblAddress_5 = new JLabel("Address");
		lblAddress_5.setBounds(326, 110, 50, 22);
		lblAddress_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_5.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblAddress_5);
		
		jPlayerMobile = new JTextField();
		jPlayerMobile.setBounds(8, 80, 86, 20);
		jPlayerMobile.setColumns(10);
		editJunior.add(jPlayerMobile);
		
		lblAddress_3_3 = new JLabel("Tel");
		lblAddress_3_3.setBounds(238, 157, 18, 22);
		lblAddress_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_3_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblAddress_3_3);
		
		jPlayerParent2Address = new JTextField();
		jPlayerParent2Address.setBounds(309, 174, 86, 20);
		jPlayerParent2Address.setColumns(10);
		editJunior.add(jPlayerParent2Address);
		
		lblParent_3 = new JLabel("Parent 2");
		lblParent_3.setBounds(22, 157, 52, 22);
		lblParent_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblParent_3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 13));
		editJunior.add(lblParent_3);
		
		jPlayerP2Name = new JTextField();
		jPlayerP2Name.setBounds(8, 174, 86, 20);
		jPlayerP2Name.setColumns(10);
		editJunior.add(jPlayerP2Name);
		
		lblRelationship_3 = new JLabel("Relationship");
		lblRelationship_3.setBounds(110, 158, 75, 22);
		lblRelationship_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRelationship_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblRelationship_3);
		
		jPlayerP1Address = new JTextField();
		jPlayerP1Address.setBounds(309, 132, 86, 20);
		jPlayerP1Address.setColumns(10);
		editJunior.add(jPlayerP1Address);
		
		lblAddress_3_4 = new JLabel("Address");
		lblAddress_3_4.setBounds(326, 157, 50, 22);
		lblAddress_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_3_4.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblAddress_3_4);
		
		jDoctor = new JTextField();
		jDoctor.setBounds(8, 218, 86, 20);
		jDoctor.setColumns(10);
		editJunior.add(jDoctor);
		
		lblAddress_3_1_2 = new JLabel("Tel");
		lblAddress_3_1_2.setBounds(238, 111, 18, 22);
		lblAddress_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_3_1_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblAddress_3_1_2);
		
		jPlayerDocAddress = new JTextField();
		jPlayerDocAddress.setBounds(104, 218, 86, 20);
		jPlayerDocAddress.setColumns(10);
		editJunior.add(jPlayerDocAddress);
		
		jPlayerP2Rel = new JTextField();
		jPlayerP2Rel.setBounds(103, 174, 86, 20);
		jPlayerP2Rel.setColumns(10);
		editJunior.add(jPlayerP2Rel);
		
		jPlayerParent2Tel = new JTextField();
		jPlayerParent2Tel.setBounds(208, 174, 86, 20);
		jPlayerParent2Tel.setColumns(10);
		editJunior.add(jPlayerParent2Tel);
		
		lblDoctor_2_2 = new JLabel("Doctor Address");
		lblDoctor_2_2.setBounds(99, 203, 95, 22);
		lblDoctor_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctor_2_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(lblDoctor_2_2);
		
		docTellbl = new JLabel("Doc Tel");
		docTellbl.setBounds(220, 203, 46, 22);
		docTellbl.setHorizontalAlignment(SwingConstants.CENTER);
		docTellbl.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		editJunior.add(docTellbl);
		
		jPlayerHealth = new JEditorPane();
		jPlayerHealth.setBounds(8, 262, 493, 78);
		jPlayerHealth.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jPlayerHealth.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		editJunior.add(jPlayerHealth);
		// Display player skills in comboBox
		jPlayerPosition = new JComboBox<Object>(myController.getSkillPosList());
		jPlayerPosition.setBounds(40, 364, 115, 22);
		editJunior.add(jPlayerPosition);
		
		btnSaveDetails = new JButton("Save Details");
		btnSaveDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				// Get Junior Player details
				juniorPlayerName = jPlayerName.getText();
				juniorSRUNumber = jPlayerSRU.getText();
				juniorPlayerAddress = jPlayerAddress.getText(); 
				juniorPlayerPostcode = jPlayerPostcode.getText(); 
				juniorPlayerMobile = jPlayerMobile.getText(); 
				juniorPlayerTel = jPlayerTel.getText(); 
				juniorPlayerBirth = jJuniorBirth.getDate(); 
				juniorPlayerEmail = jPlayerEmail.getText(); 
				juniorPlayerHealth = jPlayerHealth.getText(); 
				// Get parent 1 details
				juniorParent1 = jPlayerParent1.getText();
				juniorParent1Rel = jPlayerParentRel.getText();				 
				juniorParent1Num = jParent1TelNum.getText();
				juniorParent1Address = jPlayerP1Address.getText(); 
				// Get parent 2 Details
				juniorParent2 = jPlayerP2Name.getText(); 
				juniorParent2Rel = jPlayerP2Rel.getText(); 
				juniorParent2Address = jPlayerParent2Address.getText();
				juniorParent2Number = jPlayerParent2Tel.getText(); 
				
				// Get junior Doctor details
				juniorDoc = jDoctor.getText();
				juniorDocTel = jDoctorTel.getText();
				juniorDocAddress = jPlayerDocAddress.getText();
				
				// Get Junior Skill Position
				juniorSkillPos = jPlayerPosition.getSelectedItem().toString();
				// Save Junior details
				myController.saveJuniorDetails(j, juniorPlayerName, juniorSRUNumber, juniorPlayerAddress, juniorPlayerBirth, juniorPlayerTel, juniorPlayerMobile,
						juniorPlayerPostcode, juniorPlayerEmail, juniorPlayerHealth, juniorParent1Rel, juniorParent1, juniorParent2, juniorParent1Num, juniorParent1Address,
						juniorParent2Number, juniorParent2Address, juniorParent2Rel, juniorDoc, juniorDocTel, juniorDocAddress, juniorSkillPos);
				
				
				viewAllJuniors.setVisible(true);
				editPlayer.setVisible(false);
				editJunior.setVisible(false);
				viewAllPlayers.setVisible(false);
				addAdminBTN.setEnabled(true);
				addCoachBTN.setEnabled(true);
				addPlayerBTN.setEnabled(true);
				viewAllPlayersBTN.setEnabled(true);
				viewAllCoachesBTN.setEnabled(true);
				addJunior.setEnabled(true);
				
				
			}
		});
		btnSaveDetails.setBounds(375, 354, 105, 32);
		editJunior.add(btnSaveDetails);
		
		lblNewLabel_3 = new JLabel("Position");
		lblNewLabel_3.setBounds(67, 343, 55, 17);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		editJunior.add(lblNewLabel_3);
		
		jDoctorTel = new JTextField();
		jDoctorTel.setColumns(10);
		jDoctorTel.setBounds(208, 218, 86, 20);
		editJunior.add(jDoctorTel);
		
		jJuniorBirth = new JDateChooser();
		jJuniorBirth.setBounds(203, 82, 91, 20);
		editJunior.add(jJuniorBirth);
		
		editPlayer = new JPanel();
		editPlayer.setBounds(266, 56, 511, 397);
		contentPane.add(editPlayer);
		editPlayer.setLayout(null);
		editPlayer.setVisible(false);
		
		
		eName = new JTextField();
		eName.setColumns(10);
		eName.setBounds(8, 30, 131, 20);
		editPlayer.add(eName);
		
		JLabel lblName_1 = new JLabel("Player Name");
		lblName_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblName_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblName_1.setBounds(25, 11, 89, 20);
		editPlayer.add(lblName_1);
		
		eAddress = new JTextField();
		eAddress.setColumns(10);
		eAddress.setBounds(157, 30, 141, 20);
		editPlayer.add(eAddress);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblAddress_1.setBounds(185, 11, 89, 20);
		editPlayer.add(lblAddress_1);
		
		ePostcode = new JTextField();
		ePostcode.setColumns(10);
		ePostcode.setBounds(318, 29, 131, 20);
		editPlayer.add(ePostcode);
		
		JLabel lblPostCode_1 = new JLabel("Postcode");
		lblPostCode_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPostCode_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblPostCode_1.setBounds(337, 12, 89, 20);
		editPlayer.add(lblPostCode_1);
		
		eSRU = new JTextField();
		eSRU.setColumns(10);
		eSRU.setBounds(10, 75, 131, 20);
		editPlayer.add(eSRU);
		
		JLabel lblNum_1 = new JLabel("SRU Number");
		lblNum_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblNum_1.setBounds(28, 61, 89, 20);
		editPlayer.add(lblNum_1);
		
		JLabel lblDob_1 = new JLabel("D.O.B");
		lblDob_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDob_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDob_1.setBounds(184, 62, 89, 20);
		editPlayer.add(lblDob_1);
		
		JLabel lblPhoneNo_1 = new JLabel("Phone No.");
		lblPhoneNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhoneNo_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblPhoneNo_1.setBounds(340, 62, 89, 20);
		editPlayer.add(lblPhoneNo_1);
		
		ePhone = new JTextField();
		ePhone.setColumns(10);
		ePhone.setBounds(318, 75, 131, 20);
		editPlayer.add(ePhone);
		
		JLabel lblMobileNo_1 = new JLabel("Mobile No.");
		lblMobileNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobileNo_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblMobileNo_1.setBounds(31, 107, 89, 20);
		editPlayer.add(lblMobileNo_1);
		
		eMobile = new JTextField();
		eMobile.setColumns(10);
		eMobile.setBounds(8, 123, 131, 20);
		editPlayer.add(eMobile);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblEmail_1.setBounds(189, 106, 89, 20);
		editPlayer.add(lblEmail_1);
		
		ePlayerHealth = new JEditorPane();
		ePlayerHealth.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ePlayerHealth.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		ePlayerHealth.setBounds(10, 233, 473, 71);
		editPlayer.add(ePlayerHealth);
		
		JLabel lblHealth_1 = new JLabel("Player Health issues:");
		lblHealth_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblHealth_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblHealth_1.setBounds(8, 219, 147, 20);
		editPlayer.add(lblHealth_1);
		
		eEmail = new JTextField();
		eEmail.setColumns(10);
		eEmail.setBounds(157, 123, 141, 20);
		editPlayer.add(eEmail);
		
		JLabel lblNextOfKin_1 = new JLabel("Next Of kin");
		lblNextOfKin_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNextOfKin_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblNextOfKin_1.setBounds(337, 108, 89, 20);
		editPlayer.add(lblNextOfKin_1);
		
		eKin = new JTextField();
		eKin.setColumns(10);
		eKin.setBounds(316, 124, 131, 20);
		editPlayer.add(eKin);
		
		JLabel lblDoctor_1 = new JLabel("Doctor");
		lblDoctor_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctor_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDoctor_1.setBounds(22, 162, 89, 20);
		editPlayer.add(lblDoctor_1);
		
		eDoctor = new JTextField();
		eDoctor.setColumns(10);
		eDoctor.setBounds(8, 176, 133, 20);
		editPlayer.add(eDoctor);
		
		JLabel lblDcotorPhoneNumber_1 = new JLabel("Dcotor Phone Number");
		lblDcotorPhoneNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDcotorPhoneNumber_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDcotorPhoneNumber_1.setBounds(153, 162, 147, 20);
		editPlayer.add(lblDcotorPhoneNumber_1);
		
		JLabel lblParentguardianPhone_1 = new JLabel("Parent/Guardian Phone");
		lblParentguardianPhone_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblParentguardianPhone_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblParentguardianPhone_1.setBounds(309, 163, 147, 20);
		editPlayer.add(lblParentguardianPhone_1);
		
		JButton savePlayer = new JButton("Update Player");
		savePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Get text 
				name = eName.getText().trim();
				playerAddress = eAddress.getText().trim();
				postcode = ePostcode.getText().trim();
				SRU = eSRU.getText().trim(); 
				phoneNumber = ePhone.getText().trim(); 
				mobileNumber = eMobile.getText().trim(); 
				email = eEmail.getText().trim(); 
				health = playerHealth.getText().trim();
				kin = eKin.getText().trim(); 
				doctor = eDoctor.getText().trim(); 
				doctorNum = eDocNum.getText().trim(); 
				parentNumber = eParentNum.getText().trim(); 
				sSkill = skillPosition_1.getSelectedItem().toString();
				birth = eDOB.getDate();
				//System.out.println(name + playerAddress + postcode + SRU + phoneNumber + mobileNumber + email + health + kin + doctor + doctorNum + parentNumber + birth);
				
				// Save Player details
					myController.savePlayerDetails(p, name, playerAddress, postcode, SRU, birth, phoneNumber,
							  				       mobileNumber, email, health, kin, doctor, doctorNum, parentNumber, sSkill);
					editPlayer.setVisible(false);
					viewAllPlayers.setVisible(true);
					addAdminBTN.setEnabled(true);
					addCoachBTN.setEnabled(true);
					addPlayerBTN.setEnabled(true);
					//viewAllPlayersBTN.setEnabled(true);
					viewAllCoachesBTN.setEnabled(true);
					addJunior.setEnabled(true);
				
				
			}
		});
		savePlayer.setBounds(367, 354, 116, 32);
		editPlayer.add(savePlayer);
		
		eDocNum = new JTextField();
		eDocNum.setColumns(10);
		eDocNum.setBounds(158, 176, 138, 20);
		editPlayer.add(eDocNum);
		
		eParentNum = new JTextField();
		eParentNum.setColumns(10);
		eParentNum.setBounds(316, 177, 131, 20);
		editPlayer.add(eParentNum);
		
		// Add skill list to Combo Box
		skillPosition_1 = new JComboBox<Object>(myController.getSkillPosList());
		skillPosition_1.setBounds(25, 324, 141, 22);
		editPlayer.add(skillPosition_1);
		
		JLabel lblDoctor_1_1 = new JLabel("Position");
		lblDoctor_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoctor_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 13));
		lblDoctor_1_1.setBounds(50, 307, 89, 20);
		editPlayer.add(lblDoctor_1_1);
		
		eDOB = new JDateChooser();
		eDOB.setBounds(157, 75, 141, 20);
		editPlayer.add(eDOB);
		
		
		
		AddCoachPanel = new JPanel();
		AddCoachPanel.setBounds(266, 56, 511, 397);
		contentPane.add(AddCoachPanel);
		AddCoachPanel.setLayout(null);
		AddCoachPanel.setVisible(false);
		
		
		JLabel lblNewLabel_4 = new JLabel("Coach Username");
		lblNewLabel_4.setBounds(200, 49, 132, 24);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 17));
		AddCoachPanel.add(lblNewLabel_4);
		
		coachName = new JTextField();
		coachName.setBounds(184, 145, 177, 20);
		coachName.setColumns(10);
		AddCoachPanel.add(coachName);
		
		coachUsername = new JTextField();
		coachUsername.setBounds(184, 79, 177, 20);
		coachUsername.setColumns(10);
		AddCoachPanel.add(coachUsername);
		
		JLabel lblNewLabel_4_1 = new JLabel("Coach Name");
		lblNewLabel_4_1.setBounds(225, 110, 97, 24);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 17));
		AddCoachPanel.add(lblNewLabel_4_1);
		
		coachPassword = new JTextField();
		coachPassword.setBounds(184, 205, 177, 20);
		coachPassword.setColumns(10);
		AddCoachPanel.add(coachPassword);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Coach Password");
		lblNewLabel_4_1_1.setBounds(200, 176, 127, 24);
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 17));
		AddCoachPanel.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("Coach Team");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(184, 225, 163, 34);
		AddCoachPanel.add(lblNewLabel_7);
		
		
		JButton btnAddCoach = new JButton("Add Coach");
		btnAddCoach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get text from jText fields 
				coachUserName = coachUsername.getText(); 
				CoachName = coachName.getText();
				coachPword = coachPassword.getText();
				// Get selected value from combo box 
				team = (Team) cmbTeam.getSelectedItem(); 
				
				if (CoachName.isBlank() || coachUserName.isBlank() || coachPword.isBlank()) { 
					displayMessage("Error! All fields must be full");
				} else { // Add Coach to system
					User u = myController.addCoach(coachUserName, CoachName, coachPword, team);	
					// Add Coach to jList
					dlm.addElement(u);
					// Display message to user 
					JOptionPane.showMessageDialog(null, "Coach has been added");
					
				}
			}
		});
		btnAddCoach.setBounds(203, 341, 127, 45);
		AddCoachPanel.add(btnAddCoach);				
		
		
		
		cmbTeam = new JComboBox<Object>(Team.values());
		cmbTeam.setMaximumRowCount(2);
		cmbTeam.setBounds(179, 267, 172, 22);
		AddCoachPanel.add(cmbTeam);		
		
		AddAdminPanel = new JPanel();
		AddAdminPanel.setBounds(266, 56, 511, 397);
		contentPane.add(AddAdminPanel);
		AddAdminPanel.setLayout(null);
		AddAdminPanel.setVisible(false);
		
				
		JLabel lblNewLabel_4_2 = new JLabel("Admin Username");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 17));
		lblNewLabel_4_2.setBounds(195, 54, 145, 14);
		AddAdminPanel.add(lblNewLabel_4_2);
		
		AdminName = new JTextField();
		AdminName.setColumns(10);
		AdminName.setBounds(185, 205, 176, 20);
		AddAdminPanel.add(AdminName);
		
		AdminUserName = new JTextField();
		AdminUserName.setColumns(10);
		AdminUserName.setBounds(184, 79, 177, 20);
		AddAdminPanel.add(AdminUserName);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Admin Name");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_2.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 17));
		lblNewLabel_4_1_2.setBounds(195, 170, 151, 24);
		AddAdminPanel.add(lblNewLabel_4_1_2);
		
		AdminPassword = new JTextField();
		AdminPassword.setColumns(10);
		AdminPassword.setBounds(183, 146, 177, 18);
		AddAdminPanel.add(AdminPassword);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Admin Password");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1_1.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 17));
		lblNewLabel_4_1_1_1.setBounds(193, 110, 168, 25);
		AddAdminPanel.add(lblNewLabel_4_1_1_1);
		
		JButton btnAddAdmin = new JButton("Add Admin");
		btnAddAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get text from jText fields 
				adminUsername = AdminUserName.getText(); 
				adminName = AdminName.getText();
				adminPassword = AdminPassword.getText();
				// Check if any fields are blank 
				if (adminName.isBlank() || adminUsername.isBlank() || adminPassword.isBlank()) { 
					displayMessage("Error! All fields must be full");
				} else { // Add Admin to system 
					myController.AddAdmin(adminUsername, adminName, adminPassword);
				}
			}
		});
		btnAddAdmin.setBounds(208, 295, 127, 43);
		AddAdminPanel.add(btnAddAdmin);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 0, 102));
		panel.setBounds(0, 0, 777, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Simply Rugby *Admin*");
		lblNewLabel.setBounds(218, 11, 390, 34);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("DejaVu Sans", Font.PLAIN, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save data and close page 
				myController.saveData();
				dispose();
			}
		});
		btnLogout.setBounds(678, 17, 89, 23);
		panel.add(btnLogout);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 56, 268, 397);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		// Display Adding coach panel 
		addCoachBTN = new JButton("Add Coach");
		addCoachBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				// View Add Coach panel
				AddCoachPanel.setVisible(true);
				AddAdminPanel.setVisible(false);
				AddPlayerPanel.setVisible(false);
				ViewAllCoaches.setVisible(false);
				viewAllPlayers.setVisible(false);
				addJuniorPanel.setVisible(false);
				viewAllJuniors.setVisible(false);
			}
		});
		
		// Display Adding an Admin user Panel
		addAdminBTN = new JButton("Add Admin");
		addAdminBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AddCoachPanel.setVisible(false);
				ViewAllCoaches.setVisible(false);
				AddPlayerPanel.setVisible(false);
				viewAllPlayers.setVisible(false);
				addJuniorPanel.setVisible(false);
				viewAllJuniors.setVisible(false);
				AddAdminPanel.setVisible(true);
								
			}
		});
		
		addCoachBTN.setForeground(new Color(51, 102, 204));
		addCoachBTN.setBackground(new Color(255, 255, 255));
		addCoachBTN.setBounds(0, 11, 258, 40);
		panel_1.add(addCoachBTN);
		
	
		addAdminBTN.setForeground(new Color(51, 102, 204));
		addAdminBTN.setBackground(new Color(255, 255, 255));
		addAdminBTN.setBounds(0, 62, 258, 40);
		panel_1.add(addAdminBTN);
		
		viewAllCoachesBTN = new JButton("View All Coaches");
		viewAllCoachesBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display view all coaches
				AddCoachPanel.setVisible(false);
				AddAdminPanel.setVisible(false);
				AddPlayerPanel.setVisible(false);
				viewAllPlayers.setVisible(false);
				addJuniorPanel.setVisible(false);
				viewAllJuniors.setVisible(false);
				ViewAllCoaches.setVisible(true);				
			}
		});
		
		viewAllCoachesBTN.setForeground(new Color(51, 102, 204));
		viewAllCoachesBTN.setBackground(new Color(255, 255, 255));
		viewAllCoachesBTN.setBounds(0, 215, 258, 40);
		panel_1.add(viewAllCoachesBTN);
		
		addPlayerBTN = new JButton("Add Player");
		addPlayerBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display add players panel
				AddCoachPanel.setVisible(false);
				AddAdminPanel.setVisible(false);
				ViewAllCoaches.setVisible(false);
				viewAllPlayers.setVisible(false);
				addJuniorPanel.setVisible(false);
				viewAllJuniors.setVisible(false);
				AddPlayerPanel.setVisible(true);				
			}
		});
		addPlayerBTN.setForeground(new Color(51, 102, 204));
		addPlayerBTN.setBackground(new Color(255, 255, 255));
		addPlayerBTN.setBounds(0, 113, 258, 40);
		panel_1.add(addPlayerBTN);
		
		
		
		viewAllPlayersBTN = new JButton("View/Edit Players");
		viewAllPlayersBTN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display View/Edit players panel
				AddCoachPanel.setVisible(false);
				AddAdminPanel.setVisible(false);
				AddPlayerPanel.setVisible(false);
				ViewAllCoaches.setVisible(false);
				addJuniorPanel.setVisible(false);
				viewAllJuniors.setVisible(false);
				viewAllPlayers.setVisible(true);
				editPlayer.setVisible(false);
				editJunior.setVisible(false);
				btnViewAllJunior.setEnabled(true);
				addAdminBTN.setEnabled(true);
				addCoachBTN.setEnabled(true);
				addPlayerBTN.setEnabled(true);
				//viewAllPlayersBTN.setEnabled(true);
				viewAllCoachesBTN.setEnabled(true);
				addJunior.setEnabled(true);
			}
		});
		viewAllPlayersBTN.setForeground(new Color(51, 102, 204));
		viewAllPlayersBTN.setBackground(new Color(255, 255, 255));
		viewAllPlayersBTN.setBounds(0, 266, 258, 40);
		panel_1.add(viewAllPlayersBTN);
		
		addJunior = new JButton("Add Junior");
		addJunior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display add Junior panel 
				AddCoachPanel.setVisible(false);
				AddAdminPanel.setVisible(false);
				AddPlayerPanel.setVisible(false);
				ViewAllCoaches.setVisible(false);
				viewAllPlayers.setVisible(false);
				viewAllJuniors.setVisible(false);
				addJuniorPanel.setVisible(true);
				
			}
		});
		addJunior.setForeground(new Color(51, 102, 204));
		addJunior.setBackground(Color.WHITE);
		addJunior.setBounds(0, 164, 258, 40);
		panel_1.add(addJunior);
		
		btnViewAllJunior = new JButton("View/Edit Junior Players");
		btnViewAllJunior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display view/edit junior players
				AddCoachPanel.setVisible(false);
				AddAdminPanel.setVisible(false);
				AddPlayerPanel.setVisible(false);
				ViewAllCoaches.setVisible(false);
				addJuniorPanel.setVisible(false);
				viewAllJuniors.setVisible(true);
				viewAllPlayers.setVisible(false);
				editPlayer.setVisible(false);
				editJunior.setVisible(false);
				//btnViewAllJunior.setEnabled(true); 
				addAdminBTN.setEnabled(true);
				addCoachBTN.setEnabled(true);
				addPlayerBTN.setEnabled(true);
				viewAllPlayersBTN.setEnabled(true);
				viewAllCoachesBTN.setEnabled(true);
				addJunior.setEnabled(true);
				
			}
		});
		btnViewAllJunior.setForeground(new Color(51, 102, 204));
		btnViewAllJunior.setBackground(Color.WHITE);
		btnViewAllJunior.setBounds(0, 317, 258, 40);
		panel_1.add(btnViewAllJunior);
	}
}

