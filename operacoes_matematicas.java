package pomarola;

public class operacoes_matematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 9, res;
		float res2;
		//soma
		res = num1 +num2;
		System.out.println("a soma de "+ num1 +" + "+ num2+" � " +res);
		
		//subtra��o 
		res = num1 -num2;
		System.out.println("a subtra��o de "+ num1 +" - "+ num2+" � " +res);
		
		// multiplica��o
		res = num1 *num2;
		System.out.println("a multiplica��o de "+ num1 +" X "+ num2+" � " +res);
		
		//divis�o
		res = num1 /num2;
		System.out.println("a divis�o de "+ num1 +" / "+ num2+" � " +res);
		
		//divis�o de numero real
		res2 = (float)num2 /(float)num1;
		System.out.println("a divis�o de "+ num1 +" / "+ num2+" � " +res2);
		
		//diferenciar par e impar
		res= num1% 2;
		System.out.println("O resto da divis�o de "+ num1 +" por 2 � "+res);
		
		res = num2 % 3;
		System.out.println(num2+ " � divisivel por 3?" + res);
		
	}

}
