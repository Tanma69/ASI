package com.sp.model;

public class CarteForm {
	private String family_src;
	private String family_name;
	private String img_src;
	private String name;
	private String description;
	private int hp;
	private int energy;
	private int attack;
	private int defense;
	private String affinity;
	
	public CarteForm() {
		this.family_src = "";
		this.family_name = "";
		this.img_src = "";
		this.name = "";
		this.description = "";
		this.hp = 0;
		this.energy = 0;
		this.attack = 0;
		this.defense = 0;
		this.affinity = "";
	}
	public CarteForm(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity) {
		this.family_src = family_src;
		this.family_name = family_name;
		this.img_src = img_src;
		this.name = name;
		this.description = description;
		this.hp = hp;
		this.energy = energy;
		this.attack = attack;
		this.defense = defense;
		this.affinity = affinity;
	}
	public String getfamily_src() {
		return this.family_src;
	}
	public String getfamily_name() {
		return this.family_name;
	}
	public String getimg_src() {
		return this.img_src;
	}
	public String getname() {
		return this.name;
	}
	public String getdescription() {
		return this.description;
	}
	public int gethp() {
		return this.hp;
	}
	public int getenergy() {
		return this.energy;
	}
	public int getattack() {
		return this.attack;
	}
	public int getdefense() {
		return this.defense;
	}
	public String getaffinity() {
		return this.affinity;
	}
	
	
	public void setfamily_src() {
		this.family_src = family_src;
	}
	public void setfamily_name() {
		this.family_name = family_name;
	}
	public void setimg_src() {
		this.img_src = img_src;
	}
	public void setname() {
		this.name = name; 
	}
	public void setdescription() {
		this.description = description;
	}
	public void sethp() {
		this.hp = hp;
	}
	public void setenergy() {
		this.energy = energy;
	}
	public void setattack() {
		this.attack = attack;
	}
	public void setdefense() {
		this.defense = defense;
	}
	public void setaffinity() {
		this.affinity = affinity;
	}
}
