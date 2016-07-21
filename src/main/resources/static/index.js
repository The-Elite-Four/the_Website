
function viewResturent() {
	/*var AsianCheckBox = document.getElementById("Asian").checked;
	var ArabicCheckBox = document.getElementById("Arabic").checked;
	var HispanicCheckBox = document.getElementById("Hispanic").checked;
	var FastFoodCheckBox = document.getElementById("Fast Food").checked;
	var ItalianCheckBox = document.getElementById("Italian").checked;
	var DessertCheckBox = document.getElementById("Dessert").checked;
	if(AsianCheckBox==true)
		{
		alert("asian food");
		}
	if(ArabicCheckBox==true)
	{
	alert("arabic food");
	}

	if(HispanicCheckBox==true)
	{
	alert("Hispanic food");
	}

	if(FastFoodCheckBox==true)
	{
	alert("Fast Food");
	}

	if(ItalianCheckBox==true)
	{
	alert("Italian");
	}

	if(DessertCheckBox==true)
	{
		
	}*/
	
	//document.getElementbyID("r").innerHTML="view Asian Foods";

}

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