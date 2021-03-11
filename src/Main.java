import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int opc = 0;
		int posicao;
		boolean auxbool; // Variável que auxiliará na verificação da pilha
		
		
		// ---*---
		Pilha op = new Pilha(1);
		Produtos produto;
		Produtos removido; // Elemento removido da pilha

		
		int qtdPessoas = Integer.parseInt(JOptionPane
				.showInputDialog("Digite a quantidade de produtos que poderão ser adicionados: ")); //Tamanho do array que trataremos como pilha
		
		Pilha data = new Pilha(qtdPessoas); // Criação da fila, juntamente com a instancia
		PilhaRemovidos dataRemovido = new PilhaRemovidos(qtdPessoas);
		
		
		
		do {//Menu de opções
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: \n"
					+ "1 - Adiciona produto à pilha; \n"
					+ "2 - Retira produto da pilha; \n"
					+ "3 - Verificar se pilha esta vazia; \n"
					+ "4 - Pesquisar a ordem do produto; \n"
					+ "5 - Percorrer a pilha\n"
					+ "6 - Percorrer a pilha de removidos\n"
					+ "0 - Sair da aplicação."));
			
			switch(opc) {
			case 1: produto = op.definirProduto(); 													//Entrara os menus para digitação dos dados do produto
			data.push(produto); 																	//Coloca o produto na pilha
			System.out.println(data.print()); 														// Printa a pilha			
			break;
			
			case 2: removido = data.pop(); 															// Retira o ultimo produto a entrar na pilha
				System.out.println("O elemento removido foi o de ID: \n" +removido.getId()); 			// Mostra o ID do elemento retirado
				dataRemovido.push(removido); 														// Todos dados removidos estão sendo incluídos na pilhaRemovido
			break;
			
			case 3: auxbool = data.verificarPilha();												//Verifica se a pilha esta vazia
				if(auxbool == true) {
				System.out.println("Pilha vazia");
				}else {
				System.out.println("Pilha não está vazia");
				}
				break;
			
			case 4: posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do produto que vc" 
					+ " gostaria de saber a posição de atendimento :"));
					data.pesquisarOrdem(posicao);													//Verifica em qual ordem esta o produto
			break;
			
			case 5: data.percorrePilha(); 															//Percorre a pilhha
			break;
			
			case 6: dataRemovido.percorreRemovido();												//Percorre a pilha de removidos
			break;
			
			case 0 : JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplicação.");
			break; 
			default: JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}while(opc != 0);
	}

}
