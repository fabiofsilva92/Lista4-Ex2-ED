import javax.swing.JOptionPane;

public class Pilha {
	
	private Produtos data[];
	private int topo; //Auxiliar
	private int id = 1; //ID dos produtos que será incrementado
	
	public Pilha(int n) {
		this.data = new Produtos[n];
	}

	//Adiciona na pilha principal
	public void push(Produtos qualquer) {
		if(topo<data.length) {
			data[topo] = qualquer;
			topo++;
		}
		else {
			System.out.println("Pilha cheia.");
		}
	}
	//Retira o produto do final da pilha
	public Produtos pop() {
		Produtos qualquer = null;
		if(topo>0) {
			qualquer = data[topo-1];
			topo--;
		}
		else{
			JOptionPane.showMessageDialog(null, "Pilha vazia");
		}
		return qualquer;
	}
	
	//Define os dados do produto
	public Produtos definirProduto() {
		String nome = JOptionPane.showInputDialog("Digite o nome do produto :");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário do produto: "));
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade disponível"));
		Produtos produto = new Produtos(id, nome, valor, qtd);
		id++;
		
		return produto;
	}
	
	//Percorre a pilha principal.
	public void percorrePilha() {
		 String aux = "";
		 for(int i = 0 ; i<topo; i++) {
			 aux = aux + "\n" + "Id: " + data[i].getId() + ", Nome: " + data[i].getNome() 
					 + ", Valor: " + data[i].getValor() + ", Quantidade disponível: " + data[i].getQtd();
			 System.out.println(aux);
		 }
	}
	
	//Verifica se esta vazia.
	 public boolean verificarPilha() {
		 int len = data.length;
		 System.out.println(len);
		 int aux = 0;
		 
		 for(int i = 0; i< len; i++) {
			 if(data[i] == null) {
				 aux++;
			 }
			 else {
				 i = len;
			 }
		 }
		 if(aux == len) {
			 return true;
		 }else {
			 return false;
		 }
	 }
	 
	 //Pesquisa a ordem do produto na pilha.
	 public void pesquisarOrdem( int posicao) {
		 for(int i = 0; i< topo; i++) {
			 if(data[i].getId() == posicao) {
				 System.out.println("O produto com nome " +data[i].getNome() + " está na "
				 		+ "posição " +(i+1) + " da ordem.");
			 }
		 }
	 }
	 
	 //Realiza o print a cada adição na pilha
	 public String print() {
		 String aux = "";
		 for(int i = 0 ; i<topo; i++) {
			 aux = aux + "\n" + "Id: " + data[i].getId() + ", Nome: " + data[i].getNome() 
					 + ", Valor: " +data[i].getValor() + ", Quantidade disponível: " + data[i].getQtd();
		 }
		 return aux;
 }
	 
}
