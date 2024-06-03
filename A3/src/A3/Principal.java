package A3;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Gerenciadordeproduto gerenciador = new Gerenciadordeproduto();
        Scanner scan = new Scanner(System.in);
        new Janela();

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Calça");
            System.out.println("2. Adicionar Camisa");
            System.out.println("3. Adicionar Vestido");
            System.out.println("4. Listar Produtos");
            System.out.println("5. Remover Produto");
            System.out.println("6. Buscar Produto");
            System.out.println("0. Sair");

            int opcao = scan.nextInt();
            scan.nextLine(); 

            switch (opcao) {
                case 1:
                    Roupas calca = Roupas.lerRoupas(Calca.class, scan);
                    gerenciador.adicionarProduto(calca);
                    System.out.println();
                    calca.ImprimirDetalhes();
                    System.out.println();
                    break;
                case 2:
                    Roupas camisa = Roupas.lerRoupas(Camisa.class, scan);
                    gerenciador.adicionarProduto(camisa);
                    System.out.println();
                    camisa.ImprimirDetalhes();
                    System.out.println();
                    break;
                case 3:
                    Roupas vestido = Roupas.lerRoupas(Vestido.class, scan);
                    gerenciador.adicionarProduto(vestido);
                    System.out.println();
                    vestido.ImprimirDetalhes();
                    System.out.println();
                    break;
                case 4:
                    gerenciador.listarProdutos();
                    break;
                case 5:
                    System.out.println("Digite o ID do produto a ser removido:");
                    String idRemover = scan.nextLine();
                    gerenciador.removerProduto(idRemover);
                    break;
                case 6:
                    System.out.println("Digite o ID do produto a ser buscado:");
                    String idBuscar = scan.nextLine();
                    Produto produto = gerenciador.buscarProduto(idBuscar);
                    if (produto != null) {
                        produto.ImprimirDetalhes();
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 0:
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}