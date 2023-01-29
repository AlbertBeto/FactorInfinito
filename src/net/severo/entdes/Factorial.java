package net.severo.entdes;
/**
 * 
 * @author Albert PB
 *
 */
public class Factorial {

	public static void main(String[] args) {
String texto="Valueo of n: ";
String texto2="Valueo of n!: ";
		int n = (int) (Math.random() * 10);
		int result = 1;
		System.out.println(texto + n);
		while (n > 1) {
			result = result * (n - 1);
		}
		System.out.println(texto2 + result);

	}

}
