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
  
/*		Carte p1=new Carte("John", "pink", "super pink", "http://ekladata.com/9-cPSlYvrenNHMVawFmf_gLx8Jw.gif");
		Carte p2=new Carte("Roberto", "blue", "super lazy", "http://ekladata.com/JEVyY9DkwX4vVkakeBfikSyPROA.gif");
		Carte p3=new Carte("Anna", "orange", "super music girl", "http://ekladata.com/fMJl--_v-3CmisaynTHju1DMeXE.gif");
		Carte p4=new Carte("Angry Joe", "purple", "super angry power", "http://ekladata.com/AmbNNNvv-4YFEMZR8XD8e54WoHc.gif");
		Carte p5=new Carte("Ursula", "green", "super cloning power", "http://ekladata.com/CXJhi2YLUbNz6__e0Ct6ZP-XOds.gif");

		myCarteList.add(p1);
		myCarteList.add(p2);
		myCarteList.add(p3);
		myCarteList.add(p4);
		myCarteList.add(p5);*/
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

	public Carte addCarte(String family_src,String family_name,String img_src, String name, String description, int hp, int energy, int attack, int defense, String affinity) {
		Carte p=new Carte(family_src, family_name, img_src, name, description, hp, energy, attack, defense, affinity);
		this.myCarteList.add(p);
		return p;
	}
}
