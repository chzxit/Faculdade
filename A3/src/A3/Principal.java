package A3;
import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {


      Gerenciadordeproduto gerenciador = new Gerenciadordeproduto();
      Scanner scan = new Scanner(System.in);

      while (true) {
          System.out.println("Digite 'Adicionar' para Adicionar um Produto: \nDigite 'Consultar' para Consultar um Produto: \nDigite 'Alterar Dados' para Alterar Dados um Produto: \nDigite 'Excluir Dados' para Excluir os dados de um Produto: \nDigite 'Listar' para Listar Todos os Produtos: \nDigite 'Sair' para Sair Do Sistema:  ");
          String comando = scan.nextLine();
          System.out.println();

          switch (comando) {
              case "Adicionar":
                  System.out.println("Digite o nome do produto: ");
                  String nomeAdd = scan.nextLine();
                  System.out.println("Digite o preço do produto: ");
                  double precoAdd = scan.nextDouble();
                  scan.nextLine(); 
                  System.out.println();
                  Produto novoProdutoAdd = new Produto(nomeAdd, precoAdd);
                  gerenciador.adicionarProduto(novoProdutoAdd);
                  System.out.println();
                  break;

              case "Consultar":
                  System.out.println("Digite o nome do produto para consultar: ");
                  String nomeBusca = scan.nextLine();
                  Produto produtoBuscado = gerenciador.buscarProduto(nomeBusca);
                  if (produtoBuscado != null) {
                      System.out.println("Produto encontrado: " + produtoBuscado);
                  } else {
                      System.out.println("Produto não encontrado.");
                  }
                  System.out.println();
                  break;

              case "Alterar Dados":
                  System.out.println("Digite o nome do produto para alterar os dados: ");
                  String nomeAtualiza = scan.nextLine();
                  System.out.println("Digite o novo preço do produto: ");
                  double precoAtualiza = scan.nextDouble();
                  scan.nextLine();
                  gerenciador.editarProduto(nomeAtualiza, precoAtualiza);
                  System.out.println();
                  break;

              case "Excluir Dados":
                  System.out.println("Digite o nome do produto para excluir os dados: ");
                  String nomeExclui = scan.nextLine();
                  gerenciador.excluirProduto(nomeExclui);
                  System.out.println();
                  break;

              case "Listar":
              for (Produto produto : gerenciador.listarTodosProdutos()) {
                System.out.println(produto); }
                System.out.println();
                  break;                                                                                    

              case "sair":
                System.out.println("Programa Encerrado. "); 
                scan.close();
                  return;
              default:
                  System.out.println("Comando desconhecido. ");
}
 }
   }
     }
