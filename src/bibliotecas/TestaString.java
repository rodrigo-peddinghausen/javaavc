package bibliotecas;

import javax.sound.midi.Soundbank;

public class TestaString {

	public static void main(String[] args) {
		
		String a = "Aprendendo muito Java";
		String b[] = a.split(" ");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		String c = "aprendendo muito java";
		int i = a.compareTo(a);
		System.out.println(i);
		int j = a.compareTo(c);
		System.out.println(j);
		int k = a.compareToIgnoreCase(c);
		System.out.println(k);
		
		a.toLowerCase();
		System.out.println(a);
		String d = a.toLowerCase();
		System.out.println(d);
		String e = a.toUpperCase();
		System.out.println(e);
		
		//Com a variável 'a' e o auxílio de outras variáveis
		//Crie exemplos para demonstrar a funcionalidade
		//dos seguintes métodos de String (podem ou não ter params):
		//charAt(); length(); substring(); indexOf(); lasteIndex();
		//isEmpty(); contains(); replace();
		
		//java.lang.System
		//java.lang.Object -> classe mais ancestral
 		
	}
}
