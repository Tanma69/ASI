function generate(){

    const GET_CHUCK_URL="https://asi2-backend-market.herokuapp.com/cards"; 
    let context =   {
                        method: 'GET'
                    };
        
    fetch(GET_CHUCK_URL,context)
        .then(response => response.json())
            .then(response => callback(response))
            .catch(error => err_callback(error));
}

function callback(response){
    document.getElementById("txtChuck").innerHTML = response[0].name;
}

function err_callback(error){
    console.log(error);
    
}