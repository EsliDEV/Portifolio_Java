package pomarola;

public class Operador_Ternario {
	public static void main(String[] args) {
		//declara��o de variaveis
		int valor=3,numero;
		//codigo base/padr�o:
		/*if(valor<0) {
			numero=valor;
		}else {
			numero=7;
		}
		System.out.println("o numero � igual a" + numero);*/
		//operador ternario
		//traduzindo:
		//o numero � igual ao valor se o valor for menor que 0 se n�o o numero � igual a 7
		//estrutura do if else compactada
		numero = (valor>0) ? valor:7;
		System.out.println(numero);
	}
	

}
