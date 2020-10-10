package bibliotecas;

public class TesteIntToString {

	public static void main(String[] args) {
		int i = 1;
		
		String s1 = " "+i; //atribuição indireta através de um operador de aglutinação
		System.out.println(s1);
		
		String s2 = "11";
		//int j = i + s2;
		//vamos usar classes Wrapper
		int k = Integer.parseInt(s2);
		int j = k + i;
		System.out.println(j);
		
		//Classes Wrapper em Java
		//boolean -> Boolean
		/*Boolean.compare(x, y) - retorna 0 se X && Y, <0 se !X && Y e >0 se X && !Y
		Boolean.logicalAnd(a, b) - retorna true se a&&b forem verdadeiros e false se acontecer o contrario
		O mesmo vale para logicalOr e Xor*/
		
		//char -> Character
		char a = 'a';
		boolean check = Character.isUpperCase('a'); // Testa se o char é maiúsculo e retorna um um booleano
		
		
		//byte -> Byte
		
		
		//short -> Short
		
		
		//int -> Integer
		
		
		//long -> Long
		
		
		//float -> Float
		
		
		//double -> Double
		
		//Próxima aula vem Java.io
	}
}
