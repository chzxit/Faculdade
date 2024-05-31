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

    public Produto consultaProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void AlterarDados(String novoNome, double novoPreco, String id, String novaCor, String novoTamanho) {
        Produto produto = consultaProduto(id);
        // != é o operador de desigualdade.Se os valores comparados forem diferentes, a expressão retorna true; caso contrário, retorna false. Neste caso se `Produto` for diferente de `null` retornara `Verdadeiro` e se for igual a `Null` retornara `Falso` 
        if (produto != null) { 
            produto.setPreco(novoPreco);
            produto.setCor(novaCor);
            produto.setTamanho(novoTamanho);
            produto.setNome(novoNome);
            System.out.println("Dados atualizado: " + produto);
        } 
        else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void excluirProduto(String id) {
        Produto produto = consultaProduto(id);
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