package projeto_retangulo;

//bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // idioma US
		Scanner sc = new Scanner(System.in); // leitura de dados
		
		double LARG, ALT;
		
		//Leitura da largura
		System.out.print("Digite a largura do retangulo: ");
		LARG = sc.nextDouble();
		
		//Validação largura
		while (LARG < 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			LARG = sc.nextDouble();
		}
		
		sc.close();
		
		

		
		
	}

}
