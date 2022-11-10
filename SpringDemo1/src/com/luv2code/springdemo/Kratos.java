package com.luv2code.springdemo;

public class Kratos implements GodOfWarCharacters {

	private UpgradeWeapons upgradeWeapons;
	
	public Kratos(UpgradeWeapons upgradeWeapons) {
		this.upgradeWeapons = upgradeWeapons;
	}
	@Override
	public String getWeapon() {
		// TODO Auto-generated method stub
		return "Blades of Chaos";
	}
	@Override
	public String getUpgrade() {
		// TODO Auto-generated method stub
		return upgradeWeapons.getUpgrade();
	}

}
