async function send() 
{
    json_obj=JSON.stringify({
        name: document.getElementById("Name").value,
        description: document.getElementById("Description").value,
        imgUrl: document.getElementById("ImgURL").value,
        family: document.getElementById("FamilyName").value,
        affinity: document.getElementById("Affinity").value,
        hp: document.getElementById("HP").value,
        energy: document.getElementById("Energy").value,
        attack: document.getElementById("Attack").value,
        defense: document.getElementById("Defense").value});

    const rawResponse = await fetch("https://asi2-backend-market.herokuapp.com/card", {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          },
        body: json_obj
    });

    const GET_CHUCK_URL="https://asi2-backend-market.herokuapp.com/cards"; 
    let context =   {
                        method: 'GET'
                    };
        
    fetch(GET_CHUCK_URL,context)
        .then(response => response.json())
            .then(response => callback(response));

    function callback(response){
        window.location.href = "./affiche_carte.html?id="+response[response.length-1].id;
        console.log(window.location.href);
    }
    

}