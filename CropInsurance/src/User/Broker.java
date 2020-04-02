package User;

import permissionsManager.PermManager;

public class Broker implements iUser {
	
	public int permissionLvl;

	@Override
	public int getPermissionLvl() {
		permissionLvl = PermManager.getUserPerm("Broker");
		return permissionLvl;
	}

}
