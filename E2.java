import java.util.ArrayList;
/*
*En el main crea un programa que llame a una función "obtenerRestos".

* La función "obtenerRestos" recibe como parámetros dos arrays de números enteros. Si los arrays son de la misma longitud debe calcular el resto de la división entre los elementos que ocupan la misma posición en cada uno de los arrays.

* La función debe devolver un array con los restos calculados.

* En el main se debe imprimir cada uno de los arrays utilizados. Tanto los dos arrays de entrada como el de salida.

* Crea una función imprimirArray que realice esa tarea.

* Haz commit. */
public class E2 {
    public ArrayList<Integer> obtenerObjetos(ArrayList<Integer> o1, ArrayList<Integer> o2) {
        ArrayList<Integer> operacion;
        for (int i = 0; i < o1.size(); i++) {
            operacion = o1.get(i)%o2.get(i);
        }
        return operacion;
    }
    public static void main(String[] args) {


       ArrayList primero = new ArrayList<Integer>();
       ArrayList segundo = new ArrayList<Integer>();

       int operando1 = Utilidades.leerEntero("Escribe tus numeros: ");
       int operando2 = Utilidades.leerEntero("Escribe otros numeros: ");
        
     
       if (primero.size() == segundo.size()) {
           
       }
    }
}
