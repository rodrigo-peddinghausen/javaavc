package jthread;

public class TestaContador {

	public static void main(String[] args) {
		Contador c1 = new Contador();
		c1.setCont(1);
		Thread t1 = new Thread(c1);
		t1.start();
		
		Contador c2 = new Contador();
		c2.setCont(2);
		Thread t2 = new Thread(c2);
		t2.start();
		
		Contador c3 = new Contador();
		c3.setCont(3);
		Thread t3 = new Thread(c3);
		t3.start();
		
		//-> Quem controla a saida é o 'Escalonador de Thread'. Cada vez qye eke trica de treadm faz uma operacao
		//de 'troca de contexto'
	}

}
