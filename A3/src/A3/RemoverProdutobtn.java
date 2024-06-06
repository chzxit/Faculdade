import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.util.List;

public class RemoverProdutobtn extends JFrame {

    private Gerenciadordeproduto gerenciador;

    public RemoverProdutobtn(Gerenciadordeproduto gerenciador) {
        this.gerenciador = gerenciador;
        initUI();
    }

    private void initUI() {
        setTitle("Remover Produto");
        setSize(400, 300);
        setLocationRelativeTo(null);

        List<Produto> produtos = gerenciador.listarProdutos();

        JList<Produto> list = new JList<>(produtos.toArray(new Produto[0]));
        for(Produto produto : produtos ){
            StringBuilder produtoStr = new StringBuilder();
            produtoStr.append("--");
            produtoStr.append("ID: " + produto.getId() + "\n");
        }
        add(new JScrollPane(list), BorderLayout.CENTER);

        JButton removeButton = new JButton("Remover Selecionado");
        removeButton.addActionListener(e -> {
            int selectedIndex = list.getSelectedIndex();
            if (selectedIndex!= -1) {
                Produto produtoSelecionado = list.getSelectedValue();
                String idDoProduto = produtoSelecionado.getId(); // O
                gerenciador.removerProduto(idDoProduto); 
                JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");
                list.setListData(gerenciador.listarProdutos().toArray(new Produto[0])); 
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, selecione um produto para remover.", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(removeButton);
        add(buttonPanel, BorderLayout.SOUTH);
        
    }
}
