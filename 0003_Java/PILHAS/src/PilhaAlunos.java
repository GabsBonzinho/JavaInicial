public class PilhaAlunos {
	
	private Aluno[] vetAlunos;
	private int pTopo;
	
	public PilhaAlunos (int tam){
		vetAlunos = new Aluno[tam];
		pTopo = -1;
	}
	
	public void Empilhar (Aluno al){
		
		if ((pTopo + 1) >= vetAlunos.length){
			System.out.println("Esta cheio");
		}else{
			pTopo = pTopo + 1;
			vetAlunos[pTopo] = al;
		}	
	
		
	}
	public void Desempilhar(){
		
		if ((pTopo + 1) >= vetAlunos.length){
			pTopo = pTopo - 1;
		}else{
			System.out.println("Esta vazio");
		}
			
	}

	public void ImprimirTodos (){
		int aux = pTopo;
		
		while (aux !=-1){
			System.out.println(vetAlunos[aux].nome);
			System.out.println(vetAlunos[aux].ra);
			System.out.println(vetAlunos[aux].mensalidade);
			aux = aux -1;
			
		}
		
	}
	public void pesquisarRa(int r){
		boolean achou = false;
		for (int i = pTopo; i == 0; i--) {
			if(vetAlunos[i] != null){
				if(vetAlunos[i].ra == r){
					achou = true;
					System.out.println("R.A: "+vetAlunos[i].ra);
					System.out.println("Nome: "+vetAlunos[i].nome);
					System.out.println("Mensalidade: "+vetAlunos[i].mensalidade);
										
					break;
				}
			}
		}
		if(achou == false){
			System.out.println("RA não localizado");
		}
	}
	
	public void Estacheio(){
	//int	cheio = 0;
	
	if ((pTopo + 1) >= vetAlunos.length){
		System.out.println("Esta cheio");
	}else{
		System.out.println("Esta vazio");
	}
	
	/*	for (int i = pTopo; i == 0; i--) {
		
			if(vetAlunos[i] == null){
				cheio = 0;
			}else {
				cheio = +1;
			}
		}
		
		if(cheio > 0) {
			System.out.println("Esta cheio");
		}else{
			System.out.println("Não esta Cheio");
		}*/
		
		
	}
	
	
}
