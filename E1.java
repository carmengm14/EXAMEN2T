/**
 * En el main crea un programa que pida dos cadenas de texto al usuario. El programa debe concatenar las dos cadenas y mostrar la cadena de texto resultante al revés.
 * Por ejemplo, para las cadenas de texto "hola" y "adios" el programa debería imprimir "soidaaloh".
 */
public class E1 {

    public static String concatenarCadenas(String c1, String c2){
		String concatenada = c1.concat(c2);
        String invertida = "";
		for(int i = concatenada.length() - 1 ; i >= 0; i--){
			invertida = invertida + concatenada.charAt(i) + "";
		}
		return invertida;
	}
    
    public static void main(String[] args) {
        String cadena1 = Utilidades.leerCadena("Primera cadena: ");
        String cadena2 = Utilidades.leerCadena("Segunda cadena: ");
        System.out.println(concatenarCadenas(cadena1, cadena2));
    }
}