package aulacollections;

import java.util.ArrayList;
import java.util.List;

import sistemaContaCorrente.Conta;

public class TestaLista1 {

	public static void main(String[] args) {
		List lista1 = new ArrayList();
		lista1.add("Ussop");
		lista1.add("Reiko");
		lista1.add("Ryu");
		lista1.add("Kratos");
		
		System.out.println(lista1);
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		Conta c3 = new Conta();
		
		c1.depositar(100);
		c1.setNome("Rodrigo");
		
		c2.depositar(100);
		c2.setNome("Arminda");
		
		c3.depositar(100);
		c3.setNome("Kleber");
		
		List contas = new ArrayList();
		
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
		
		System.out.println(contas);
		System.out.println(contas.size());
		for (int i = 0; i < contas.size(); i++) { //Faz dessa forma caso não haja um toString no objeto. Senão imprime o hash
			Conta cTemp = (Conta) contas.get(i);
			System.out.println(cTemp.getNome());
			System.out.println(cTemp.getSaldo());
		}
		
		List<Conta> contas2 = new ArrayList<Conta>();
		contas2.add(c1);
		contas2.add(c2);
		System.out.println(contas2.size());
				
		for (Conta conta: contas2) {			//For Each
			System.out.println(conta.getNome());
			System.out.println(conta.getSaldo());
		}
	}
}
