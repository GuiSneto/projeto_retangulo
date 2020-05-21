package projeto_retangulo;

//bibliotecas
import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); // idioma US
		Scanner sc = new Scanner(System.in); // leitura de dados
		
		double LARG,ALT;
		int MEN,i=0;
		
		//Leitura da largura
		System.out.print("Digite a largura do retangulo: ");
		LARG = sc.nextDouble();
		
		//Validação largura
		while (LARG < 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			LARG = sc.nextDouble();
		}
		
		//Leitura da altura
		System.out.print("Digite a largura do retangulo: ");
		ALT = sc.nextDouble();
		
		//Validação altura
		while (ALT < 0) {
			System.out.print("O valor deve ser positivo. Tente novamente: ");
			ALT = sc.nextDouble();
			System.out.println("");
		}

		//Validação menu	
		while (i == 0) {	
			System.out.println("");
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.print("Digite um valor: ");
			MEN = sc.nextInt();
			System.out.println("");
				
			if (MEN == 1) {
				System.out.printf("AREA = %.1f%n",(ALT*LARG));

			}
				
				else if (MEN == 2) {
					System.out.printf("PERIMETRO = %.1f%n",(2*ALT + 2*LARG));

				}
				else if (MEN == 3) {
					i = +1;
					System.out.println("FIM DO PROGRAMA!");
				}
			
		}			
		sc.close();		
		
	}

}
