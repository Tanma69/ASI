function register(){
    {
    json_obj=JSON.stringify({
        firstname  : document.getElementById("FirstName").value,
        lastname  : document.getElementById("LastName").value,
        username : document.getElementById("Surname").value,
        password : document.getElementById("password").value,
        money: 500});



    const rawResponse = fetch("http://127.0.0.1:8060/user_add", {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          },
        body: json_obj
    });

    
    }
    document.getElementById("enregistrement_OK").innerHTML = "Enregistrement effectué ";
}

function bouton(){
		register();
	
}




