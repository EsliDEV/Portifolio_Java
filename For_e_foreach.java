package pomarola;

import java.util.Scanner;

public class For_e_foreach {
	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		// uso padrao do for i é igual a um valor 
		//enquanto i for menor que x
		//aumente um ao valor de i 
		for(int i=0; i<5; i++) {
			System.out.println("informe seu nome: ");
			nome= teclado.nextLine();
			System.out.println("informe sua idade: ");
			//idade =teclado.nextInt();//bug
			idade = Integer.parseInt(teclado.nextLine());
			if(idade>0) {
				System.out.println(nome + " tem " + idade + " anos " );
			}
			else {System.out.println("mas nha bebe nem le");}
			}
		System.out.println("lista fechada espere mais vagas serem abertas");
		}
	}

