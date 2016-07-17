
function viewResturent()
{
	var AsianCheckBox = document.getElementById("Asian").checked;
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
	alert("Dessert");
	}
	
	//document.getElementbyID("r").innerHTML="view Asian Foods";

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
	  xhttp.open("GET", "/cs480/formattedresults", true);
	  xhttp.send();
	}