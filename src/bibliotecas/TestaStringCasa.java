package bibliotecas;

public class TestaStringCasa {

	public static void main(String[] args) {
		//Crie exemplos para demonstrar a funcionalidade
		//dos seguintes métodos de String (podem ou não ter params):
		//charAt(); length(); substring(); indexOf(); lastIndexOf();
		//isEmpty(); contains(); replace();
				
		//java.lang.System
		//java.lang.Object -> classe mais ancestral
				
		//charAt() - retorna o o char de determinado índice da String
		String nome = "Rodrigo";
		System.out.println(nome.charAt(2));
		
		//length() - retorna o comprimento de uma String 
		System.out.println(nome.length());
		
		//substring() - retorna uma substring de uma String a partir do índice parametrizado
		System.out.println(nome.substring(3));
		
		//indexOf() - retorna o índice de um char dentro de uma String
		System.out.println(nome.indexOf("g"));
		
		//lastIndexOf() - retorna a última posição que o char aparece
		System.out.println(nome.lastIndexOf("o"));
		
		//isEmpty() - retorna um booleano. True se o lengh() da string for igual a 0
		System.out.println(nome.isEmpty());
		
		//contains() - testa se uma String possui uma sequência de caracteres. Retorna um booleano
		System.out.println(nome.contains("go"));
		
		//replace() - substitui um char por outro. Isso ocorre dentro de toda String.
		System.out.println(nome.replace("o", "e"));
		
	}

}
