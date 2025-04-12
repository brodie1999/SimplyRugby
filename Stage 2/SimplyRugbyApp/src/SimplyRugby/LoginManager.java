package SimplyRugby;

import java.io.Serializable;

/**
 * The Class LoginManager.
 */
public class LoginManager implements Serializable{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4747594860911479294L;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
				
		Controller myController = new Controller();	
		
		myController.getData();
	}

}
