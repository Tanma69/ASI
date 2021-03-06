package com.sp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.sp.model.Carte;

@Service
public class CarteDao {
	private List<Carte> myCarteList;
	private Random randomGenerator;

	public CarteDao() {
		myCarteList=new ArrayList<>();
		randomGenerator = new Random();
		createCarteList();
	}

	private void createCarteList() {
  
		Carte p5=new Carte("Ursula", "green", "http://ekladata.com/CXJhi2YLUbNz6__e0Ct6ZP-XOds.gif", "poney1","une super carte", 10 , 20, 30, 40,"afinity",150);

		myCarteList.add(p5);
		
		Carte p1=new Carte("Ursula", "green", "https://media.giphy.com/media/1ZxDCMi1zftxY13GpO/giphy.gif", "poney2","une super carte 2", 10 , 20, 30, 40,"afinity",200);

		myCarteList.add(p1);
	}
	public List<Carte> getCarteList() {
		return this.myCarteList;
	}
	public Carte getCarteByName(String name){
		for (Carte carteBean : myCarteList) {
			if(carteBean.getName().equals(name)){
				return carteBean;
			}
		}
		return null;
	}
	public Carte getRandomCarte(){
		int index=randomGenerator.nextInt(this.myCarteList.size());
		return this.myCarteList.get(index);
	}

	public Carte addCarte(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity, int price) {
		Carte p=new Carte(family_src, family_name, img_src, name, description, hp, energy, attack, defense, affinity, price);
		this.myCarteList.add(p);
		return p;
	}
}