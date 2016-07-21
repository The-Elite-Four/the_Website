function search() {
	var text = document.getElementById('text').value;
	var passIn = "/cs480/formattedResults" //This should ideally return a 404 or some error and NOT this.
	if(text == "Asian") { //If text captured from search box is "Asian", execute. Should be a contains "Asian" though
		passIn = "AsianFood";
	}
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystateChange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
	      document.getElementById(passIn).innerHTML = xhttp.responseText;
	    }
	};
	xhttp.open("GET", passIn, true);
	xhttp.send();
	alert(passIn);
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