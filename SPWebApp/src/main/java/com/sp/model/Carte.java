package com.sp.model;

public class Carte {
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
	
	public Carte() {
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
	public Carte(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity) {
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
}
