import java.util.Scanner;

public class PrimeiroPrograma {

	public static void main(String[] args) {

		// Variáveis precisam ser declaradas antes de serem utilizadas;
		// Fortemente tipada;
		// O Java é case sensitive, diferencia letras maiusculas e minusculas;
		
		System.out.println("Estudando Java");
		System.out.println("Tipos primitivos para numeros inteiros: \n" + "byte com 8 bits \n" + "short com 16 bits \n"
				+ "int com 32 bits \n" + "long com 64 bit");
		System.out.println("Tipos primitivos:\nchar, usado para textos, letras, simbolos e caracteres especiais.");
		System.out.println(
				"Boolean:\nArmazena um valor logico do tipo TRUE or FALSE. Ocupando 1 bit de espaco. Valor padrao sendo false. \n");
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		byte dia = 19;
		int mes = 05;
		int ano = 2022;
		String theo = "Estudante";
		float idade = 25;
		char sexo = 'M';
		double altura = 1.70, peso = 72.9;
		boolean hetero = false;

		System.out.println("Dados sobre o usuario: ");

		System.out.println("O valor (byte):\n" + "Dia: " + dia + "\n");
		System.out.println("O valor (int):\n" + "Mes: " + mes + "\n");
		System.out.println("O valor (int):\n" + "Ano: " + ano + "\n");
		System.out.println("O valor (String):\n" + "Ocupacao: " + theo + "\n");
		System.out.println("O valor (float):\n" + "Idade: " + idade + "\n");
		System.out.println("O valor (char):\n" + "Sexo: " + sexo + "\n");
		System.out.println("O valor (double):\n" + "Altura: " + altura + " Peso: " + peso + "\n");
		System.out.println("O valor (boolean):\n" + "Hetero: " + hetero + "\n");
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		Scanner insert = new Scanner(System.in);
		String nome;
		int id;
		String ff;

		System.out.println("Informe seu nome: \n");
		nome = insert.next();
		System.out.println("Informe sua idade: \n");
		id = insert.nextInt();
		System.out.println("Informe seu filme favorito: ");
		ff = insert.next();

		// Tipos primitivos para numeros inteiros
		// byte 8 bits
		// short 16 bits
		// int 32 bits
		// long 64 bit
		// Tipos primitivos para numeros de ponto flutuante
		// float 32 bits
		// double 64 bits

	}

}
