import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		Scanner scLer = new Scanner(System.in);
		int opc =0;
		int aux =0;
		
		PilhaAlunos pilha;
		
		System.out.println("Digite o tamanho da pilha");
		int t = scLer.nextInt();
		pilha = new PilhaAlunos(t);
		
		
		do {
			
			System.out.println("|---------------------");
			System.out.println("|    MENU - IDADES    ");
			System.out.println("|1  - EMPILHAR        ");
			System.out.println("|2  - DESEMPILHAR     ");
			System.out.println("|3  - IMPRIMIR        ");
			System.out.println("|4  - ESTA CHEIA      ");
			System.out.println("|5  - PESQUISA RA     ");
			//System.out.println("|6  - IMPRIMIR TODOS  ");
			System.out.println("|99 - SAIR            ");
			System.out.println("|---------------------");
			System.out.println("");
			System.out.println("|  DIGITE UMA OP��O:  ");
			opc = sc.nextInt();
			
			if ((opc > 0) || (opc > 99 )||(opc < 5 ) ){
			switch (opc) {
			case 1://  EMPILHAR 
				System.out.println("OP��O EMPILHAR SELECIONADA");
				Aluno a = new Aluno();
				a.ra = scLer.nextInt();
				a.nome = scLer.next();
				a.mensalidade = scLer.nextDouble();
				
				pilha.Empilhar(a);
				break;

			case 2://DESEMPILHAR 
				System.out.println("OP��O DESEMPILHAR SELECIONADA");
				pilha.Desempilhar();
				break;
			
			case 3://IMPRIMIR 
				System.out.println("OP��O IMPRIMIR SELECIONADA");
				pilha.ImprimirTodos();
				break;
			
			case 4:// ESTA CHEIA
				System.out.println("OP��O VERIFICAR CHEIO SELECIONADA");
				pilha.Estacheio();
				break;
			
			case 5:// PESQUISA RA
				System.out.println("OP��O PESQUISA POR RA SELECIONADA");
				System.out.println("Digite o R.A");
				aux = scLer.nextInt();
				pilha.pesquisarRa(aux);
				break;
			}
			}else if (opc != 99) {
				System.out.println("Op�a� Invalida!");
			}
		
		} while (opc != 99);
		
		
		
		
		
		
		
		
		
	}

}
