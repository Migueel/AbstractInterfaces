
abstract class vehiculo {
	
	/*Clases definidas en la jerarqu�a que simplemente recogen las caracter�sticas comunes de otra serie de clases 
	 * ( sus descendientes), pero que no se van a o no se deben utilizar para crear ejemplares. Una clase que declara 
	 * la existencia de m�todos pero no la implementaci�n de dichos m�todos ,estos m�todos no hacen nada, solo son declarados,
	 * se considera una clase abstracta.Una clase abstracta puede contener m�todos noabstractos pero al menos uno de los 
	 * m�todos debe ser abstracto.
	 */
		int antig;
		String color;
		
		abstract int tieneRuedas();
		public String girar(String gira) {
			return gira;
		}
		}
		

		



