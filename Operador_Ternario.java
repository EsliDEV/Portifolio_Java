package pomarola;

public class Operador_Ternario {
	public static void main(String[] args) {
		//declaração de variaveis
		int valor=3,numero;
		//codigo base/padrão:
		/*if(valor<0) {
			numero=valor;
		}else {
			numero=7;
		}
		System.out.println("o numero é igual a" + numero);*/
		//operador ternario
		//traduzindo:
		//o numero é igual ao valor se o valor for menor que 0 se não o numero é igual a 7
		//estrutura do if else compactada
		numero = (valor>0) ? valor:7;
		System.out.println(numero);
	}
	

}
