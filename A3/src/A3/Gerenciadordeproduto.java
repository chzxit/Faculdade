package A3;

import java.util.ArrayList;

public class Gerenciadordeproduto {

    private ArrayList<Produto> produtos;

    public Gerenciadordeproduto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            produto.ImprimirDetalhes();
        }
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
}