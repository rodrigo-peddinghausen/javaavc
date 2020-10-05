package bibliotecas;

public class TestaSrtingExemploDoProf {

	public static void main(String[] args) {
		String a = "Senac 123";
		String b = "Senac 123";
		
		int i = 0;
		int j = 0;
		
		String c = new String ("Senac 456");
		String d = new String ("Senac 456");
		String e = c; //tenho dois ponteiros apontando para a mesma área de memória
		String f = new String("Senac 789");
		
		if(i==j) {
			System.out.println("i e j são iguais");
		}
		else {
			System.out.println("i e j são diferentes");
		}
		
		if(a==b) {
			System.out.println("a e b são iguais");
		}
		else {
			System.out.println("a e b são diferentes");
		}
		
		if(c==d) {
			System.out.println("c e d são iguais");
		}
		else {
			//Compara OIDs
			System.out.println("c e d são diferentes");
		}
		
		if(c==e) {
			System.out.println("c e e são iguais");
		}
		else {
			System.out.println("c e e são diferentes");
		}
		
		if(e==f) {
			System.out.println("e e f são iguais");
		}
		else {
			System.out.println("e e f são diferentes");
		}

	}

}
