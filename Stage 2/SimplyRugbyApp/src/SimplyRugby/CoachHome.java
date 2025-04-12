package SimplyRugby;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.Serializable;

import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;
import java.awt.Color;

import javax.swing.DefaultListModel;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

import javax.swing.border.BevelBorder;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTextPane;

import javax.swing.DefaultListCellRenderer;

import javax.swing.border.LineBorder;
import javax.swing.JSpinner;

import javax.swing.JEditorPane;
import javax.swing.SpinnerNumberModel;

import javax.swing.JScrollPane;

/**
 * The Class CoachHome.
 *
 * @author Brodie Harkins <br>
 * <a><b>Name: </b></a> CoachHome
 * <br><a><b>Description:</b> </br></a>
 *  This class will act as a model class displaying information to our user <br>  
 */

public class CoachHome extends JFrame implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8166994296898840540L;
	
	/** The content pane. */
	private JPanel contentPane;
	
	/** The my controller. */
	private Controller myController; 
	
	/** The selected junior. */
	private Junior j;
	
	/** The skills panel. */
	private JPanel skillsPanel;
	
	/** The view all players panel. */
	private JPanel viewAllPlayersPanel;
	
	/** The Coach U 18. */
	public JPanel CoachU18;
	
	/** The Coach O 18. */
	public JPanel CoachO18;
	
	/** The junior detail pane. */
	private JPanel juniorDetailPane;
	
	/** The Junior list. */
	private JList<Junior> JuniorList;
	
	/** The player list. */
	private JList<Player> playerList;
	
	/** The dlm. */
	private DefaultListModel<Player> dlm;
	
	/** The list. */
	private DefaultListModel<Junior> list;
	
	
	/** The standard skill level. */
	public JSpinner standardSkillLevel;
	
	/** The stand level. */
	//private int standLevel; 
	
	/** The spin skill level. */
	public JSpinner spinSkillLevel;
	
	/** The spin level. */
	//private int spinLevel; 
	
	/** The pop skill level. */
	public JSpinner popSkillLevel;
	
	/** The pop level. */
	//private int popLevel;
	
	/** The Passing skill notes. */
	private JEditorPane PassingSkillNotes;
	
	/** The pass notes. */
	//private String passNotes; 
	
	/** The Tackling skill notes. */
	private JEditorPane TacklingSkillNotes;
	
	/** The tackling notes. */
	//private String tacklingNotes; 
	
	/** The Kicking skill notes. */
	private JEditorPane KickingSkillNotes;
	
	/** The player detail pane. */
	private JTextPane playerDetailPane;
	
	/** The kicking notes. */
	//private String kickingNotes; 
	
	/** The front skill level. */
	private JSpinner frontSkillLevel;
	
	/** The front level. */
	//private int frontLevel;
	
	/** The rear skill level. */
	private JSpinner rearSkillLevel;
	
	/** The rear level. */
	//private int rearLevel; 
	
	/** The slide skill level. */
	private JSpinner slideSkillLevel;
	
	/** The slide level. */
	//private int slideLevel;
	
	/** The scrabble skill level. */
	private JSpinner scrabbleSkillLevel;
	
	/** The scrabble level. */
	//private int scrabbleLevel;
	
	/** The goal skill level. */
	private JSpinner goalSkillLevel;
	
	/** The goal level. */
	//private int goalLevel;
	
	/** The grubber skill level. */
	private JSpinner grubberSkillLevel;
	
	/** The grubber level. */
	//private int grubberLevel;
	
	/** The punt skill level. */
	private JSpinner puntSkillLevel;
	
	/** The punt level. */
	//private int puntLevel;
	
	/** The drop skill level. */
	private JSpinner dropSkillLevel;
	
	/** The drop level. */
	//private int dropLevel;
	
	/** The p. */
	private Player p;
	
	/** The spin level. */
	private JSpinner spinLevel;
	
	/** The pop level. */
	private JSpinner popLevel;
	
	/** The stand level. */
	private JSpinner standLevel;
	
	/** The junior passing notes. */
	private JEditorPane juniorPassingNotes;
	
	/** The junior tackling notes. */
	private JEditorPane juniorTacklingNotes;
	
	/** The junior kicking notes. */
	private JEditorPane juniorKickingNotes;
	
	/** The front level. */
	private JSpinner frontLevel;
	
	/** The rear level. */
	private JSpinner rearLevel;
	
	/** The slide level. */
	private JSpinner slideLevel;
	
	/** The scrabble level. */
	private JSpinner scrabbleLevel;
	
	/** The goal level. */
	private JSpinner goalLevel;
	
	/** The grubber level. */
	private JSpinner grubberLevel;
	
	/** The punt level. */
	private JSpinner puntLevel;
	
	/** The drop level. */
	private JSpinner dropLevel;
	
	/** The save skill. */
	private JButton saveSkill;
	
	/** The Skills panel. */
	private JPanel SkillsPanel;
	
	/** The junior detail. */
	private JScrollPane juniorDetail;
	
	/** The junior details. */
	private JTextPane juniorDetails;
	
	
	/**
	 * Display message.
	 *
	 * @param message the message
	 */
	private void displayMessage(String message) { 
		JOptionPane.showMessageDialog(this, message);
	}
	
	/**
	 * Gets the skills.
	 *
	 * @param player the player
	 * @return the skills
	 */
	private void getSkills(Player player) { 
		
		// Get player skill rating and display it to the spinner
		standardSkillLevel.setValue(player.getSkillValue("Passing", "Standard"));					
		spinSkillLevel.setValue(player.getSkillValue("Passing", "Spin"));						
		popSkillLevel.setValue(player.getSkillValue("Passing", "Pop"));	
		PassingSkillNotes.setText(player.getSkillNotes("Passing"));		
		
		frontSkillLevel.setValue(player.getSkillValue("Tackling", "Front"));
		rearSkillLevel.setValue(player.getSkillValue("Tackling", "Rear"));
		slideSkillLevel.setValue(player.getSkillValue("Tackling", "Side"));
		scrabbleSkillLevel.setValue(player.getSkillValue("Tackling", "Scrabble"));
		TacklingSkillNotes.setText(player.getSkillNotes("Tackling"));
		
		goalSkillLevel.setValue(player.getSkillValue("Kicking", "Goal"));
		grubberSkillLevel.setValue(player.getSkillValue("Kicking", "Grubber"));
		puntSkillLevel.setValue(player.getSkillValue("Kicking", "Punt"));
		dropSkillLevel.setValue(player.getSkillValue("Kicking", "Drop"));
		KickingSkillNotes.setText(player.getSkillNotes("Kicking"));		
	}
	
/**
 * Gets the junior skills.
 *
 * @param Junior the junior
 * @return the junior skills
 */
private void getJuniorSkills(Junior Junior) { 	
	
		// Get Junior skill rating and display it to the spinner 
		standLevel.setValue(Junior.getSkillValue("Passing", "Standard"));						
		spinLevel.setValue(Junior.getSkillValue("Passing", "Spin"));						
		popLevel.setValue(Junior.getSkillValue("Passing", "Pop"));
		juniorPassingNotes.setText(Junior.getSkillNotes("Passing"));		
		
		frontLevel.setValue(Junior.getSkillValue("Tackling", "Front"));
		rearLevel.setValue(Junior.getSkillValue("Tackling", "Rear"));
		slideLevel.setValue(Junior.getSkillValue("Tackling", "Side"));
		scrabbleLevel.setValue(Junior.getSkillValue("Tackling", "Scrabble"));
		juniorTacklingNotes.setText(Junior.getSkillNotes("Tackling"));
		
		goalLevel.setValue(Junior.getSkillValue("Kicking", "Goal"));
		grubberLevel.setValue(Junior.getSkillValue("Kicking", "Grubber"));
		puntLevel.setValue(Junior.getSkillValue("Kicking", "Punt"));
		dropLevel.setValue(Junior.getSkillValue("Kicking", "Drop"));
		juniorKickingNotes.setText(Junior.getSkillNotes("Kicking"));		
	}

	/**
	 * Save junior skills.
	 */
	public void saveJuniorSkills() { 
	// Get selected player and the adjusted skill numbers
		j = (Junior) JuniorList.getSelectedValue();
		
		int jstandLevel = (int) standLevel.getValue();
		int jspinLevel = (int) spinLevel.getValue();
		int jpopLevel = (int) popLevel.getValue();
		String jpassNotes = juniorPassingNotes.getText();		
		
		int jfrontLevel = (int) frontLevel.getValue();
		int jrearLevel = (int) rearLevel.getValue();
		int jslideLevel = (int) slideLevel.getValue();
		int jscrabbleLevel = (int) scrabbleLevel.getValue(); 
		String jtacklingNotes = juniorTacklingNotes.getText();
		
		int jgoalLevel = (int) goalLevel.getValue(); 
		int jgrubberLevel = (int) grubberLevel.getValue();
		int jpuntLevel = (int) puntLevel.getValue(); 
		int jdropLevel = (int) dropLevel.getValue();
		String jkickingNotes = juniorKickingNotes.getText();
		//System.out.println(p);
		myController.saveJuniorSkills(j, jstandLevel, jspinLevel, jpopLevel, jpassNotes, jtacklingNotes, jkickingNotes, jfrontLevel, jrearLevel, 
				           jslideLevel, jscrabbleLevel, jgoalLevel, jgrubberLevel, jpuntLevel, jdropLevel);
		displayMessage("Junior skills have been Updated");
		//System.out.println("Player: " + p + "\nStandLevel: " + standLevel + "\nSpinLevel: " + spinLevel + "\nPopLevel: " + popLevel);				
	}

	
	/**
	 * Save skills.
	 */
	public void saveSkills() { 
		// Get selected player and the adjusted skill numbers
		p = (Player) playerList.getSelectedValue();
		
		// Get spinner values
		int standLevel = (int) standardSkillLevel.getValue();
		int spinLevel = (int) spinSkillLevel.getValue();
		int popLevel = (int) popSkillLevel.getValue();
		String passNotes = PassingSkillNotes.getText();		
		
		int frontLevel = (int) frontSkillLevel.getValue();
		int rearLevel = (int) rearSkillLevel.getValue();
		int slideLevel = (int) slideSkillLevel.getValue();
		int scrabbleLevel = (int) scrabbleSkillLevel.getValue(); 
		String tacklingNotes = TacklingSkillNotes.getText();
		
		int goalLevel = (int) goalSkillLevel.getValue(); 
		int grubberLevel = (int) grubberSkillLevel.getValue();
		int puntLevel = (int) puntSkillLevel.getValue(); 
		int dropLevel = (int) dropSkillLevel.getValue();
		String kickingNotes = KickingSkillNotes.getText();
		// Call the function in the controller & pass in the values from the spinner and save the values to that player
		myController.savePlayerSkills(p, standLevel, spinLevel, popLevel, passNotes, tacklingNotes, kickingNotes, frontLevel, rearLevel, 
				           slideLevel, scrabbleLevel, goalLevel, grubberLevel, puntLevel, dropLevel);
		displayMessage("Player Skill have been Updated");
						
	}
	
	/**
	 * Removes the player.
	 */
	public void removePlayer() { 		
		
		// Obtain the selected player
		p = (Player) playerList.getSelectedValue();
		Iterator<Player> rP = PlayerManager.getPlayerList().iterator();
		while(rP.hasNext()) { // Loop through player list 
			Player player = rP.next();
			if (player.equals(p)) { // If the result is true, remove the player
				dlm.removeElement(p);
				rP.remove();
			}
		}		
		displayMessage("Player has been Removed");
		myController.saveData();		
	}
	
	/**
	 * Removes the junior.
	 */
	public void removeJunior() { 
		j = (Junior) JuniorList.getSelectedValue();
		Iterator<Junior> rJ = JuniorManager.getJuniorList().iterator();
		while(rJ.hasNext()) { // Loop through junior list
			Junior jP = rJ.next();
			if (jP.equals(j)) { // if result is true, remove junior
				list.removeElement(j);
				rJ.remove();
			}
		}	
		displayMessage("Junior has been Removed");
		myController.saveData();
	}
	
	/**
	 * Gets the player details.
	 *
	 * @param player the player
	 * @return the player details
	 */
	public void getPlayerDetails(Player player) { 
		playerDetailPane.setText(player.toString());
	}
	
	/**
	 * Gets the junior details.
	 *
	 * @param jP the j P
	 * @return the junior details
	 */
	public void getJuniorDetails(Junior jP) { 
		juniorDetails.setText(jP.toString());
	}
	
	/**
	 * Instantiates a new coach home.
	 *
	 * @param userName the user name
	 * @param cont the cont
	 */
	public CoachHome(String userName, Controller cont) {
		
		myController = cont;
		
		addWindowListener(new WindowAdapter() { 
			@Override
			public void windowClosed(WindowEvent e) { 
				myController.handleWindowClosed("CoachHome");
			}
		});
		
		// Create new list model
		list = new DefaultListModel<Junior>();
		for (Junior j: myController.getJuniorList()) { // Get Junior List
			list.addElement(j);
		}
		// Create new list model
		dlm = new DefaultListModel<Player>();
		for (Player p: myController.getPlayerList()) { // Get playerList
			dlm.addElement(p);
		}
	
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 793, 492);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		CoachO18 = new JPanel();
		CoachO18.setBounds(0, 0, 777, 453);
		contentPane.add(CoachO18);
		CoachO18.setLayout(null);
		
		viewAllPlayersPanel = new JPanel();
		viewAllPlayersPanel.setBounds(187, 80, 590, 373);
		CoachO18.add(viewAllPlayersPanel);
		viewAllPlayersPanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Player List");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(81, 11, 108, 23);
		viewAllPlayersPanel.add(lblNewLabel_1);
		
		JPanel playerListPanel = new JPanel();
		playerListPanel.setBackground(Color.WHITE);
		playerListPanel.setBorder(null);
		playerListPanel.setBounds(41, 37, 183, 325);
		viewAllPlayersPanel.add(playerListPanel);
		playerListPanel.setLayout(null);
		
		playerList = new JList<Player>(dlm);
		playerList.setCellRenderer(new DefaultListCellRenderer() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			// Allows objects to be rendered into the jList.
			@Override 
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) { 
				Component renderer = super.getListCellRendererComponent(playerList, value, index, isSelected, cellHasFocus);
				if (renderer instanceof JLabel && value instanceof Player) { 
					((JLabel) renderer).setText(((Player) value).getPlayerName());
				}
				
				return renderer;
			}			
			
		});
		playerList.setBounds(0, 0, 183, 334);
		playerList.setMaximumSize(new Dimension(50, 50));
		playerList.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		playerList.setAlignmentX(Component.RIGHT_ALIGNMENT);
		playerList.setBackground(Color.WHITE);
		playerList.setOpaque(false);
		playerList.setLayoutOrientation(JList.VERTICAL_WRAP);
		playerList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		playerList.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(192, 192, 192), null, null));
		playerListPanel.add(playerList);
		
		JPanel playerDetails = new JPanel();
		playerDetails.setBounds(384, 11, 183, 351);
		viewAllPlayersPanel.add(playerDetails);
		playerDetails.setLayout(null);
		
		playerDetailPane = new JTextPane();
		playerDetailPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.LIGHT_GRAY, null, null));
		playerDetailPane.setBounds(0, 22, 183, 329);
		playerDetails.add(playerDetailPane);
		playerDetailPane.setEditable(false);
		
		JLabel lblNewLabel_1_1 = new JLabel("Player details");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(43, 0, 140, 23);
		playerDetails.add(lblNewLabel_1_1);
		// get the selected players details 
		JButton viewDetails = new JButton("View Details");
		viewDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// get selected player
				p = (Player) playerList.getSelectedValue();
				// get Player details
				getPlayerDetails(p);
			}
		});
		viewDetails.setBounds(247, 83, 108, 23);
		viewAllPlayersPanel.add(viewDetails);
		
		JButton viewSkills = new JButton("View Skills");
		viewSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				// Get selected player from list 
				p = (Player) playerList.getSelectedValue();	
				// get Player skills
				getSkills(p);	 	
				
				// display the skills panel 
				viewAllPlayersPanel.setVisible(false);
				skillsPanel.setVisible(true);
			}
			
		});
		viewSkills.setBounds(247, 133, 108, 23);
		viewAllPlayersPanel.add(viewSkills);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				// Get selected Player from list
				p = (Player) playerList.getSelectedValue();
				// Call the remove player function
				removePlayer();
			}
		});
		btnNewButton.setBounds(247, 256, 108, 23);
		viewAllPlayersPanel.add(btnNewButton);
		
		viewAllPlayersPanel.setVisible(false);		
		
		skillsPanel = new JPanel();
		skillsPanel.setBounds(186, 81, 590, 371);
		CoachO18.add(skillsPanel);
		skillsPanel.setLayout(null);
		skillsPanel.setVisible(false);
		
		JLabel lblNewLabel_2_1 = new JLabel("Passing");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(244, 0, 114, 20);
		skillsPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tackling");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1_1.setBounds(242, 94, 114, 24);
		skillsPanel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Kicking");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1_1_1.setBounds(244, 213, 114, 19);
		skillsPanel.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Standard:");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2.setBounds(34, 19, 64, 20);
		skillsPanel.add(lblNewLabel_2_1_2);
		
		standardSkillLevel = new JSpinner();
		standardSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		
		standardSkillLevel.setBounds(96, 19, 30, 20);
		skillsPanel.add(standardSkillLevel);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Spin:");
		lblNewLabel_2_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_1.setBounds(34, 47, 41, 20);
		skillsPanel.add(lblNewLabel_2_1_2_1);
		
		spinSkillLevel = new JSpinner(); 
		spinSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		spinSkillLevel.setBounds(96, 50, 30, 20);
		skillsPanel.add(spinSkillLevel);
		
		popSkillLevel = new JSpinner();
		popSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		popSkillLevel.setBounds(96, 79, 30, 20);
		skillsPanel.add(popSkillLevel);
		
		JLabel lblNewLabel_2_1_2_1_1 = new JLabel("Pop:");
		lblNewLabel_2_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_1_1.setBounds(34, 78, 41, 20);
		skillsPanel.add(lblNewLabel_2_1_2_1_1);
		
		PassingSkillNotes = new JEditorPane();
		PassingSkillNotes.setBorder(new LineBorder(new Color(0, 0, 0)));
		PassingSkillNotes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		PassingSkillNotes.setBounds(157, 19, 349, 60);
		skillsPanel.add(PassingSkillNotes);
		
		TacklingSkillNotes = new JEditorPane();
		TacklingSkillNotes.setBorder(new LineBorder(new Color(0, 0, 0)));
		TacklingSkillNotes.setBounds(157, 129, 349, 60);
		skillsPanel.add(TacklingSkillNotes);
		
		KickingSkillNotes = new JEditorPane();
		KickingSkillNotes.setBorder(new LineBorder(new Color(0, 0, 0)));
		KickingSkillNotes.setBounds(157, 243, 349, 60);
		skillsPanel.add(KickingSkillNotes);
		
		JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("Slide:");
		lblNewLabel_2_1_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_1_1_1.setBounds(43, 176, 41, 20);
		skillsPanel.add(lblNewLabel_2_1_2_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1_2 = new JLabel("Rear:");
		lblNewLabel_2_1_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_1_2.setBounds(42, 148, 41, 20);
		skillsPanel.add(lblNewLabel_2_1_2_1_2);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Front:");
		lblNewLabel_2_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_2.setBounds(42, 120, 41, 20);
		skillsPanel.add(lblNewLabel_2_1_2_2);
		
		frontSkillLevel = new JSpinner();
		frontSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		frontSkillLevel.setBounds(92, 120, 30, 20);
		skillsPanel.add(frontSkillLevel);
		
		rearSkillLevel = new JSpinner();
		rearSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		rearSkillLevel.setBounds(92, 151, 30, 20);
		skillsPanel.add(rearSkillLevel);
		
		slideSkillLevel = new JSpinner();
		slideSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		slideSkillLevel.setBounds(92, 180, 30, 20);
		skillsPanel.add(slideSkillLevel);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1 = new JLabel("Scrabble:");
		lblNewLabel_2_1_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_1_1_1_1.setBounds(40, 202, 56, 20);
		skillsPanel.add(lblNewLabel_2_1_2_1_1_1_1);
		
		scrabbleSkillLevel = new JSpinner();
		scrabbleSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		scrabbleSkillLevel.setBounds(93, 204, 30, 20);
		skillsPanel.add(scrabbleSkillLevel);
		
		goalSkillLevel = new JSpinner();
		goalSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		goalSkillLevel.setBounds(94, 337, 30, 20);
		skillsPanel.add(goalSkillLevel);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1 = new JLabel("Goal:");
		lblNewLabel_2_1_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_1_1_1_1_1.setBounds(34, 337, 33, 20);
		skillsPanel.add(lblNewLabel_2_1_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1_1_2 = new JLabel("Grubber:");
		lblNewLabel_2_1_2_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_1_1_1_2.setBounds(32, 310, 54, 20);
		skillsPanel.add(lblNewLabel_2_1_2_1_1_1_2);
		
		grubberSkillLevel = new JSpinner();
		grubberSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		grubberSkillLevel.setBounds(94, 311, 30, 20);
		skillsPanel.add(grubberSkillLevel);
		
		puntSkillLevel = new JSpinner();
		puntSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		puntSkillLevel.setBounds(94, 282, 30, 20);
		skillsPanel.add(puntSkillLevel);
		
		JLabel lblNewLabel_2_1_2_1_2_1 = new JLabel("Punt:");
		lblNewLabel_2_1_2_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_1_2_1.setBounds(32, 279, 41, 20);
		skillsPanel.add(lblNewLabel_2_1_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("Drop:");
		lblNewLabel_2_1_2_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_2_1_2_2_1.setBounds(32, 251, 41, 20);
		skillsPanel.add(lblNewLabel_2_1_2_2_1);
		
		dropSkillLevel = new JSpinner();
		dropSkillLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		dropSkillLevel.setBounds(94, 251, 30, 20);
		skillsPanel.add(dropSkillLevel);
		
		JButton saveSkills = new JButton("Save Skills");
		saveSkills.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// Save player skills
				saveSkills();			
			}
		});
		saveSkills.setBounds(220, 326, 164, 35);
		skillsPanel.add(saveSkills);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 777, 81);
		CoachO18.add(panel);
		panel.setForeground(new Color(153, 102, 204));
		panel.setBackground(new Color(102, 0, 102));
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coach Home (Over 18)");
		lblNewLabel.setBackground(new Color(153, 153, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("DejaVu Sans", Font.BOLD, 29));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 767, 81);
		panel.add(lblNewLabel);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save any changed data and return to login screen 
				myController.saveData();
				dispose();
			}
		});
		btnLogout.setBounds(678, 11, 89, 23);
		panel.add(btnLogout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 80, 188, 373);
		CoachO18.add(panel_1);
		panel_1.setBackground(new Color(102, 0, 153));
		panel_1.setForeground(new Color(153, 51, 255));
		panel_1.setLayout(null);
		
		JButton btnViewAllPlayers = new JButton("View All Players");
		btnViewAllPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// display view all player panel, hide Skills panel 
				skillsPanel.setVisible(false);				
				viewAllPlayersPanel.setVisible(true);
				
			}
		});
		btnViewAllPlayers.setOpaque(false);
		btnViewAllPlayers.setForeground(new Color(51, 255, 255));
		btnViewAllPlayers.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnViewAllPlayers.setBorderPainted(false);
		btnViewAllPlayers.setBackground(new Color(102, 102, 153));
		btnViewAllPlayers.setBounds(1, 11, 185, 44);
		panel_1.add(btnViewAllPlayers);
		
		CoachU18 = new JPanel();
		CoachU18.setBounds(0, 0, 777, 453);
		contentPane.add(CoachU18);
		CoachU18.setLayout(null);
		
		SkillsPanel = new JPanel();
		SkillsPanel.setBounds(186, 80, 591, 373);
		CoachU18.add(SkillsPanel);
		SkillsPanel.setLayout(null);
		SkillsPanel.setVisible(false);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Passing");
		lblNewLabel_2_1_3.setBounds(260, 5, 62, 20);
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		SkillsPanel.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Tackling");
		lblNewLabel_2_1_1_2.setBounds(260, 109, 69, 20);
		lblNewLabel_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		SkillsPanel.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Kicking");
		lblNewLabel_2_1_1_1_1.setBounds(263, 218, 59, 20);
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		SkillsPanel.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("Standard:");
		lblNewLabel_2_1_2_3.setBounds(32, 11, 48, 14);
		lblNewLabel_2_1_2_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_3);
		
		standLevel = new JSpinner();
		standLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		standLevel.setBounds(85, 8, 30, 20);
		SkillsPanel.add(standLevel);
		
		JLabel lblNewLabel_2_1_2_1_3 = new JLabel("Spin:");
		lblNewLabel_2_1_2_1_3.setBounds(32, 39, 24, 14);
		lblNewLabel_2_1_2_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_1_3);
		
		spinLevel = new JSpinner();
		spinLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		spinLevel.setBounds(85, 36, 30, 20);
		SkillsPanel.add(spinLevel);
		
		popLevel = new JSpinner();
		popLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		popLevel.setBounds(85, 66, 30, 20);
		SkillsPanel.add(popLevel);
		
		JLabel lblNewLabel_2_1_2_1_1_2 = new JLabel("Pop:");
		lblNewLabel_2_1_2_1_1_2.setBounds(32, 69, 22, 14);
		lblNewLabel_2_1_2_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_1_1_2);
		
		juniorPassingNotes = new JEditorPane();
		juniorPassingNotes.setBounds(125, 28, 387, 70);
		juniorPassingNotes.setFont(new Font("Tahoma", Font.PLAIN, 11));
		juniorPassingNotes.setBorder(new LineBorder(new Color(0, 0, 0)));
		SkillsPanel.add(juniorPassingNotes);
		
		juniorTacklingNotes = new JEditorPane();
		juniorTacklingNotes.setBounds(127, 134, 385, 80);
		juniorTacklingNotes.setBorder(new LineBorder(new Color(0, 0, 0)));
		SkillsPanel.add(juniorTacklingNotes);
		
		juniorKickingNotes = new JEditorPane();
		juniorKickingNotes.setBounds(125, 238, 385, 80);
		juniorKickingNotes.setBorder(new LineBorder(new Color(0, 0, 0)));
		SkillsPanel.add(juniorKickingNotes);
		
		JLabel lblNewLabel_2_1_2_1_1_1_3 = new JLabel("Slide:");
		lblNewLabel_2_1_2_1_1_1_3.setBounds(32, 207, 26, 14);
		lblNewLabel_2_1_2_1_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_1_1_1_3);
		
		JLabel lblNewLabel_2_1_2_1_2_2 = new JLabel("Rear:");
		lblNewLabel_2_1_2_1_2_2.setBounds(35, 126, 27, 14);
		lblNewLabel_2_1_2_1_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_2_2 = new JLabel("Front:");
		lblNewLabel_2_1_2_2_2.setBounds(33, 154, 30, 14);
		lblNewLabel_2_1_2_2_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_2_2);
		
		frontLevel = new JSpinner();
		frontLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		frontLevel.setBounds(85, 152, 30, 20);
		SkillsPanel.add(frontLevel);
		
		rearLevel = new JSpinner();
		rearLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		rearLevel.setBounds(85, 122, 30, 20);
		SkillsPanel.add(rearLevel);
		
		slideLevel = new JSpinner();
		slideLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		slideLevel.setBounds(85, 204, 30, 20);
		SkillsPanel.add(slideLevel);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_2 = new JLabel("Scrabble:");
		lblNewLabel_2_1_2_1_1_1_1_2.setBounds(32, 182, 45, 14);
		lblNewLabel_2_1_2_1_1_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_1_1_1_1_2);
		
		scrabbleLevel = new JSpinner();
		scrabbleLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		scrabbleLevel.setBounds(85, 179, 30, 20);
		SkillsPanel.add(scrabbleLevel);
		
		goalLevel = new JSpinner();
		goalLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		goalLevel.setBounds(87, 252, 30, 20);
		SkillsPanel.add(goalLevel);
		
		JLabel lblNewLabel_2_1_2_1_1_1_1_1_1 = new JLabel("Goal:");
		lblNewLabel_2_1_2_1_1_1_1_1_1.setBounds(34, 255, 25, 14);
		lblNewLabel_2_1_2_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1_1_1_2_1 = new JLabel("Grubber:");
		lblNewLabel_2_1_2_1_1_1_2_1.setBounds(34, 329, 43, 14);
		lblNewLabel_2_1_2_1_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_1_1_1_2_1);
		
		grubberLevel = new JSpinner();
		grubberLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		grubberLevel.setBounds(87, 326, 30, 20);
		SkillsPanel.add(grubberLevel);
		
		puntLevel = new JSpinner();
		puntLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		puntLevel.setBounds(87, 277, 30, 20);
		SkillsPanel.add(puntLevel);
		
		JLabel lblNewLabel_2_1_2_1_2_1_1 = new JLabel("Punt:");
		lblNewLabel_2_1_2_1_2_1_1.setBounds(34, 280, 26, 14);
		lblNewLabel_2_1_2_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_1_2_1_1);
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("Drop:");
		lblNewLabel_2_1_2_2_1_1.setBounds(33, 304, 27, 14);
		lblNewLabel_2_1_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		SkillsPanel.add(lblNewLabel_2_1_2_2_1_1);
		
		dropLevel = new JSpinner();
		dropLevel.setModel(new SpinnerNumberModel(1, 0, 5, 1));
		dropLevel.setBounds(87, 301, 30, 20);
		SkillsPanel.add(dropLevel);
		
		saveSkill = new JButton("Save Skills");
		saveSkill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save junior skills
				saveJuniorSkills();
			}
		});
		saveSkill.setBounds(239, 322, 112, 40);
		SkillsPanel.add(saveSkill);
		
		JPanel viewAllJuniorsPanel = new JPanel();
		viewAllJuniorsPanel.setBounds(186, 80, 591, 373);
		CoachU18.add(viewAllJuniorsPanel);
		viewAllJuniorsPanel.setLayout(null);
		viewAllJuniorsPanel.setVisible(false);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Junior Details");
		lblNewLabel_1_1_2.setBounds(409, 3, 140, 23);
		viewAllJuniorsPanel.add(lblNewLabel_1_1_2);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JLabel lblNewLabel_1_2 = new JLabel("Junior List");
		lblNewLabel_1_2.setBounds(88, 4, 86, 20);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		viewAllJuniorsPanel.add(lblNewLabel_1_2);
		
		JButton viewDetails_1 = new JButton("View Details");
		viewDetails_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				// Get selected Junior and get their details
				j = (Junior) JuniorList.getSelectedValue();
				getJuniorDetails(j);
			}
		});
		viewDetails_1.setBounds(230, 66, 137, 23);
		viewAllJuniorsPanel.add(viewDetails_1);
		
		JButton viewSkills_1 = new JButton("View Skills");
		viewSkills_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get selected junior and get their skills
				j = (Junior) JuniorList.getSelectedValue();
				getJuniorSkills(j);
				// Display junior skills panel
				viewAllJuniorsPanel.setVisible(false);
				SkillsPanel.setVisible(true);
			}
		});
		viewSkills_1.setBounds(230, 112, 137, 23);
		viewAllJuniorsPanel.add(viewSkills_1);
		
		juniorDetailPane = new JPanel();
		juniorDetailPane.setBounds(377, 11, 183, 351);
		viewAllJuniorsPanel.add(juniorDetailPane);
		juniorDetailPane.setLayout(null);
		
		juniorDetail = new JScrollPane(juniorDetails);
		juniorDetail.setBounds(0, 11, 183, 340);
		juniorDetailPane.add(juniorDetail);
		
		juniorDetails = new JTextPane();
		juniorDetails.setBounds(0, 11, 183, 340);
		juniorDetailPane.add(juniorDetails);
		
		JPanel DisplayJuniors = new JPanel();
		DisplayJuniors.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		DisplayJuniors.setBackground(Color.WHITE);
		DisplayJuniors.setBounds(42, 25, 183, 337);
		viewAllJuniorsPanel.add(DisplayJuniors);
		DisplayJuniors.setLayout(null);
		
		JuniorList = new JList<Junior>(list);
		JuniorList.setCellRenderer(new DefaultListCellRenderer() {

			/**
			 * 
			 */
			// Allows for junior objects to be dispalyed in the JList  
			private static final long serialVersionUID = 1L;
			
			@Override 
			public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) { 
				Component renderer = super.getListCellRendererComponent(JuniorList, value, index, isSelected, cellHasFocus);
				if (renderer instanceof JLabel && value instanceof Junior) { 
					((JLabel) renderer).setText(((Junior) value).getJuniorName());
				}
				
				return renderer;
			}
			
			
		});
		JuniorList.setVisibleRowCount(10);
		JuniorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JuniorList.setSelectionBackground(Color.CYAN);
		JuniorList.setMaximumSize(new Dimension(50, 50));
		JuniorList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		JuniorList.setFocusTraversalPolicyProvider(true);
		JuniorList.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(192, 192, 192), null, null));
		JuniorList.setBackground(Color.WHITE);
		JuniorList.setAlignmentY(1.0f);
		JuniorList.setAlignmentX(1.0f);
		JuniorList.setBounds(0, 0, 183, 337);
		DisplayJuniors.add(JuniorList);
		
		JButton btnNewButton_1 = new JButton("Delete Junior");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				// Remove the junior 
				removeJunior();
			}
		});
		btnNewButton_1.setBounds(230, 155, 137, 23);
		viewAllJuniorsPanel.add(btnNewButton_1);
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(null);
		btnPanel.setForeground(new Color(153, 51, 255));
		btnPanel.setBackground(new Color(102, 0, 153));
		btnPanel.setBounds(0, 80, 188, 373);
		CoachU18.add(btnPanel);
		
		JButton btnViewAllJuniors = new JButton("View All Juniors");
		btnViewAllJuniors.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display view all juniors panel 
				SkillsPanel.setVisible(false);
				viewAllJuniorsPanel.setVisible(true);
			}
		});
		btnViewAllJuniors.setOpaque(false);
		btnViewAllJuniors.setForeground(new Color(51, 255, 255));
		btnViewAllJuniors.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnViewAllJuniors.setBorderPainted(false);
		btnViewAllJuniors.setBackground(new Color(102, 102, 153));
		btnViewAllJuniors.setBounds(1, 11, 187, 44);
		btnPanel.add(btnViewAllJuniors);
		
		JPanel header = new JPanel();
		header.setLayout(null);
		header.setForeground(new Color(153, 102, 204));
		header.setBackground(new Color(102, 0, 102));
		header.setBounds(0, 0, 777, 81);
		CoachU18.add(header);
		
		JLabel lblCoachHomeunder = new JLabel("Coach Home (Under 18)");
		lblCoachHomeunder.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoachHomeunder.setForeground(Color.WHITE);
		lblCoachHomeunder.setFont(new Font("DejaVu Sans", Font.BOLD, 29));
		lblCoachHomeunder.setBackground(new Color(153, 153, 255));
		lblCoachHomeunder.setBounds(64, 0, 604, 81);
		header.add(lblCoachHomeunder);
		
		JButton btnLogout_1 = new JButton("Logout");
		btnLogout_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Save data and close Coach Home page
				myController.saveData();
				dispose(); 
			}
		});
		btnLogout_1.setBounds(678, 11, 89, 23);
		header.add(btnLogout_1);		
	}
}
