package SimplyRugby;

import java.io.Serializable;
import java.util.ArrayList;



/**
 * The Class SkillCatagory.
 */
public class SkillCatagory implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -246899761848284468L;

	/** The notes. */
	private String notes; 
	
	/** The cat name. */
	private String catName; 
		
	/** The s list. */
	private ArrayList<Skill> sList = new ArrayList<Skill>();	
		
	/**
	 * Gets the catName.
	 *
	 * @return the catName
	 */
	public String getCatagoryName() { 
		return catName;
	}
	
	/**
	 * Gets the notes.
	 *
	 * @return the notes
	 */
	public String getNotes() { 
		return notes; 
	}
	
	/**
	 * Sets the skill notes.
	 *
	 * @param notes the new skill notes
	 */
	public void setSkillNotes(String notes) { 
		this.notes = notes; 
	}
	/**
	 * Sets the catagory name.
	 *
	 * @param catName the new catagory name
	 */
	public void setCatagoryName(String catName) { 
		this.catName = catName; 		
	}
	
	/**
	 * Adds the skills.
	 *
	 * @param skill the skill
	 */
	public void addSkills(Skill skill) { 
		sList.add(skill);
	}
	
	/**
	 * Update skill.
	 *
	 * @param skillName the skill name
	 * @param skillValue the skill value
	 */
	public void updateSkill(String skillName, int skillValue) { 		
		for (Skill searchSkill : sList) { 
			if (skillName.equals(searchSkill.getSkillName())) { 
				searchSkill.setSkillRating(skillValue);
			} 						
		}
			
	}
	
	/**
	 * Gets the skill.
	 *
	 * @param skillName the skill name
	 * @return the skill
	 */
	public Skill getSkill(String skillName) { 
		for (Skill term : sList) { 
			if (skillName.equals(term.getSkillName())) { 
				return term;
			}
		}
		return null;
	}
	 
	/**
	 * Gets the skill name.
	 *
	 * @param sName the s name
	 * @return the skill name
	 */
	public String getSkillName(String sName) { 
		for (Skill search : sList) { 
			if (sName.equals(search.getSkillName())) { 
				return search.getSkillName();
			}
		}
		return null;
	}
	
	/**
	 * Gets the skill list.
	 *
	 * @return the skill list
	 */
	public ArrayList<Skill> getSkillList() { 
		return sList;
	}
	
	/**
	 * Gets the skill rating.
	 *
	 * @param skillName the skill name
	 *
	 * @return the skill rating
	 */
	public int getSkillRating(String skillName) {
		//int result = 0;
		// Loop through skills 
		for (Skill skill : sList) { 
			if (skillName.equals(skill.getSkillName())) {
				return skill.getSkillRating();				 
			}
		}
		return 0; 
	}
}
