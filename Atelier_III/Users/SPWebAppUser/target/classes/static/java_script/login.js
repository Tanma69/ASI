function login(){
    {
        const GET_CHUCK_URL="http://127.0.0.1:8060/all_user"; 
    let context =   {
                        method: 'GET'
                    };
        
    fetch(GET_CHUCK_URL,context)
		.catch(error => err_callback(error))
        .then(response => response.json())
        .then(response => callback(response));
}
}

function err_callback(error){
    console.log(error);
}

function callback(response){
    var surname=document.getElementById("Surname").value;
    var password=document.getElementById("password").value;

	for (user of response){
		if(user.password == password && user.username==surname){
            document.getElementById("login_OK").innerHTML = "Login effectué ";
            document.location.href="http://127.0.0.1:8080/menu?id="+user.id;
        }
	}
}

function bouton(){
		login();
}


