import java.util.Scanner;
import java.util.UUID;
 
public class Principal {
  public static void main(String[] args) {


      Gerenciadordeproduto gerenciador = new Gerenciadordeproduto();
      Scanner scan = new Scanner(System.in);
      UUID idAleatorio = UUID.randomUUID();

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
                  System.out.println("Gere o id do produto: " + idAleatorio.toString());
                  scan.nextLine();
                  System.out.println("Digite o id do produto: ");
                  String IdAdd = scan.nextLine();
                  System.out.println("Digite a cor do produto: ");
                  String corAdd = scan.nextLine();
                  System.out.println("Digite o tamanho do produto: ");
                  String tamanhoAdd = scan.nextLine();
                  System.out.println();
                  Produto novoProdutoAdd = new Produto(nomeAdd, precoAdd, IdAdd, corAdd, tamanhoAdd);
                  gerenciador.adicionarProduto(novoProdutoAdd);
                  System.out.println();
                  break;

              case "Consultar":
                  System.out.println("Digite o nome do produto para consultar: ");
                  String idConsulta = scan.nextLine();
                  Produto produtoConsultado = gerenciador.consultaProduto(idConsulta);
                  if (produtoConsultado != null) {
                      System.out.println("Produto encontrado: " + produtoConsultado);
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
                  System.out.println("Digite o id do produto para alterar os dados: ");
                    String idAtualiza = scan.nextLine();
                  System.out.println("Digite a cor do produto para alterar os dados: ");
                    String corAtualiza = scan.nextLine();
                  System.out.println("Digite o tamanho do produto para alterar os dados: ");
                    String tamanhoAtualiza = scan.nextLine();

                  scan.nextLine();
                  gerenciador.AlterarDados(nomeAtualiza, precoAtualiza, idAtualiza, corAtualiza, tamanhoAtualiza);
                  System.out.println();
                  break;

              case "Excluir Dados":
                  System.out.println("Digite o nome do produto para excluir os dados: ");
                  String idExclui = scan.nextLine();
                  gerenciador.excluirProduto(idExclui);
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
}  //chave switch
  }  // chave while
   }   //chave main
} //chave public class
  