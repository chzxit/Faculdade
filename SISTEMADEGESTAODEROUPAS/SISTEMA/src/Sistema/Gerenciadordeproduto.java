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
        return new ArrayList<>(produtos);
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

    

    private double calcularImposto(String tipo) {
        double imposto = 0.0;
        switch (tipo.toLowerCase()) {
            case "calca":
                imposto = 0.12;
                break;
            case "camisa":
                imposto = 0.11;
                break;
            case "vestido":
                imposto = 0.10;
                break;
            default:
                imposto = 0.0; // Sem imposto para outros tipos
        }
        return imposto;
    }


    public boolean alterarProduto(String id, String nome, double preco, String cor, String tamanho, String tipo) {
        Produto produto = buscarProduto(id);
        if (produto!= null) {
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setCor(cor);
            produto.setTamanho(tamanho);
            produto.setTipo(tipo);
            double imposto = calcularImposto(tipo);
            produto.setimposto(imposto);

            return true;
        }
        return false;
    }

  
   
}