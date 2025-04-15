package EjerciciosExcepcionesARRAY;

public class Main {

	    public static void main(String[] args) {
	        // Se crea un array de String[], pero se referencia como Object[]
	        Object[] guille = new Integer[6];

	        try {
	            // Intentamos almacenar un número entero en un array de String
	            guille[0] = "sdW"; // Esto causará ArrayStoreException
	        } catch (ArrayStoreException e) { 
	            System.out.println("Se ha producido un " + e.getMessage());
	        }
	    }
}