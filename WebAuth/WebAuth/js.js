/*
1.Browser plug-in detection
3b.Scrolling text
11.Dynamic webpage updates
12.Hit Page Counter
*/


/*
*******************************************************************
Script 1: Browser Plugin Detection (browserdetection.html)
this function detects the user browser
******************************************************************
*/
function browserDetection() { 
	if(navigator.userAgent.indexOf("Chrome") != -1 ){
		document.getElementById("browser").innerHTML=" <h6>Your browser is Chrome</h6>";
    }
    else if(navigator.userAgent.indexOf("Opera") != -1 ){
		document.getElementById("browser").innerHTML="OPERA";
    }
    else if(navigator.userAgent.indexOf("Firefox") != -1 ){
       document.getElementById("browser").innerHTML=" FIREFOX";
    }
    else if((navigator.userAgent.indexOf("MSIE") != -1 ) || (!!document.documentMode == true )){
      document.getElementById("browser").innerHTML="Internet";
    }  
    else{
       document.getElementById("browser").innerHTML="Unknown";
    }
}// end function browserDetection


/*****************************************************************
Script3b :  Scrolling Text( scrolltext.html)
this function is used for  Scrolling Text
****************************************************************
*/
var message = "Good Afternoon";
i=0;
function scrollBox() {
    i++;
    if(i > message.length) {
        i = 1;
    }
    document.forms[0].elements[0].value = message.substring(0,i)+"_";
    setTimeout("scrollBox()",100);
}

//end function scrollBox


/*
*******************************************************
Script 11:Dynamic Web Page Update(Time)(dynamicwebpageupdate.html)
this function prints the time
***********************************************************
*/

function timeDigtal(){
  var currentTime = new Date();
  //document.getElementById("digitime").style.color = "#00000";
  document.getElementById("digtime").innerHTML="<h2>TIME IS: " + currentTime + " " + "</h2>";
  
}

//end function timeDigtal

/*
*******************************************************
Script 12:Hit Page Counter(hitcounter.html)
this function prints the time
***********************************************************
*/


//end hitCount
