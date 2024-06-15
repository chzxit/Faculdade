import java.awt.BorderLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListarProdutobtn extends JFrame {
    final Gerenciadordeproduto gerenciador;
    DecimalFormat df = new DecimalFormat("#.##");

    public ListarProdutobtn(Gerenciadordeproduto gerenciador){
        this.gerenciador = gerenciador;
        initUI();
    }

    private void initUI(){
        this.setTitle("Listar Produtos");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        ArrayList<Produto> produtos = gerenciador.listarProdutos();
        for(Produto produto : produtos ){
            StringBuilder produtoStr = new StringBuilder();
            double imposto = produto.calcImpost();
            double preco = produto.getPreco();
            
            produtoStr.append("--\n");
            produtoStr.append("Nome: ").append(produto.getNome()).append("\n");
            produtoStr.append("Preço: ").append(df.format(preco)).append("\n");
            produtoStr.append("ID: ").append(produto.getId()).append("\n");
            produtoStr.append("Cor: ").append(produto.getCor()).append("\n");
            produtoStr.append("Tamanho: ").append(produto.getTamanho()).append("\n");
            produtoStr.append("Tipo: ").append(produto.getTipo()).append("\n");
            produtoStr.append("Valor imposto: ").append(df.format(imposto)).append("\n");
            produtoStr.append("Valor total: ").append(df.format(preco + imposto)).append("\n");
            produtoStr.append("--\n");

            textArea.append(produtoStr.toString());
        }
    }
}