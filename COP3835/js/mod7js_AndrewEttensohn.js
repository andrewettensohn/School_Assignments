//JavaScript Document

function start()
{
// Get input for background color and change webpage
var backgroundColor = prompt( "Enter a color name for the " + "background of this page", "");
    document.body.style.backgroundColor = backgroundColor;

	// Get input for font color and change webpage
var fontColor = prompt( "Enter a color name for the " + "font of this page", "");
	document.body.style.color = fontColor;

	// Get input for font size and change webpage
var fontSize = prompt( "Enter the font size " + " of this page", "");
	document.body.style.fontSize = fontSize;
}
window.addEventListener("load", start, false);


