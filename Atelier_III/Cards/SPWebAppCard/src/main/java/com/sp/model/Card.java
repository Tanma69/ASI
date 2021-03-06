package com.sp.model;

public class Card {
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
	private int price;
	private int card_id;
	private static int card_id_count = 0;
	private int user_id;
	private static final int shop_user_id = 1;
	
	public enum WeekDay {
		   MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		}
	
	public Card() {
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
		this.price = 0;
		this.card_id = 0;
		this.user_id = 0;
	}
	
	public Card(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity, int price, int user_id) {
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
		this.price = price;
		this.card_id = newCardID();
		this.user_id = user_id;
	}
	
	public Card(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity, int price) {
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
		this.price = price;
		this.card_id = newCardID();
		this.user_id = shop_user_id;
	}

	public int newCardID() {
		card_id_count += 1;
		return card_id_count;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.affinity = price;
	}

	public int getCard_id() {
		return card_id;
	}

	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
