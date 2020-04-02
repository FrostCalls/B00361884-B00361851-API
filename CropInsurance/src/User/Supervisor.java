package User;

import permissionsManager.PermManager;

public class Supervisor implements iUser {
	
	public int permissionLvl;
	


	@Override
	public int getPermissionLvl() {
			permissionLvl = PermManager.getUserPerm("Supervisor");
			return permissionLvl;
			
	}
}
