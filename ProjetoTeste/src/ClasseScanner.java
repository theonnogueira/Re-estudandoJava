import java.util.Scanner;

public class ClasseScanner {

	public static void main(String[] args) {

		Scanner insert = new Scanner(System.in);
		String nome;
		System.out.println("Digite seu nome: ");
		nome = insert.nextLine();
		System.out.println("Bem-vinde " + nome);

		int idade;
		System.out.println("Digite sua idade: ");
		idade = insert.nextInt();
		System.out.println("Sua idade: " + idade);

		insert.close();
	}

}
