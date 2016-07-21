
function search()
{   var text = document.getElementById("text").value;
     document.getElementById("demo").innerHTML="";
	var d = "";
	var counter =0;
	  var xhttp = new XMLHttpRequest();
	  xhttp.onreadystatechange = function() {
	    if (xhttp.readyState == 4 && xhttp.status == 200) {
	    	d = xhttp.responseText;
	     
	     var element = d.split(",");
	     var t =0;
	     var para;
	     var node;
	     var e;
	     var para2;
	     var node2;
	     var e2;
	      for(var i=0;i<element.length;i++)
	    	 {
	    	     t=element[i].indexOf(text);
	    	     if(t!=-1)
	    	    	 {
                        counter++;
                       para = document.createElement("p");
                       node = document.createTextNode(element[i]);
                        para.appendChild(node);
                        e = document.getElementById("demo");
                        e.appendChild(para);
                      
                        
	    	    	 }
	    	 }
	      if(counter==0)
	    	  {
	    	  alert("not found. Please try again");
	    	  }
	       
	    }
	  };
	  
	  xhttp.open("GET", "/cs480/formattedresults", true);
	  xhttp.send();
	

}