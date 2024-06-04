import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ListarProdutobtn extends JFrame {

   
    private Gerenciadordeproduto gerenciador;

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
            textArea.append(produto.toString()+ "/n");
        }
    }

}
