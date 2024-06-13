import java.util.ArrayList;


public class Gerenciadordeproduto {

    private static ArrayList<Produto> produtos;

    public Gerenciadordeproduto() {
        produtos = new ArrayList<>();
    }
   
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public ArrayList<Produto> listarProdutos() {
        ArrayList<Produto> listaCompletada = new ArrayList<>();
        for (Produto produto : produtos) {
            listaCompletada.add(produto);
            System.out.println("Informações do Produto:");
            produto.exibirInfo();
            System.out.println("Imposto: " + (produto.CalcImpost()+ produto.getPreco()));
        }
        return listaCompletada;
    }

    public void removerProduto(String id) {
        produtos.removeIf(produto -> produto.getId().equals(id));
    }

    public Produto buscarProduto(String id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    public boolean alterarProduto(String id, String novoNome, double novoPreco, String novaCor, String novoTamanho) {
        Produto produto = buscarProduto(id);
        if (produto != null) {
            produto.setNome(novoNome);
            produto.setPreco(novoPreco);
            produto.setCor(novaCor);
            produto.setTamanho(novoTamanho);
            return true;
        }
        return false;
     }

    
     
}