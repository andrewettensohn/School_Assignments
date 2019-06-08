// a simple drawing program

function start(){

// register mousemove listener for the table
document.getElementById( "canvas" ).addEventListener( "mousemove", processMouseMove, false );

// register click listener for clear button
document.getElementById( "clearCanvas" ).addEventListener("click", erase, false );

// run the createCanvas function
createCanvas()
}

 //initialization function to insert cells into the table
function createCanvas()
{
   var side = 100;
   var tbody = document.getElementById( "tablebody" );
  
   for ( var i = 0; i < side; ++i )
   {
      var row = document.createElement( "tr" );
       
      for ( var j = 0; j < side; ++j )
      {
         var cell = document.createElement( "td" );
         row.appendChild( cell );
      } // end for

      tbody.appendChild( row );
   } // end for

} // end function createCanvas

function erase() {

      // set the table to an empty string. This removes the cells in the table
      document.getElementById( "tablebody" ).innerHTML = "";

      // run the start function agian so that the canvas can be made again
      start()
}


// processes the onmousemove event
function processMouseMove( e )

{        
   if ( e.target.tagName.toLowerCase() == "td" )
   {
      // turn the cell blue if the Ctrl key is pressed
      if ( e.ctrlKey )
      {
         e.target.setAttribute( "class", "blue" );
      } // end if

      // turn the cell red if the Shift key is pressed
      if ( e.shiftKey )
      {
         e.target.setAttribute( "class", "red" );
      } // end if

      // turn the cell white if the alt key is pressed
      if ( e.altKey )
      {
         e.target.setAttribute( "class", "white" );
      } // end if

   } // end if
 
} // end function processMouseMove

 
window.addEventListener( "load", start, false );
