package bibliotecas;


public class TestaMathCasa {

	public static void main(String[] args) {
		//Para casa: implemntar classes de testes para os seguintes métodos de Math:
		//métodos de Math: usar e depois como comentário explicar
		// o que faz: random(),max, min, ceil, floor, exp, log, pow, sqrt, toDegrees, ro Radians
		// os Subir pro GitHub
		
		//random() - retorna um valor double positivo entre 0.0 e 1 
		//Após chamá-lo, é preciso multiplicar seu retorno pelo valor que deseja ter de escopo + 1
		System.out.println((int) (Math.random()*26));
		
		//max - retorna o maior de dois valores numéricos inseridos como parâmetros. Tem de int, long, float
		//double.
		System.out.println(Math.max(10, 12));
		
		//min - retorna o valor mínimo. 
		System.out.println(Math.min(22, 7));
		
		//ceil - arredonda pra cima 
		System.out.println(Math.ceil(2.33));
		
		//floor - arredonda pra baixo
		System.out.println(Math.floor(2.33));
		
		//exp - retorna um  exponencial de 'e' ('número de Euler')
		// https://www.youtube.com/watch?v=MB9-wm5OVdk&ab_channel=TodaaMatem%C3%A1tica 
		// o link acima explica o número de Euler
		System.out.println(Math.exp(1));
		
		//log logaritmo de base 'e'
		System.out.println(Math.log10(100));
		
		//pow - potenciação
		System.out.println(Math.pow(6, 2));
		
		//sqrt - raiz quadrada
		System.out.println(Math.sqrt(36));
		
		//todeGrees converte radianos para graus
		System.out.println(Math.toDegrees(Math.PI));
		
		//toRadians converte angulo para radianos
		System.out.println(Math.toRadians(180));
		
	}

	
}

 