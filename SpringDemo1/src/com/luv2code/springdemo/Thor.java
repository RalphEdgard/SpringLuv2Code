package com.luv2code.springdemo;

public class Thor implements ThorsAxe {
	
	private Upgrade upgrade;
	
	public Thor() {
		System.out.println("You are in the constructor");
	}
	public void setUpgrade (Upgrade upgrade) {
		System.out.println("You are the best");
		this.upgrade = upgrade;
	}
	@Override
	public String getAxe() {
		// TODO Auto-generated method stub
		return upgrade.getUpgrade();
	}
	

}