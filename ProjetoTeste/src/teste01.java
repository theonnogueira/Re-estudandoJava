
import java.util.Random;

public class teste01 {
	public static void main(String args[]) {

		// Gerar numeros aleatorios com class Random;

		Random aleatorio = new Random();
		int valor = aleatorio.nextInt(30) + 1;
		System.out.println("Numero gerado: " + valor);

		// Numeros aleatorios com ponto flutuante;
		Random aleatorioPontoFlutuante = new Random();
		double value = aleatorioPontoFlutuante.nextDouble(30.5) * 100;
		System.out.println("Numero gerado: " + value);
	}

}
