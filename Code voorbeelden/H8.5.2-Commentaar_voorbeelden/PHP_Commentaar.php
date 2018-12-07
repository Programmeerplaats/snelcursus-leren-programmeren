/* 
Welkomstbericht aan gebruiker 
door middel van een function 
*/  
  
// Variabele initialiseren  
$voornaam = "Henk";    
  
/* 
Function waarin bezoeker welkom 
wordt geheten. $voornaamGebruiker 
is de parameter. 
*/  
function welkomstbericht($voornaamGebruiker) {    
  echo "Welkom " . $voornaamGebruiker . ", leuk dat je er bent!";     
}    
  
# Function aanroepen met $voornaam als argument  
welkomstbericht($voornaam);