function generate(){

    const GET_CHUCK_URL="http://127.0.0.1:8080/cardsget"; 
    let context =   {
                        method: 'GET'
                    };
        
    fetch(GET_CHUCK_URL,context)
		.catch(error => err_callback(error))
        .then(response => response.json())
        .then(response => callback(response));
}

function err_callback(error){
    console.log(error);
}

function callback(response){
	for (carte of response){
		cardList.push(carte);
	}
	updateHtmlCards(cardList);
}

let cardList = []


function changement(card){
        let attack = document.querySelector("#cardAttackId");
        attack.textContent =card.attack;
        let vie = document.querySelector("#cardHPId");
        vie.textContent = card.hp;
        let vie2 = document.querySelector("#cardHPId2");
        vie2.textContent = card.hp;
        let defence = document.querySelector("#cardDefenceId");
        defence.textContent =card.defense;
        let prix = document.querySelector("#cardPriceId");
        prix.textContent =card.price;
        let energy = document.querySelector("#cardEnergyId");
        energy.textContent =card.energy;
        let image = document.querySelector("#cardImgId");
        image.src =card.img_src;
        let description = document.querySelector("#cardDescriptionId");
        description.textContent =card.description;
        let nom = document.querySelector("#Name");
        nom.textContent =card.name;
        let famille = document.querySelector("#Famille");
        famille.textContent =card.family_name;

		const remplacement = document.querySelector('#cardlist');
		remplacement.innerHTML = "My Card List";
		remplacement.style.backgroundColor="white";

		acheter_vendre(card);
        
}

function updateHtmlCards(cardList){
		
let template = document.querySelector("#row");
for(const card of cardList){
    let clone = document.importNode(template.content, true);

    newContent= clone.firstElementChild.innerHTML
                .replace(/{{family_src}}/g, card.family_src)
                .replace(/{{family_name}}/g, card.family_name)
                .replace(/{{img_src}}/g, card.img_src)
                .replace(/{{name}}/g, card.name)
                .replace(/{{description}}/g, card.description)
                .replace(/{{hp}}/g, card.hp)
                .replace(/{{energy}}/g, card.energy)
                .replace(/{{attack}}/g, card.attack)
                .replace(/{{defense}}/g, card.defense)
                .replace(/{{price}}/g, card.price);
    clone.firstElementChild.innerHTML= newContent;

    clone.firstElementChild.addEventListener("click", () => changement(card), false);
	
    let cardContainer= document.querySelector("#tableContent");
    cardContainer.appendChild(clone);
	}
};

function acheter_carte(card){
	const remplacement = document.querySelector('#cardlist');
	var argent = Number(document.querySelector('#argent_utilisateur').innerText);
	if ( argent >= card.price ){
		 remplacement.innerHTML = "You don't have enought money";
		 remplacement.style.backgroundColor="red";
	};
	
	
}

function acheter_vendre(card){
	
	const button_acheter = document.querySelector('#button1');

	button_acheter.addEventListener('click', event => {
		acheter_carte(card);
	});

	
}


$( document ).ready(function() {
	
generate();

});

   










