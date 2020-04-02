package permissionsManager;

public class PermManager {

	public static int getUserPerm(String typeOfUser) {
		switch (typeOfUser) {
	    
	  		case "Broker": {
	  			return 1;
	  		} 
	  		case "Supervisor": {
	  			return 2;
	  		}
	  		case "SupervisorManager": {
	  			return 3;
	  		}
	  		case "SystemAdmin": {
	  			return 4;
	  		}
	  		default:
	  			return 0;
	    }
	
	}

	
	
	
}
