
interface vehiculo2 {
	
	/*Una interface es una variante de una clase abstractacon la condición de que todos sus métodos deben ser abstractos.
	 *  Si la interface va a tener atributos, éstosdeben llevar las palabras reservadas static final y conun valor inicial
	 *   ya que funcionan como constantes
	 */ 
		static int antig = 0;
		final String color = null;
		
	    abstract int tieneRuedas();
	    abstract String girar();
	}

