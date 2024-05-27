import java.util.ArrayList;
import java.util.List;

public class Gerenciadordeproduto {
    private List<Produto> produtos;

    public Gerenciadordeproduto() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void atualizarProduto(String nome, double novoPreco) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produto.setPreco(novoPreco);
            System.out.println("Produto atualizado: " + produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void excluirProduto(String nome) {
        Produto produto = buscarProduto(nome);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto excluído: " + produto);
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public List<Produto> listarTodosProdutos() {
        return produtos;
    }
}