package clase;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Pablo Valor
 * @version 0.0.1
 * @return devuelve el resultado de una suma
 * @param suma almacena el resultado de la operación
 * 
 **/
public class ClaseParaDepurar {

	private double suma;
	private List<Double> lista;

	public ClaseParaDepurar() {
		System.out.println("construyendo clase");
	}

	public double echaCuentas() {
		lista = new LinkedList<Double>();
		for (int i = 0; i < 100; i++) {
			lista.add((double) i);
		}
		suma = 0.0;
		for (Double valor : lista) {
			suma += valor;
		}
		return suma;
	}
}