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
		simulateCardBDD.add(new Card("icon_plant_url", "Plante", "https://www.pokepedia.fr/images/thumb/e/ef/Bulbizarre-RFVF.png/250px-Bulbizarre-RFVF.png", "Bulbizarre", "Bulbizarre est un petit quadrupÃ¨de vert avec une tÃªte large.", 10, 10, 10, 10, "Eau", 95000));
		simulateCardBDD.add(new Card("icon_plant_url", "Plante", "https://www.pokepedia.fr/images/thumb/4/44/Herbizarre-RFVF.png/250px-Herbizarre-RFVF.png", "Herbizarre", "Herbizarre est un PokÃ©mon quadrupÃ¨de, semblable Ã  un dinosaure.", 20, 20, 20, 20, "Eau", 250));
		simulateCardBDD.add(new Card("icon_plant_url", "Plante", "https://www.pokepedia.fr/images/thumb/4/42/Florizarre-RFVF.png/250px-Florizarre-RFVF.png", "Florizarre", "Florizarre est un imposant quadrupÃ¨de Ã  la peau verte ayant l'aspect d'un batracien.", 40, 40, 40, 40, "Eau", 1000));
		simulateCardBDD.add(new Card("icon_fire_url", "Feu", "https://www.pokepedia.fr/images/thumb/8/89/Salam%C3%A8che-RFVF.png/250px-Salam%C3%A8che-RFVF.png", "SalamÃ¨che", "SalamÃ¨che est un PokÃ©mon bipÃ¨de et reptilien.", 10, 10, 10, 10, "Plante", 95));
		simulateCardBDD.add(new Card("icon_water_url", "Eau", "https://www.pokepedia.fr/images/thumb/c/cc/Carapuce-RFVF.png/250px-Carapuce-RFVF.png", "Carapuce", "Carapuce est une petite tortue bipÃ¨de de couleur bleue.", 10, 10, 10, 10, "Feu", 95));
		simulateCardBDD.add(new Card("icon_flying_url", "Vol", "https://www.pokepedia.fr/images/thumb/9/94/Roucool-RFVF.png/250px-Roucool-RFVF.png", "Roucoul", "Roucool est un petit PokÃ©mon aviaire au corps dodu.", 10, 10, 10, 10, "Sol", 80));
		simulateCardBDD.add(new Card("icon_normal_url", "Normal", "https://www.pokepedia.fr/images/thumb/9/9e/Rattata-RFVF.png/250px-Rattata-RFVF.png", "Rattata", "Rattata est un PokÃ©mon ressemblant Ã  un rat au corps violet et blanc pÃ¢le.", 10, 10, 10, 10, "", 80));
	}

	public void newUserCards(int user_id) {
		simulateCardBDD.add(new Card("icon_plant_url", "Plante", "https://www.pokepedia.fr/images/thumb/e/ef/Bulbizarre-RFVF.png/250px-Bulbizarre-RFVF.png", "Bulbizarre", "Bulbizarre est un petit quadrupÃ¨de vert avec une tÃªte large.", 10, 10, 10, 10, "Eau", 95000, user_id));
		simulateCardBDD.add(new Card("icon_fire_url", "Feu", "https://www.pokepedia.fr/images/thumb/8/89/Salam%C3%A8che-RFVF.png/250px-Salam%C3%A8che-RFVF.png", "SalamÃ¨che", "SalamÃ¨che est un PokÃ©mon bipÃ¨de et reptilien.", 10, 10, 10, 10, "Plante", 95, user_id));
		simulateCardBDD.add(new Card("icon_water_url", "Eau", "https://www.pokepedia.fr/images/thumb/c/cc/Carapuce-RFVF.png/250px-Carapuce-RFVF.png", "Carapuce", "Carapuce est une petite tortue bipÃ¨de de couleur bleue.", 10, 10, 10, 10, "Feu", 95, user_id));
		simulateCardBDD.add(new Card("icon_flying_url", "Vol", "https://www.pokepedia.fr/images/thumb/9/94/Roucool-RFVF.png/250px-Roucool-RFVF.png", "Roucoul", "Roucool est un petit PokÃ©mon aviaire au corps dodu.", 10, 10, 10, 10, "Sol", 80, user_id));
		simulateCardBDD.add(new Card("icon_normal_url", "Normal", "https://www.pokepedia.fr/images/thumb/9/9e/Rattata-RFVF.png/250px-Rattata-RFVF.png", "Rattata", "Rattata est un PokÃ©mon ressemblant Ã  un rat au corps violet et blanc pÃ¢le.", 10, 10, 10, 10, "", 80, user_id));
	}
	
	public List<Card> getCardList() {
		return this.simulateCardBDD;
	}
	
	public List<Card> getAvailableCards() {
		List<Card> available_cards = new ArrayList<Card>();
		for (Card myCard : getCardList()) {
			if (myCard.getUser_id() == 1) {
				available_cards.add(myCard);
			}
		}
		return available_cards;
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

	public Card getCardById(int card_id) {
		for (Card myCard : simulateCardBDD) {
			if(myCard.getCard_id() == card_id){
				return myCard;
			}
		}
		return null;
	}
	
	public Card addCard(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity, int price, int user_id) {
		Card myCard = new Card(family_src, family_name, img_src, name, description, hp, energy, attack, defense, affinity, price, user_id);
		simulateCardBDD.add(myCard);
		return myCard;
	}
	
	private boolean hasEnoughMoney(int card_id, int user_id) {
		int money_amount = 1000; //callUserMoney(user_id);
		int card_price = getCardById(card_id).getPrice();
		return money_amount > card_price;
	}
	
	private void updateUserMoney(int card_id, int user_id) {
		int new_amount = 1000 - getCardById(card_id).getPrice(); // 1000 = callUserMoney(user_id);
		//user.setMoney(new_amount)
	}
	
	public void buyACard(int card_id, int new_user_id) {
		if (hasEnoughMoney(card_id, new_user_id)) {
			getCardById(card_id).setUser_id(new_user_id);
			//call cards_buy_ok();
			updateUserMoney(card_id, new_user_id);
		} else {
			//call cards_buy_non_ok();
		}
	}
	
	public void sellACard(int card_id) {
		getCardById(card_id).setUser_id(1);
		// call cards_sell_ok();
		
		// call users for moneyUpdate
		}
	public void newUser5Cards(int user_id) {
		simulateCardBDD.add(new Card("icon_plant_url", "Pnte", "https://www.pokepedia.fr/images/thumb/e/ef/Bulbizarre-RFVF.png/250px-Bulbizarre-RFVF.png", "Bulbizarre", "Bulbizarre est un petit quadrupÃ¨de vert avec une tÃªte large.", 10, 10, 10, 10, "Eau", 95000, user_id));
		simulateCardBDD.add(new Card("icon_fire_url", "u", "https://www.pokepedia.fr/images/thumb/8/89/Salam%C3%A8che-RFVF.png/250px-Salam%C3%A8che-RFVF.png", "SalamÃ¨che", "SalamÃ¨che est un PokÃ©mon bipÃ¨de et reptilien.", 10, 10, 10, 10, "Plante", 95, user_id));
		simulateCardBDD.add(new Card("icon_water_url", "au", "https://www.pokepedia.fr/images/thumb/c/cc/Carapuce-RFVF.png/250px-Carapuce-RFVF.png", "Carapuce", "Carapuce est une petite tortue bipÃ¨de de couleur bleue.", 10, 10, 10, 10, "Feu", 95, user_id));
		simulateCardBDD.add(new Card("icon_flying_url", "Vl", "https://www.pokepedia.fr/images/thumb/9/94/Roucool-RFVF.png/250px-Roucool-RFVF.png", "Roucoul", "Roucool est un petit PokÃ©mon aviaire au corps dodu.", 10, 10, 10, 10, "Sol", 80, user_id));
		simulateCardBDD.add(new Card("icon_normal_url", "rmal", "https://www.pokepedia.fr/images/thumb/9/9e/Rattata-RFVF.png/250px-Rattata-RFVF.png", "Rattata", "Rattata est un PokÃ©mon ressemblant Ã  un rat au corps violet et blanc pÃ¢le.", 10, 10, 10, 10, "", 80, user_id));
	}
	

}
