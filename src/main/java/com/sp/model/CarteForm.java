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
	public String getFamily_src() {
		return family_src;
	}
	public void setFamily_src(String family_src) {
		this.family_src = family_src;
	}
	public String getFamily_name() {
		return family_name;
	}
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	public String getImg_src() {
		return img_src;
	}
	public void setImg_src(String img_src) {
		this.img_src = img_src;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public String getAffinity() {
		return affinity;
	}
	public void setAffinity(String affinity) {
		this.affinity = affinity;
	}
	
	
	
}
