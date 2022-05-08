/*FETCH */
const GET_CHUCK_URL="https://asi2-backend-market.herokuapp.com/cards"; 
let context =   {
                    method: 'GET'
                };
    
fetch(GET_CHUCK_URL,context)
    .then(response => response.json())
        .then(response => callback(response))
        .catch(error => err_callback(error));


        /*FONCTION CALLBACK*/
function callback(response){
    template(response);
}

var urlParams = new URLSearchParams(window.location.search);
var id = urlParams.get('id');


function template(response){
    let template = document.querySelector("#selectedCard");
    let clone = document.importNode(template.content, true);
    for(const response1 of response){
        if (response1.id==id){
    newContent= clone.firstElementChild.innerHTML
                .replace(/{{family_src}}/g, 	response1.imgUrl)
                .replace(/{{family_name}}/g, response1.family)
                .replace(/{{img_src}}/g, response1.imgUrl)
                .replace(/{{name}}/g, response1.name)
                .replace(/{{description}}/g, response1.description)
                .replace(/{{hp}}/g, response1.hp)
                .replace(/{{energy}}/g, response1.energy)
                .replace(/{{attack}}/g, response1.attack)
                .replace(/{{defense}}/g, response1.defence)
                .replace(/{{affinity}}/g, response1.affinity);

    clone.firstElementChild.innerHTML= newContent;

    let cardContainer= document.querySelector("#cardContainer");
    cardContainer.appendChild(clone);
        }
    }
}