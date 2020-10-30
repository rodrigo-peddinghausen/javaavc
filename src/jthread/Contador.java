package jthread;

public class Contador implements Runnable {
	private int cont;
	
	public void setCont(int cont) {
		this.cont = cont;
	}
	
//	public void contar() {
//	public  void run() {
	public synchronized void run() { //sincroniza, 'pero no mucho'
		for (int i = 0; i < 100; i++) {
			System.out.println("Thread " + cont + ", valor: " + i);
		}
	}

}
