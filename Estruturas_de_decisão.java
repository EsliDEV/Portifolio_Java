package pomarola;

public class Estruturas_de_decis�o {

	public static void main(String[] args) {
		
	//declara��o de variaveis
		int valor =18;
		
		if(valor>8 && valor<20){
			System.out.println("tomatinho");
		}else if(valor>20) {
			System.out.println("mas ai foi dmais");
		}
		// usar % calcula o valor do numero. 
		//quando dividido por 2 se for igual a 0 significa que o numero � divizivel por 2
		//ou que o numero � par.
		else if(valor%2==0) {
			System.out.println("mas bah dianho numero bom q s�");
		}
		else {
			System.out.println("mas bah jaguara");
		}

	}

}
