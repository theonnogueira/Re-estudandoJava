import java.util.Scanner;

public class Constante {
	private static final double LARGURA = 10.0;

	public static void main(String args[]) {
		Scanner insert = new Scanner(System.in);

		System.out.println("Entre com o comprimento: ");
		double compr = insert.nextDouble();

		double area = calculaArea(LARGURA, compr);
		System.out.println("A area e: " + area);
	}

	private static double calculaArea(double largura, double comprimento) {
		return largura * comprimento;
	}
}
