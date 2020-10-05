package bibliotecas;

public class TesteTpStringClientes {

	public static void main(String[] args) {
		Cliente1 c1 = new Cliente1();
		System.out.println(c1.toString()); //imprime o OID
		System.out.println(c1); //imprime o OID
		
		Cliente2 c2 = new Cliente2("Java");
		Cliente2 c3 = new Cliente2(null);
		
		System.out.println(c2);
		System.out.println(c2.toString());
	}
}
