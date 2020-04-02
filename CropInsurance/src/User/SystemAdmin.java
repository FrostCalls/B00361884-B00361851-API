package User;

import permissionsManager.PermManager;

public class SystemAdmin implements iUser {
	

	public int permissionLvl;
	
	@Override
	public int getPermissionLvl() {
			permissionLvl = PermManager.getUserPerm("SystemAdmin");
			return permissionLvl;
	}
}