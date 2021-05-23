import java.util.HashMap;

public class Credentials {
	HashMap<String, String> loginInfo = new HashMap<>();
	
	Credentials(){
		loginInfo.put("BH", "pass");
		loginInfo.put("lucas", "1234");
		
	}
	
	protected HashMap<String, String> getLoginInfo() {
		return loginInfo;
	}
	
}
