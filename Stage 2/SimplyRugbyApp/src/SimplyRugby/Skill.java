package SimplyRugby;

import java.io.Serializable;

/**
 * The Class Skill.
 */
public class Skill implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5773783881988476062L;

	/** The name. */
	private String name; 
	
	/** The rating. */
	private int rating; 
			
	/**
	 * Instantiates a new skill.
	 *
	 * @param name the name
	 * @param Rating the rating
	 */
	public Skill (String name, int Rating) { 
		this.name = name;
		this.rating = Rating;		 
	}
	
	/**
	 * Gets the skill name.
	 *
	 * @return the skill name
	 */
	public String getSkillName() { 
		return name; 
	}
	
	/**
	 * Sets the skill name.
	 *
	 * @param name the new skill name
	 */
	public void setSkillName(String name) { 
		this.name = name; 
	}
	
	/**
	 * Gets the skill rating.
	 *
	 * @return the skill rating
	 */
	public int getSkillRating() { 
		return rating; 
	}
		
	/**
	 * Sets the skill rating.
	 *
	 * @param rating the new skill rating
	 */
	public void setSkillRating(int rating) { 
		this.rating = rating; 
	}
}
