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
	}

	public List<Carte> getCarteList() {
		return this.myCarteList;
	}
	public List<Carte> supprimer(){
			this.myCarteList = new ArrayList<>();
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

	public Carte addCarte(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity, int price,int carte_id,int id) {
		Carte p=new Carte(family_src, family_name, img_src, name, description, hp, energy, attack, defense, affinity, price,id);

		this.myCarteList.add(p);

		return p;
	}
}