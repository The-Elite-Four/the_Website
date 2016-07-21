function search() {
	var text = document.getElementById('text').value.toUpperCase();
	var passIn = "/cs480/formattedResults" //This should ideally return a 404 or some error and NOT this.
	if(text == "ASIAN") { //If text captured from search box is "Asian", execute. Should be a contains "Asian" though
		//passIn = "/cs480/AsianFood";
		//LOAD FROM AsianFood.txt and display contents to html,
		//contnet is sorted as follows:
		//NAME
		//Address
		//phone
		//SOME ADDRESSES ARE SUPER WORTHLESS
	} else if(text == "BREAKFAST") {
		//passIn = "/cs480/Breakfast";
	} else if(text == "MEXICAN") {
		//passIn = "/cs480/Mexican";
	}
	/*var xhttp = new XMLHttpRequest();
	xhttp.onreadystateChange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
	      document.getElementById(passIn).innerHTML = xhttp.responseText;
	    }
	};
	xhttp.open("GET", passIn, true);
	xhttp.send();*/
	alert(passIn); //THIS IS HERE PURELY TO ENSURE MY passIn IS INITIALLIZED PROPERLY, DO NOT LEAVE IN FINAL BUILD
}

function a()
{
	alert("al");
	  var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (xhttp.readyState == 4 && xhttp.status == 200) {
	      document.getElementById("demo").innerHTML = xhttp.responseText;
	    }
	  };
	  xhttp.open("GET", "/cs480/testapi", true);
	  xhttp.send();
}