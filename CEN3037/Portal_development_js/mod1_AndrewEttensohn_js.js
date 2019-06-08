//JavaScript Document

/* Intiliaze counter array and global variables
The inputField and output variables had to become global because they were loading before the DOM in the start() function, 
there's probably a better way to do it but making the global seemed to be the easiest fix.
*/
var counters = [0, 0, 0, 0, 0, 0, 0, 0, 0];
var ranges = ["$200-299", "$300-399", "$400-499", "$500-599", "$600-699", "$700-799", "$800-899", "$900-999", "$1000 and over"];
var inputField;
var output;

// Get element IDs and add eventlistner. When the user presses the submit button the addSalary() function runs
function start() {
output = document.getElementById("output");
inputField = document.getElementById("salesAmountField");
var button1 = document.getElementById( "salesSubmitBtn" );
button1.addEventListener("click", addSalary, false );
}

// Calculate salary and check which range the salary falls under
function addSalary() {
	var sales = parseFloat( inputField.value );	
	var pay = (sales/100) * 9 + 200;					
	var grossPay = document.getElementById("grossPay");
	grossPay.innerHTML = "Gross Pay: " + pay;

	if (pay > 199 && pay < 300) {
		counters[0]++;
	}
	else if (pay > 299 && pay < 400) {
		counters[1]++;
	}
	else if (pay > 399 && pay < 500) {
		counters[2]++;
	}
	else if (pay > 499 && pay < 600) {
		counters[3]++;
	}
	else if (pay > 599 && pay < 700) {
		counters[4]++;
	}
	else if (pay > 699 && pay < 800) {
		counters[5]++;
	}
	else if (pay > 799 && pay < 900) {
		counters[6]++;
	}
	else if (pay > 899 && pay < 1000) {
		counters[7]++;
	}
	else if (pay > 1000) {
		counters[8]++;
	}

	updateTextarea(); //after the addSalary() function is finished finding what range the number belongs in and updated the counter, the updateTextArea() will run
}

// Display the output to the user
function updateTextarea() {
	output.innerHTML = "Number of people who earned salaries in the following ranges: " + "\n";

	for (var i = 0; i < counters.length; i++) { // Display the value of elements in the counter array
		var rangeChars = ranges[i].length; // Create another array that helps space everything out
		var spaces = "";
		for (var j = 0; j <= (20 - rangeChars); j++) {
			spaces += " ";
		}

		output.innerHTML += (ranges[i] + spaces + counters[i] + "\n"); 
	}
}

window.addEventListener( "load", start, false); //run the start() function on page load