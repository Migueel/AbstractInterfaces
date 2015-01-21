
abstract class vehiculo {
	
	/*Clases definidas en la jerarquía que simplemente recogen las características comunes de otra serie de clases 
	 * ( sus descendientes), pero que no se van a o no se deben utilizar para crear ejemplares. Una clase que declara 
	 * la existencia de métodos pero no la implementación de dichos métodos ,estos métodos no hacen nada, solo son declarados,
	 * se considera una clase abstracta.Una clase abstracta puede contener métodos noabstractos pero al menos uno de los 
	 * métodos debe ser abstracto.
	 */
		int antig;
		String color;
		
		abstract int tieneRuedas();
		public String girar(String gira) {
			return gira;
		}
		}
		

		



