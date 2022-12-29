//This is a comment 



//1ask aboout statusBar(); 2function is used for a text rollover


//===================================


//start function for browser dectection

function browserDetection() { 

	if(navigator.userAgent.indexOf("Chrome") != -1 ){
		document.getElementById("browser").innerHTML="Chrome";
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

//===================================

//date and time function

function startDate() {

  document.getElementById("date").innerHTML = Date();
  setTimeout(startDate,1000);
}//end date and time function

//===================================

//hitCount
function hitCount(){

	if (localStorage.pagecount){
		localStorage.pagecount=Number(localStorage.pagecount) +1;
	}
	else{
		localStorage.pagecount=1;
	}
	document.getElementById("hits").innerHTML=localStorage.pagecount;

}//end hitCount

//===================================

//function scrollBox

var message = "Solidity, C++, Java, HTML, CSS, js,and Pthon. Build anything with those programming languages";
i=0;
function scrollBox() {
	i++;
	if(i > message.length) {
	    i = 1;
	}
	document.getElementById("DynamicText").innerHTML = message.substring(0,i)+"_";
	setTimeout("scrollBox()",250);
}

function DoNothing () {}//function to do nothing to call when we want to stop a specific event listener 

//end function scrollBox

//===================================

function validateEmail(emailField){
  var reg = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

  if (reg.test(emailField.value) == false)
  {
      alert('Invalid Email Address');
      return false;
  }
  else{
    alert('Make sure to cover your password');
    return true;
  }
}
//end function emailVerification */ 

//===================================

function pasuser(form) {
  if (form.id.value=="Eskandar@gmail.com") { 
      if (form.pass.value=="1234") {              
          //location="logincorrect.html"
          alert("You have logged in successfully!");
          document.getElementById('id01').style.display='none';
          document.getElementById('disableloginbtn').style.display='none';
      } else {
          alert("Invalid Password");
      }
  } else {  
     alert("Invalid UserID")
  }
}// end function
//===================================
//start dark mode function
function swapStylesheet(sheet) {
  document.getElementById('swap').setAttribute('href', sheet)
}

//===================================
//dynamicFrame function
function dynamicFrame() {
  var frames = window.frames;
  frames[5].location = "https://www.programiz.com/html/online-compiler/";
  document.getElementByClass('BTNForHTML').style.display='none';
}// end dynamicFrame

//===================================

function newWindow() {
  window.open("http://www.w3schools.com");
}//end newWindow

//===================================

function writeCookie(){
  if( document.myform.customer.value == "" ){
    alert("Enter some value!");
      return;
  }
  cookievalue= escape(document.myform.customer.value) + ";";
  document.cookie="name=" + cookievalue;
  alert ("Setting Cookies : " + "name=" + cookievalue );
}
function readCookie(){
document.getElementById("cookie").innerHTML= "name=" + cookievalue;
}

//end cookie
//===================================
