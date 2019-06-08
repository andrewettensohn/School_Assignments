// move image around window

// create variables
var aImage;
var mouseX;
var mouseY;
var zIndex;

// create start function with listerners
function start(){
      
//create listener for the mouse being down
document.addEventListener("mousedown", beginDrag, false);
      
//create listener for the mouse button release
document.addEventListener("mouseup", stopDrag, false);  

aImage = document.getElementById("pic"); 
zIndex = 0;
mouseX = 0;
mouseY = 0;

}

function beginDrag( e ){
      if (e.target == pic)
      {
            // setup listener to follow mouse movement
            document.addEventListener("mousemove", updateLocation, false)
      }

}

function stopDrag( e ){
      if (e.target == pic)
      {
            // setup listener to follow mouse movement
            document.removeEventListener("mousemove", updateLocation, false)
      }
}

function updateLocation( e ){
      pic.style.top = e.clientY + "px"; // location of the mouse on the Y axis
      pic.style.left = e.clientX + "px"; // location of the mouse on the x axis
}
 
window.addEventListener( "load", start, false );


