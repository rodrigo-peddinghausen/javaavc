import sistemaContaCorrente.AcessoInterno;
import sistemaContaCorrente.Gerente2;

public class TestaInterface1 {

	public static void main(String[] args) {
		String senha = "123";
		AcessoInterno f1 = new Gerente2();
		boolean teste = f1.verifica(senha);
		if(teste) {
			System.out.println("Tudo certo");
		}
		else {
			System.out.println("Deu errado");
		}
		
	}

}