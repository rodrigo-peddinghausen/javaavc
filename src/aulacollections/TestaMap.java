package aulacollections;

import java.util.HashMap;
import java.util.Map;

import sistemaContaCorrente.Conta;

public class TestaMap {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.depositar(299);
		c1.setNome("Lukas");
		c1.setLimite(2000);
		
		Conta c2 = new Conta();
		c2.depositar(400);
		c2.setNome("Doidin");
		c2.setLimite(2000);
		
		Conta c3 = new Conta();
		c3.depositar(1999);
		c3.setNome("Audri");
		c3.setLimite(2000);
		
		Map<String, Conta> mapaContas = new HashMap<String, Conta>();
		mapaContas.put("cliente1", c1);
		mapaContas.put("cliente2", c2);
		mapaContas.put("cliente3", c3);
		
		Conta contaRecuperada = mapaContas.get("cliente1");
		System.out.println(contaRecuperada);
		
	}

}
