package jthread;

public class TestaThread {

	public static void main(String[] args) {
		DesenhaMapa dMapa = new DesenhaMapa();
		Thread tMapa = new Thread(dMapa); //Pra usar thread a classe deve implementar 'runnable'
		tMapa.start(); //dispara a trhread na minha JVM
		
		BarraDeProgresso bProg = new BarraDeProgresso();
		Thread tBProg = new Thread(bProg);
		tBProg.start();
	}

}
