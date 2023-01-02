//start function for browser dectection

function browserDetection() {

  if (navigator.userAgent.indexOf("Chrome") != -1) {
      document.getElementById("browser").innerHTML = "Chrome";
  } else if (navigator.userAgent.indexOf("Opera") != -1) {
      document.getElementById("browser").innerHTML = "OPERA";
  } else if (navigator.userAgent.indexOf("Firefox") != -1) {
      document.getElementById("browser").innerHTML = " FIREFOX";
  } else if ((navigator.userAgent.indexOf("MSIE") != -1) || (!!document.documentMode == true)) {
      document.getElementById("browser").innerHTML = "Internet";
  } else {
      document.getElementById("browser").innerHTML = "Unknown";
  }

}

// end function browserDetection

//===================================

//date and time function

function startDate() {

  document.getElementById("date").innerHTML = Date();
  setTimeout(startDate, 1000);
}

//end date and time function

//===================================

//hitCount

function hitCount() {

  if (localStorage.pagecount) {
      localStorage.pagecount = Number(localStorage.pagecount) + 1;
  } else {
      localStorage.pagecount = 1;
  }
  document.getElementById("hits").innerHTML = localStorage.pagecount;

} //end hitCount

//===================================

//function scrollBox

var message = "Solidity, C++, Java, HTML, CSS, js,and Pthon. Build anything with those programming languages";
i = 0;

function scrollBox() {
  i++;
  if (i > message.length) {
      i = 1;
  }
  document.getElementById("DynamicText").innerHTML = message.substring(0, i) + "_";
  setTimeout("scrollBox()", 250);
}

//end function scrollBox

//===================================

//function to do nothing to call when we want to stop a specific event listener 

function DoNothing() {}

//===================================

function validateEmail(emailFieldBTN) {

  var reg = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

  if (reg.test(emailFieldBTN.value) == false) {
      alert('Invalid Email Address');
      return false;
  } else {
      alert('Make sure to cover your password');
      return true;
  }
}

//end function emailVerification */ 

//===================================

//function for pop up of the sign up function when the user creates an account

//===================================

function pasuser(form) {
  if (form.id.value == "Eskandar@gmail.com") {
      if (form.pass.value == "1234") {
          //location="logincorrect.html"
          alert("You have logged in successfully!");
          document.getElementById('id01').style.display = 'none';
          document.getElementById('disableloginbtn').style.display = 'none';
      } else {
          alert("Invalid Password");
      }
  } else {
      alert("Invalid UserID")
  }
}
// end function

//===================================

//start dark mode function

function swapStylesheet(sheet) {
  document.getElementById('swap').setAttribute('href', sheet)
}

//end dark mode function

//===================================

//dynamicFrame function

function dynamicFrame() {
  var frames = window.frames;
  frames[5].location = "https://www.programiz.com/html/online-compiler/";
}

//===================================

//start change buttons name from Full-DEV to refresh

function buttonsname() {

  function changeButtonText() {

      document.getElementById('changeName').innerHTML = 'Refresh';

  }

  document.getElementById('changeName').addEventListener('click', changeButtonText);

}

//end change buttons name

//===================================

// end dynamicFrame

//===================================

//img swap function in the index html page 

function mouseOver() {
  document.getElementById("myTextCopyright").style.color = "red";
}

// end function

//===================================

function mouseOut() {
  document.getElementById("myTextCopyright").style.color = "green";
}

// end function

//===================================

//function for canvas been updated 12 times V.12.0 

var img = new Image();
img.src = 'https://www.netlabindia.com/wp-content/uploads/2018/06/contact-us-banner.jpg';
var CanvasXSize = 1900;
var CanvasYSize = 650;
var speed = 15; //lower is faster
var scale = 1.05;
var y = -4.5; //vertical offset

// Main program
var dx = 0.75;
var imgW;
var imgH;
var x = 0;
var clearX;
var clearY;
var ctx;

img.onload = function() {
  imgW = img.width * scale;
  imgH = img.height * scale;
  if (imgW > CanvasXSize) {
      x = CanvasXSize - imgW;
  } // image larger than canvas
  if (imgW > CanvasXSize) {
      clearX = imgW;
  } // image larger than canvas
  else {
      clearX = CanvasXSize;
  }
  if (imgH > CanvasYSize) {
      clearY = imgH;
  } // image larger than canvas
  else {
      clearY = CanvasYSize;
  }
  //Get Canvas Element
  ctx = document.getElementById('canvas').getContext('2d');
  //Set Refresh Rate
  return setInterval(draw, speed);
}

function draw() {
  //Clear Canvas
  ctx.clearRect(0, 0, clearX, clearY);
  //If image is <= Canvas Size
  if (imgW <= CanvasXSize) {
      //reset, start from beginning
      if (x > (CanvasXSize)) {
          x = 0;
      }
      //draw aditional image
      if (x > (CanvasXSize - imgW)) {
          ctx.drawImage(img, x - CanvasXSize + 1, y, imgW, imgH);
      }
  }
  //If image is > Canvas Size
  else {
      //reset, start from beginning
      if (x > (CanvasXSize)) {
          x = CanvasXSize - imgW;
      }
      //draw aditional image
      if (x > (CanvasXSize - imgW)) {
          ctx.drawImage(img, x - imgW + 1, y, imgW, imgH);
      }
  }
  //draw image
  ctx.drawImage(img, x, y, imgW, imgH);
  //amount to move
  x += dx;
}
// end function draw

//this function is modified to set the image in the contact us page 

//===================================

//start slidshow function 

function slideShow() {
  var imgs = document.getElementById('slideshow').children;
  interval = 5000;
  currentPic = 0;
  imgs[currentPic].style.webkitAnimation = 'fade ' + interval + 'ms';
  imgs[currentPic].style.animation = 'fade ' + interval + 'ms';
  var infiniteLoop = setInterval(function() {
      imgs[currentPic].removeAttribute('style');
      if (currentPic == imgs.length - 1) {
          currentPic = 0;
      } else {
          currentPic++;
      }
      imgs[currentPic].style.webkitAnimation = 'fade ' + interval + 'ms';
      imgs[currentPic].style.animation = 'fade ' + interval + 'ms';
  }, interval);
}

// end function slideShow

//===================================

// this function works in the contact us page when click on the button 

function statusBar() {
  var elem = document.getElementById("myBar");
  var width = 1;
  var id = setInterval(frame, 10);

  function frame() {
      elem.style.display = 'block';
      elem.textContent = width + '%'; // display the current percentage on the progress bar
      if (width >= 100) {
          clearInterval(id);
          elem.style.display = 'none';
          alert('Yay! we recieved your message successfully! we will contact you soon!');
      } else {
          width++;
          elem.style.width = width + '%';
      }
  }
}

//===================================

function newWindow() {
  window.open("https://eskandarte.w3spaces.com/");
}

//end newWindow

//===================================

//setting and getting cookies all are in contact us page

function writeCookie() {
  if (document.myform.customer.value == "") {
      alert("Enter some value!");
      return;
  }
  cookievalue = escape(document.myform.customer.value) + ";";
  document.cookie = "name=" + cookievalue;
  alert("Setting Cookies : " + "name=" + cookievalue);
}

function readCookie() {
  document.getElementById("cookie").innerHTML = "Your cookie is " + cookievalue;
}

//end cookie function

//===================================

//script for hiding the header on small devices

function myFunction() {
  var x = document.getElementById("myTopnav");
  if (x.className === "topnav") {
      x.className += " responsive";
  } else {
      x.className = "topnav";
  }
}

//end function

//===================================

//two functions for sticky signup button

function openForm() {
  document.getElementById("myForm").style.display = "block";
}

function closeForm() {
  document.getElementById("myForm").style.display = "none";
}

//end functions
//===================================