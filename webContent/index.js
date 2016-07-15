
function viewResturent()
{
	var AsianCheckBox = document.getElementById("Asian").checked;
	var ArabicCheckBox = document.getElementById("Arabic").checked;
	var MexicanCheckBox = document.getElementById("Mexican").checked;
	if(AsianCheckBox==true)
		{
		alert("asian food");
		}
	if(ArabicCheckBox==true)
	{
	alert("arabic food");
	}

	if(MexicanCheckBox==true)
	{
	alert("Mexican food");
	}
	
	//document.getElementbyID("r").innerHTML="view Asian Foods";

	}

