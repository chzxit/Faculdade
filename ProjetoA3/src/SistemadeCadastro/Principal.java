import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
      Gerenciadordeproduto gerenciador = new Gerenciadordeproduto();
      Scanner scan = new Scanner(System.in);

      while (true) {
          System.out.println("Digite 'Adicionar' para Adicionar um Produto: \nDigite 'Buscar' para Buscar um Produto: \nDigite 'Atualizar' para Atualizar um Produto: \nDigite 'Excluir' para Excluir um Produto: \nDigite 'Listar' para Listar Todos os Produtos: \nDigite 'Sair' para Sair Do Sistema:  ");
          String comando = scan.nextLine();

          switch (comando.toLowerCase()) {
              case "adicionar":
                  System.out.println("Digite o nome do produto: ");
                  String nomeAdd = scan.nextLine();
                  System.out.println("Digite o preço do produto: ");
                  double precoAdd = scan.nextDouble();
                  scan.nextLine(); 
                  Produto novoProdutoAdd = new Produto(nomeAdd, precoAdd);
                  gerenciador.adicionarProduto(novoProdutoAdd);
                  break;
              case "buscar":
                  System.out.println("Digite o nome do produto para buscar: ");
                  String nomeBusca = scan.nextLine();
                  Produto produtoBuscado = gerenciador.buscarProduto(nomeBusca);
                  if (produtoBuscado != null) {
                      System.out.println("Produto encontrado: " + produtoBuscado);
                  } else {
                      System.out.println("Produto não encontrado.");
                  }
                  break;
              case "atualizar":
                  System.out.println("Digite o nome do produto para atualizar: ");
                  String nomeAtualiza = scan.nextLine();
                  System.out.println("Digite o novo preço do produto: ");
                  double precoAtualiza = scan.nextDouble();
                  scan.nextLine();
                  gerenciador.atualizarProduto(nomeAtualiza, precoAtualiza);
                  break;
              case "excluir":
                  System.out.println("Digite o nome do produto para excluir: ");
                  String nomeExclui = scan.nextLine();
                  gerenciador.excluirProduto(nomeExclui);
                  break;
              case "listar":
           
              for (Produto produto : gerenciador.listarTodosProdutos()) {
                System.out.println(produto); }
                  break;
              case "sair":
                scan.close();
                  return;
              default:
                  System.out.println("Comando desconhecido. ");
}
 }
   }
     }
  