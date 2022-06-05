var urlcourante = document.location.href;
var url = new URL(urlcourante);
var id = url.searchParams.get("id");

function card_buy(){
    document.location.href="http://127.0.0.1:8080/card_buy?id="+id+"&param="+"card_buy";
}

function card_sell(){
    document.location.href="http://127.0.0.1:8080/card_sell?id="+id+"&param="+"card_sell";
}