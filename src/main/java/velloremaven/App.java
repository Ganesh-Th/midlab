package velloremaven;
import java.util.ResourceBundle;
public class App {
	public static boolean login(String userid, String ID) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String user = rb.getString("username");
		String id = rb.getString("ID");
		boolean result = (userid.equals(user) && ID.equals(id));
		return result;
	}
	

}
