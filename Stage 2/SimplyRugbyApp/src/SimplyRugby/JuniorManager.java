package SimplyRugby;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


/**
 * The Class JuniorManager.
 */
public class JuniorManager implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The j list. */
	public static ArrayList<Junior> juniorList = new ArrayList<Junior>(); 
	
	/**
	 * Gets the junior list.
	 *
	 * @return the junior list
	 */
	public static ArrayList<Junior> getJuniorList() { 
		return juniorList; 
	}
	
	/**
	 * Serialize juniors.
	 */
//		// Serliaze Junior list
		public static void serializeJuniors() { 
			try { 
				FileOutputStream fos = new FileOutputStream("junior.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(JuniorManager.juniorList);
				System.out.println("Updating Juniors...");
				oos.close();
				fos.close();
			} catch (IOException e) { 
				System.out.println("Error! Junior Object Can't be written to file");
				return; 
			}
		}
	
	/**
	 * Deserialize juniors.
	 */
	//	
		@SuppressWarnings("unchecked")
		public static void deserializeJuniors() { 
			try {						
				FileInputStream fis = new FileInputStream("junior.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				JuniorManager.juniorList = (ArrayList<Junior>) ois.readObject();
				System.out.println("Getting Junior data...");
				ois.close();
				fis.close();		
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
