package com.sp.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.sp.model.Card;

@Service
public class CardDAO {
	private List<Card> simulateCardBDD;
	private Random randomGenerator;
	//private List<Card> base5cards;

	public CardDAO() {
		simulateCardBDD = new ArrayList<Card>();
		//base5cards = new ArrayList<Card>();
		randomGenerator = new Random();
		createSimulateCardBDD();
		//setbase5cards();
		newUserCards(4);
		newUserCards(5);
	}

	private void createSimulateCardBDD() {
		simulateCardBDD.add(new Card("icon_plant_url", "Plante", "https://www.pokepedia.fr/images/thumb/e/ef/Bulbizarre-RFVF.png/250px-Bulbizarre-RFVF.png", "Bulbizarre", "Bulbizarre est un petit quadrupède vert avec une tête large.", 10, 10, 10, 10, "Eau", 95000));
		simulateCardBDD.add(new Card("icon_plant_url", "Plante", "https://www.pokepedia.fr/images/thumb/4/44/Herbizarre-RFVF.png/250px-Herbizarre-RFVF.png", "Herbizarre", "Herbizarre est un Pokémon quadrupède, semblable à un dinosaure.", 20, 20, 20, 20, "Eau", 250));
		simulateCardBDD.add(new Card("icon_plant_url", "Plante", "https://www.pokepedia.fr/images/thumb/4/42/Florizarre-RFVF.png/250px-Florizarre-RFVF.png", "Florizarre", "Florizarre est un imposant quadrupède à la peau verte ayant l'aspect d'un batracien.", 40, 40, 40, 40, "Eau", 1000));
		simulateCardBDD.add(new Card("icon_fire_url", "Feu", "https://www.pokepedia.fr/images/thumb/8/89/Salam%C3%A8che-RFVF.png/250px-Salam%C3%A8che-RFVF.png", "Salamèche", "Salamèche est un Pokémon bipède et reptilien.", 10, 10, 10, 10, "Plante", 95));
		simulateCardBDD.add(new Card("icon_water_url", "Eau", "https://www.pokepedia.fr/images/thumb/c/cc/Carapuce-RFVF.png/250px-Carapuce-RFVF.png", "Carapuce", "Carapuce est une petite tortue bipède de couleur bleue.", 10, 10, 10, 10, "Feu", 95));
		simulateCardBDD.add(new Card("icon_flying_url", "Vol", "https://www.pokepedia.fr/images/thumb/9/94/Roucool-RFVF.png/250px-Roucool-RFVF.png", "Roucoul", "Roucool est un petit Pokémon aviaire au corps dodu.", 10, 10, 10, 10, "Sol", 80));
		simulateCardBDD.add(new Card("icon_normal_url", "Normal", "https://www.pokepedia.fr/images/thumb/9/9e/Rattata-RFVF.png/250px-Rattata-RFVF.png", "Rattata", "Rattata est un Pokémon ressemblant à un rat au corps violet et blanc pâle.", 10, 10, 10, 10, "", 80));
	}
	/*
	private void setbase5cards() {
		base5cards.add(getCardByName("Bulbizarre"));
		base5cards.add(getCardByName("Salamèche"));
		base5cards.add(getCardByName("Carapuce"));
		base5cards.add(getCardByName("Roucoul"));
		base5cards.add(getCardByName("Rattata"));
	}*/
	
	private void newUserCards(int user_id) {
		simulateCardBDD.add(new Card("icon_plant_url", "Plante", "https://www.pokepedia.fr/images/thumb/e/ef/Bulbizarre-RFVF.png/250px-Bulbizarre-RFVF.png", "Bulbizarre", "Bulbizarre est un petit quadrupède vert avec une tête large.", 10, 10, 10, 10, "Eau", 95000, user_id));
		simulateCardBDD.add(new Card("icon_fire_url", "Feu", "https://www.pokepedia.fr/images/thumb/8/89/Salam%C3%A8che-RFVF.png/250px-Salam%C3%A8che-RFVF.png", "Salamèche", "Salamèche est un Pokémon bipède et reptilien.", 10, 10, 10, 10, "Plante", 95, user_id));
		simulateCardBDD.add(new Card("icon_water_url", "Eau", "https://www.pokepedia.fr/images/thumb/c/cc/Carapuce-RFVF.png/250px-Carapuce-RFVF.png", "Carapuce", "Carapuce est une petite tortue bipède de couleur bleue.", 10, 10, 10, 10, "Feu", 95, user_id));
		simulateCardBDD.add(new Card("icon_flying_url", "Vol", "https://www.pokepedia.fr/images/thumb/9/94/Roucool-RFVF.png/250px-Roucool-RFVF.png", "Roucoul", "Roucool est un petit Pokémon aviaire au corps dodu.", 10, 10, 10, 10, "Sol", 80, user_id));
		simulateCardBDD.add(new Card("icon_normal_url", "Normal", "https://www.pokepedia.fr/images/thumb/9/9e/Rattata-RFVF.png/250px-Rattata-RFVF.png", "Rattata", "Rattata est un Pokémon ressemblant à un rat au corps violet et blanc pâle.", 10, 10, 10, 10, "", 80, user_id));
	}
	
	public List<Card> getCardList() {
		return this.simulateCardBDD;
	}
	
	public Card getCardByName(String name){
		for (Card myCard : simulateCardBDD) {
			if(myCard.getName().equals(name)){
				return myCard;
			}
		}
		return null;
	}
	
	public Card getCardByName(String name, List<Card> myList){
		for (Card myCard : myList) {
			if(myCard.getName().equals(name)){
				return myCard;
			}
		}
		return null;
	}
	
	public Card getRandomCard(){
		int myCard = randomGenerator.nextInt(this.simulateCardBDD.size());
		return this.simulateCardBDD.get(myCard);
	}

	public Card addCard(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity, int price, int user_id) {
		Card myCard = new Card(family_src, family_name, img_src, name, description, hp, energy, attack, defense, affinity, price, user_id);
		simulateCardBDD.add(myCard);
		return myCard;
	}
	
	private void changeOwner(int card_id, int new_user_id) {
		for (Card myCard : simulateCardBDD) {
			if(myCard.getCard_id() == card_id){
				myCard.setUser_id(new_user_id);
			}
		}
	}

}
