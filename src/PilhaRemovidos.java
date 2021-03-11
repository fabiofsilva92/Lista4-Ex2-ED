
//Classe onde os elementos deletados da pilha principal são alocados até sua capacidade máxima
public class PilhaRemovidos {

	private Produtos dataPilha[];
	private int topo;

	
	public PilhaRemovidos(int n) {
		this.dataPilha = new Produtos[n];
	}
	
	//Push adiciona.
	public void push(Produtos qualquer) {
		if(topo<dataPilha.length) {
			dataPilha[topo] = qualquer;
			topo++;
		}
		else {
			System.out.println("Pilha cheia, a pilha tem o mesmo tamanho da pilha que esta sendo trabalhada,"
					+ "não é possível add ao final."); //foi limitado a pilha ao mesmo tamanho da pilha
		}
	}
	//Percorre a pilha de removidos
	public void percorreRemovido() {
		String aux = "";
		for(int i = 0; i<topo; i++) {
			aux = aux + "\n" + "Id: " + dataPilha[i].getId() + ", Nome: " + dataPilha[i].getNome() 
					+ ", Valor: " + dataPilha[i].getValor() + ", Quantidade disponível: " + dataPilha[i].getQtd();
		}
		System.out.println(aux);
	}
}
