
public class TestaCondicional {
	
	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 10;
		int quantidadePessoas = 3;
		if (idade >=18) {
			System.out.println("voc� � de maior");
		} else {
			System.out.println("Idade menor que 18");				
			if (quantidadePessoas>=2) {	
				System.out.println("voc� n�o tem 18, mas como est� acompanhado, pode entrar.");
			} else {
				System.out.println("infelizmente voc� n�o pode entrar.");
			}
		}
	}
}


