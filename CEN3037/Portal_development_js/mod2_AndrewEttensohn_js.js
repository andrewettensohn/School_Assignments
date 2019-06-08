//JavaScript Document

function searchCharacter(){
    
    characterField = document.getElementById("characterField");
    textField = document.getElementById("textField").value; 

    // loop that counts the number of times a character appears in user inputted string
    for(var counter =-1,index =-2; index != -1; counter++, 
        index = textField.indexOf(characterField.value,index+1) ); // use indexOf to get position of characters
   
        // if the number of characters is greater than 0 then display the results to the user
    if (counter > 0) {
    document.getElementById( "results" ).innerHTML = 
    "<p>" + "Results:" + "<br>" + characterField.value + " was found " + counter + " time(s)" + "." + "</p>";
    }
    // if the number of characters is 0 then always display character not found
    else if (counter < 1) {
        document.getElementById( "results" ).innerHTML = 
        "<p>" + "Results:" + "<br>" + characterField.value + " not found " + "</p>";    
        }    
    }

// run search character function when sumbit button is pressed
function start() { 
   
    var button1 = document.getElementById( "characterSubmit" ); 
    button1.addEventListener("click", searchCharacter, false ); 
    }

window.addEventListener( "load", start, false); //run the start() function on page load

