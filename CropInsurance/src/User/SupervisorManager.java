package User;

import permissionsManager.PermManager;

public class SupervisorManager implements iUser {
	
	public int permissionLvl;

	
	@Override
	public int getPermissionLvl() {
		// TODO Auto-generated method stub
		permissionLvl = PermManager.getUserPerm("SupervisorManager");
		return permissionLvl;
		
	}

}
