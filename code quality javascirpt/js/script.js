var name;
var age;
var srl=1;
var para;


function analyseInput () {
	/*
	function to analyze what the given input is
	input: A number or string
	output: Whether the input is string or a number and whether the number is in range or not
	*/
	para =  document.getElementById("answer");
	var foo = document.getElementById("inputValue").value;
	if(document.getElementById("checkedNum").checked){
		analyzeNumber(foo);
		return;
	}
	if ((typeof name != 'undefined') && (typeof age != 'undefined')){
		if(checkGender()){
			sendMessage();
		}
		else{
			 para.innerHTML = "Select a gender first";
		}
		return;
	}

	if(foo.trim().length == 0){//checks for no input
		 para.innerHTML = "Enter something first!!";
		return;
	}
	
	if(document.getElementById("checkedNumber").checked == true && document.getElementById("checkedName").checked == true){
		 para.innerHTML = "Choose one option only";
		document.getElementById("checkedNumber").checked = false;
		return;
	}
	else if(document.getElementById("checkedName").checked == true){
		if(isNaN(foo)){
			saveName(foo);
			document.getElementById("checkedName").checked = false;
		}
		else{
			 para.innerHTML = "enter correct name";
		}
	}
	else if(document.getElementById("checkedNumber").checked == true){
		if(!isNaN(foo)){
			saveAge(foo);
			document.getElementById("checkedNumber").checked = false;
		}
		else{
			 para.innerHTML = "enter correct age";
		}
	}
	else{
		 para.innerHTML = "Choose any option first";
		document.getElementById("checkedName").checked = true;
		return;
	}
}


function saveName(foo){
	name=foo;
}

function checkGender(){
	if(document.getElementById("male").checked || document.getElementById("female").checked)
		return true;
	else
		return false;
}

function sendMessage(){
	var table = document.getElementById("myTable");
	var row = table.insertRow(srl);
	var cell1 = row.insertCell(0);
	var cell2 = row.insertCell(1);
	var cell3 = row.insertCell(2);
	var cell4 = row.insertCell(3);

	cell1.innerHTML = srl;
	cell2.innerHTML = name;
	cell3.innerHTML = age;

	if(document.getElementById("male").checked){
		 para.innerHTML = "Hi Mr. " + name +", Your details are:";
		cell4.innerHTML = "M";
	}
	else{
		 para.innerHTML = "Hi Mrs. " + name +", Your details are:";
		cell4.innerHTML = "F";
	}
	name = undefined;
	age = undefined;
	srl = srl + 1;
	
}

function saveAge(foo){
	if(foo>1000 || foo<1)
		 para.innerHTML = "Invalid input, Enter a Age between 1 and 1000!!";
	else
		age = foo;
}

function analyzeNumber(number){
	if(!isNaN(number)){
		if(number.trim() == '')
			output = "Enter Something ";
		else{
			if(number<0 || number>1000)
				output = "The number cannot be more than 1000 and less than 0";
			else if(number<50)
				output = "The number is below 50";
			else if(number>=50 && number<=100)
				output = "The number is between 50 and 100";
			else
				output = "The number is greater that 100";
		}
		para.innerHTML=output;
	}
	else{
		 para.innerHTML = "enter correct number";
	}
}

function toggleNumMode(){
	var check = document.getElementById("checkedNum").checked;
	var number = document.getElementsByClassName("toggleObj");
	if(check==false){
		for (var i = 0; i < number.length; i++) {
			number[i].style.display = "block";
		}
	}else{
		for (var i = 0; i < number.length; i++) {
			number[i].style.display = "none";
		}
	}
}