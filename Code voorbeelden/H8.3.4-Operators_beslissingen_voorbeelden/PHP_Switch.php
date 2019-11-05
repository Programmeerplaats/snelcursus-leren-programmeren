<?php

	$cijferNederlands = 8;  
  
	switch ($cijferNederlands) {  
		case 1:  
			echo "Je hebt er niet veel van gebakken, dit kan echt beter!";  
			break;  
		case 2:  
			echo "Dit is absoluut te laag, je kan veel beter!";  
			break;  
		case 3:  
			echo "Je had maar enkele vragen goed, heb je misschien bijles nodig?";  
			break;  
		case 4:  
			echo "Dit is niet goed, maar met wat meer inzet kan je zeker volgende keer een voldoende halen.";  
			break;  
		case 5:  
			echo "Je hebt maar net een onvoldoende gehaald, met iets meer inzet zit je aan een voldoende.";  
			break;  
		case 6:  
			echo "Je hebt een voldoende! Probeer de volgende keer wel wat meer te oefenen om zo een hoger cijfer te halen.";  
			break;  
		case 7:  
			echo "Keurig! Je hebt het goed gedaan. Misschien volgende keer voor een nog hoger cijfer gaan?";  
			break;  
		case 8:  
			echo "Heel goed! Je snapt de stof goed zo te zien.";  
			break;  
		case 9:  
			echo "Woow! Dit is supergoed! Je hebt alles goed onder de knie op enkele foutjes na.";  
			break;  
		case 10:  
			echo "Wauw!! Je snapt alles helemaal goed! Misschien kan je andere klasgenoten helpen met jouw kennis?";  
			break;  
		default:  
			echo "Er is iets misgegaan bij de invoer van het cijfer, we kunnen geen boodschap meegeven.";  
	}

?>