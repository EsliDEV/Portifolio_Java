package pomarola;

public class operacoes_matematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5, num2 = 9, res;
		float res2;
		//soma
		res = num1 +num2;
		System.out.println("a soma de "+ num1 +" + "+ num2+" é " +res);
		
		//subtração 
		res = num1 -num2;
		System.out.println("a subtração de "+ num1 +" - "+ num2+" é " +res);
		
		// multiplicação
		res = num1 *num2;
		System.out.println("a multiplicação de "+ num1 +" X "+ num2+" é " +res);
		
		//divisão
		res = num1 /num2;
		System.out.println("a divisão de "+ num1 +" / "+ num2+" é " +res);
		
		//divisão de numero real
		res2 = (float)num2 /(float)num1;
		System.out.println("a divisão de "+ num1 +" / "+ num2+" é " +res2);
		
		//diferenciar par e impar
		res= num1% 2;
		System.out.println("O resto da divisão de "+ num1 +" por 2 é "+res);
		
		res = num2 % 3;
		System.out.println(num2+ " é divisivel por 3?" + res);
		
	}

}
