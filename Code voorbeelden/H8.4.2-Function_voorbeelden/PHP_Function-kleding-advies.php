<?php

	$temperatuur = 19;  
	
	function kledingAdvies($temp) {  
		if ($temp <= 10) {    
			echo "Trek je winterkleren maar aan!";    
		}     
		elseif ($temp > 10 and $temp <= 15) {    
			echo "Een zomerjas is voldoende momenteel.";    
		}     
		elseif ($temp > 15 and $temp <= 20) {    
			echo "Zonder zomerjas is het goed te doen buiten!";    
		}    
		elseif ($temp > 20) {    
			echo "Trek je zomerkleren maar aan!";    
		}    
		else {    
			echo "Momenteel kunnen we u geen kledingadvies geven op basis van de temperatuur.";    
		}    
	}  
	
	kledingAdvies($temperatuur);

?>