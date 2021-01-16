"""In dit programma wordt er 
kledingadvies gegeven op 
basis van de temperatuur"""  
  
# Variabele initialiseren  
temperatuur = 19;    
  
"""Function waarin een check wordt gedaan 
door middel van een if-else-if statement  
welke kleding de gebruiker kan aandoen 
op basis van de temperatuur. Parameter is 
temp."""  
def kledingAdvies(temp):    
	if temp <= 10:      
		print ("Trek je winterkleren maar aan!");      
	elif temp > 10 and temp <= 15:      
		print("Een zomerjas is voldoende momenteel.");      
	elif temp > 15 and temp <= 20:      
		print("Zonder zomerjas is het goed te doen buiten!");      
	elif temp > 20:      
		print("Trek je zomerkleren maar aan!");      
	else:      
		print("Momenteel kunnen we u geen kledingadvies geven op basis van de temperatuur.");      
	
# Function aanroepen met temperatuur als argument  
kledingAdvies(temperatuur);