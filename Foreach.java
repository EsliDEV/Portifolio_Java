package pomarola;

public class Foreach {

	public static void main(String[] args) {
		String nome ="Geek University";
		//no for a string .toCharArray muda a ordem das letras para uma letra por linha 
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
			
		}
		

	}

}
