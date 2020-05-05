/////////////////////////////////////////////////////////////////////////////////////////////////
//			EXERCICIO 01 HELLOWORD
/////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//DECLARAR VARIAVEIS
		int i=0; //IDADE
		Scanner sc = new Scanner(System.in); //LEITURA
		
		//LENDO IDADE DO USUARIO
		i= sc.nextInt();
		
		//INICIO DO ALGORITMO
		if ((i >= 16) &(i<=20)) {
			System.out.println("Liberado com Acompanhante.");
		} else {
			if ((i < 16)) {
				System.out.println("Entrada Proibida.");
			} else {
				if (i >= 21) {
					System.out.println("Liberado.");
				}

			}

		}
		
	}


}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//			EXERCICIO 02 MENU IDADE NOME SAIR
/////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//DECLARAR VARIAVEIS
		Scanner pepa = new Scanner(System.in);
		int	opc	=	0;


		do {
			System.out.println("-------------");
			System.out.println("MENU");
			System.out.println("1-Idade.");
			System.out.println("2-Nome");
			System.out.println("99-Sair");		
			System.out.println("-------------");	
			System.out.println("Digite a opção: ");
			opc	=	pepa.nextInt();	

					
					} while (opc!=99);


					if (opc ==	1) {
						System.out.println("Idade Selecionada");
					} else {
						if (opc==2) {
							System.out.println("Nome Selecionado");
						} else {
							if (opc < 99) {
								System.out.println("Opção Invalida");
							}

     			}
		}
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////
//			EXERCICIO 03 MENU
/////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//DECLARAR VARIAVEIS
		Scanner pepa = new Scanner(System.in);
		int	opc	=	0;
		Scanner area = new Scanner(System.in);
		double	pepa2	=	0.0;
		


		do {
			System.out.println("-------------");
			System.out.println("MENU");
			System.out.println("1-Retangulo.");
			System.out.println("2-Quadrado.");
			System.out.println("2-Triangulo");
			System.out.println("99-Sair");		
			System.out.println("-------------");	
			System.out.println("Digite a opção: ");
			opc	=	pepa.nextInt();	

					
					} while (opc!=99);

					if (opc ==	1) {
						double area = 0.0;
						double base = 0.0;
						
						System.out.println("Digite o valor da altura");
						area = pepa2.nextDouble();
						System.out.println("Digite o valor da base");
						base = pepa2.nextDouble();
						
						area = area * altura;
						
						System.out.println("A area é:" + area);
					
					} else {
						if (opc==2) {
							double lado = 0.0;
						
							System.out.println("Quadrado Selecionado");
							System.out.println("Digite o valor dos lados");
							lado = pepa2.nextDouble();
													
							lado = lado * lado;
						
							System.out.println("A area é:" + lado);
							
						} else{
							if (opc == 3) {
								//area = (base * altura)/2
								System.out.println("Triangulo Invalida");
							}else{
								if(opc < 99 ){
									System.out.println("Opção Invalida");
								}
			
							}

     			}
		}
	}
}




