package bibliotecas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma frase: ");
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		//BufferedReader sabe receber varios chars e armazena-los num buffer,
		//transformando-os em String
		String s = null;
		try {
			s = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Voce digitou a frase: "+s);
			
	}

}
