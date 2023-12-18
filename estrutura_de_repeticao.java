package pomarola;
//importar função para inserir informações pelo teclado 
import java.util.Scanner;
public class estrutura_de_repeticao {

	public static void main(String[] args) {
		//declaração de variaveis
		
		int idade=1;
		String nome;
		//variavel para receber dados do teclado
		Scanner teclado = new Scanner(System.in);
		// while verifica primeiro antes de executar a sequencia.
		//enquanto do while executa primeiro para só depois verificar
		while(idade>0) {
		System.out.println("Informe seu nome: ");
		nome= teclado.nextLine();
		
		System.out.println("informe sua idade: ");
		//como foi recebido um valor inteiro uma sring e outro inteiro
		//é necessario converter o valor para inteiro 
		//para isso usa -se o Integer.parseInt()
		//e o teclado .nextLine serve para receber o valor como string
		idade = Integer.parseInt(teclado.nextLine());
		
		System.out.println(nome+ " tem " + idade + " anos");
		}
		
		teclado.close();
	}

}
