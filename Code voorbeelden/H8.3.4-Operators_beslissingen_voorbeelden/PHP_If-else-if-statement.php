$temperatuur = 19;  
  
if ($temperatuur <= 10) {  
	echo "Trek je winterkleren maar aan!";  
}   
elseif ($temperatuur > 10 and $temperatuur <= 15) {  
	echo "Een zomerjas is voldoende momenteel.";  
}   
elseif ($temperatuur > 15 and $temperatuur <= 20) {  
	echo "Zonder zomerjas is het goed te doen buiten!";  
}  
elseif ($temperatuur > 20) {  
	echo "Trek je zomerkleren maar aan!";  
}  
else {  
	echo "Momenteel kunnen we u geen kleding advies geven op basis van de temperatuur.";  
}