package pomarola;

public class Tipos_numericos_primarios {

	public static void main(String[] args) {
		
		//tipos primarios ou primitivos 
		//por padrão os numeros reais em java são considerados double
		float preco1 = 23.4f; //23.40
		double preco2 = 23.4;//23.4343434343434334343434343434343434
		 
		//tipos não primarios
		Float preco3 = 44.5f;
		Double preco4=44.5;
		
		//tipos primarios/primitivos
		int num1 = 4;// inteiro 99999999999999999999999
		short num2 = 4;// inteiro !(curto/menor/baixo) 999999
		byte num3 = 4;//inteiro
		
		//tipos não primarios/primitivos
		Integer num4 =98;
		short num5 =5;
		Byte num6 = 9;
		
		System.out.println("Float-> preco1 = " + preco1);
		System.out.println("Double ->preco2 = " + preco2);
		System.out.println("Float -> preco3 = " + preco3);
		System.out.println("Double -> preco4 = " + preco4);
		
		System.out.println("int->Num1= " + num1);
		System.out.println("short -> num2= " + num2);
		System.out.println("byte -> num3 = "+ num3);
		System.out.println("integer-> num4= "+ num4);
		System.out.println("short -> Num5= " + num5);
		System.out.println("Byte -> num6= "+ num6);
		
		System.out.println("int/integer" + Integer.SIZE+"bits");
		System.out.println("short/Short" + Short.SIZE+"bits");
		System.out.println("byte/Byte" + Byte.SIZE + " bits");
	}

}
