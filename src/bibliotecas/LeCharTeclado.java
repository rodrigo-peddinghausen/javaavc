package bibliotecas;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma tecla: ");
		InputStream is = System.in;
		//InputStream é uma classe Java que sabe capturar um byte
		//nesse caso recendo-o da entrada padrao do sistema
		
		InputStreamReader isr = new InputStreamReader(is);
		//ISR sabe receber um byte e transforma-lo em char
		char c = 0;
		try {
			c = (char) isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Voce digitou a tecla: "+c);
	}

}
